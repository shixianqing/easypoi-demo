package com.insuresmart.easypoidemo.controller;

import com.excel.poi.ExcelBoot;
import com.excel.poi.function.ExportFunction;
import com.github.pagehelper.PageHelper;
import com.insuresmart.easypoidemo.consts.HospitalConsts;
import com.insuresmart.easypoidemo.consts.HospitalEnum;
import com.insuresmart.easypoidemo.dao.BaseHospitalMapperExt;
import com.insuresmart.easypoidemo.dto.HospitalDto;
import com.insuresmart.easypoidemo.excel.BaseHospitalExcel;
import com.insuresmart.easypoidemo.model.BaseHospital;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author:shixianqing
 * @Date:2019/6/27 18:47
 * @Description:
 **/
@RestController
@RequestMapping(value = "/hospital")
@Slf4j
public class HospitalController {

    @Autowired
    private BaseHospitalMapperExt hospitalMapperExt;

    /**
     * excel导出浏览器
     * @param response
     */
    public void export(HttpServletResponse response){
        HospitalDto hospitalDto = HospitalDto.builder().build();
        ExcelBoot.ExportBuilder(response,"医院.xlsx", BaseHospitalExcel.class,
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

            @Override
            public Object convert(BaseHospital queryResult) {
                BaseHospitalExcel hospitalExcel = BaseHospitalExcel.builder().build();
                BeanUtils.copyProperties(queryResult,hospitalExcel);
                convertHospitalProperties(queryResult,hospitalExcel);
                return hospitalExcel;
            }
        });
    }

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
