package com.insuresmart.easypoidemo.controller;

import com.excel.poi.ExcelBoot;
import com.excel.poi.entity.ErrorEntity;
import com.excel.poi.function.ExportFunction;
import com.excel.poi.function.ImportFunction;
import com.github.pagehelper.PageHelper;
import com.insuresmart.easypoidemo.consts.HospitalConsts;
import com.insuresmart.easypoidemo.consts.HospitalEnum;
import com.insuresmart.easypoidemo.excel.TestUserExcel;
import com.insuresmart.easypoidemo.mapper.BaseHospitalMapperExt;
import com.insuresmart.easypoidemo.dto.HospitalDto;
import com.insuresmart.easypoidemo.excel.BaseHospitalExcel;
import com.insuresmart.easypoidemo.mapper.TestUserMapperExt;
import com.insuresmart.easypoidemo.model.BaseHospital;
import com.insuresmart.easypoidemo.model.TestUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Author:shixianqing
 * @Date:2019/6/27 18:47
 * @Description:
 **/
@RestController
@RequestMapping(value = "/hospital")
@Slf4j
@Api(tags = "医院控制")
public class TestController {

    @Autowired
    private BaseHospitalMapperExt hospitalMapperExt;

    @Autowired
    private TestUserMapperExt userMapperExt;

    /**
     * excel导出浏览器
     * @param response
     */
    @GetMapping("/export")
    @ApiOperation(value = "导出")
    public void export(HttpServletResponse response){
        HospitalDto hospitalDto = HospitalDto.builder().build();
        ExcelBoot.ExportBuilder(response,"医院", BaseHospitalExcel.class,
                HospitalConsts.DEFAULT_PAGE_SIZE,HospitalConsts.DEFAULT_ROW_ACCESS_WINDOW_SIZE,
                HospitalConsts.DEFAULT_RECORD_COUNT_PEER_SHEET,HospitalConsts.OPEN_AUTO_COLUM_WIDTH
        ).exportResponse(hospitalDto, new ExportFunction<HospitalDto,BaseHospital>() {

            @Override
            public List<BaseHospital> pageQuery(HospitalDto param, int pageNum, int pageSize) {
                PageHelper.startPage(pageNum,pageSize);
                List<BaseHospital> hospitals = hospitalMapperExt.selectAllHospital();
                log.info("医院数量为：{}",hospitals.size());
                return hospitals;
            }

            /**
             * 将查询到的结果集转换成excel映射实体类
             * @param queryResult
             * @return
             */
            @Override
            public Object convert(BaseHospital queryResult) {
                BaseHospitalExcel hospitalExcel = BaseHospitalExcel.builder().build();
                BeanUtils.copyProperties(queryResult,hospitalExcel);
                convertHospitalProperties(queryResult,hospitalExcel);
                return hospitalExcel;
            }
        });
    }


    /**
     * 导出文件到指定目录下
     * @throws FileNotFoundException
     */
    @GetMapping(value = "/exportToFtp")
    public void exportToFtp() throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("f:/医院.xlsx");
        ExcelBoot.ExportBuilder(fos,"医院",BaseHospitalExcel.class)
        .exportStream("", new ExportFunction<String, BaseHospital>() {
            @Override
            public List<BaseHospital> pageQuery(String param, int pageNum, int pageSize) {
                PageHelper.startPage(pageNum,pageSize);
                List<BaseHospital> hospitals = hospitalMapperExt.selectAllHospital();
                log.info("医院数量为：{}",hospitals.size());
                return hospitals;
            }

            @Override
            public Object convert(BaseHospital queryResult) {
                BaseHospitalExcel hospitalExcel = BaseHospitalExcel.builder().build();
                BeanUtils.copyProperties(queryResult,hospitalExcel);
                convertHospitalProperties(queryResult,hospitalExcel);
                return hospitalExcel;
            }
        });
    }

    /**
     * 导出模板到浏览器下载
     */
     @GetMapping("/export/template")
     public void exportTemplate(HttpServletResponse response){

         ExcelBoot.ExportBuilder(response,"用户",TestUserExcel.class)
                 .exportTemplate();
     }

     @PostMapping("/import")
     public void fileImport(MultipartFile file) throws IOException {
        ExcelBoot.ImportBuilder(file.getInputStream(),TestUserExcel.class)
                .importExcel(new ImportFunction<TestUserExcel>() {
                    @Override
                    public void onProcess(int sheetIndex, int rowIndex, TestUserExcel entity) {
                        TestUser user = TestUser.builder().build();
                        BeanUtils.copyProperties(entity,user);
                        userMapperExt.insert(user);

                    }

                    @Override
                    public void onError(ErrorEntity errorEntity) {
                        log.error(errorEntity.toString());
                    }
                });
    }

    /**
     * 医院相关标签转换
     * @param baseHospital
     * @param hospitalExcel
     */
    private void convertHospitalProperties(BaseHospital baseHospital, BaseHospitalExcel hospitalExcel) {
        hospitalExcel.setHospitalCategory(HospitalEnum.HospitalType.getCodeByName(baseHospital.getHospitalCategory()));
        hospitalExcel.setHospitalGrade(HospitalEnum.HospitalLev.getCodeByName(baseHospital.getHospitalGrade()));
        hospitalExcel.setHospitalProfession(HospitalEnum.HospitalPro.getCodeByName(baseHospital.getHospitalProfession()));
        hospitalExcel.setHospitalSubgrade(HospitalEnum.HospitalSubLev.getCodeByName(baseHospital.getHospitalSubgrade()));
        hospitalExcel.setHospitalType(HospitalEnum.HospitalNature.getCodeByName(baseHospital.getHospitalType()));
        Integer medicineType = baseHospital.getMedicareType();
        String finaMedicineType = "";
        if (medicineType != null){
            if (medicineType.equals(1)){
                finaMedicineType = "是";
            } else {
                finaMedicineType = "否";
            }
        }
        hospitalExcel.setMedicareType(finaMedicineType);

    }
}
