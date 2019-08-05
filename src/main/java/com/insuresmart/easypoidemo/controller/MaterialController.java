package com.insuresmart.easypoidemo.controller;

import com.excel.poi.ExcelBoot;
import com.excel.poi.function.ExportFunction;
import com.github.pagehelper.PageHelper;
import com.insuresmart.easypoidemo.excel.BaseMedicalMaterial;
import com.insuresmart.easypoidemo.excel.BaseTreatment;
import com.insuresmart.easypoidemo.mapper.BaseMedicalMaterialMapperExt;
import com.insuresmart.easypoidemo.mapper.BaseTreatmentMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author:sxq
 * @Date: 2019/8/5
 * @Description:
 */
@RestController
public class MaterialController {

    @Autowired
    private BaseMedicalMaterialMapperExt medicalMaterialMapper;
    @Autowired
    private BaseTreatmentMapperExt treatmentMapper;

    @GetMapping("/material/download")
    public void dowload(HttpServletResponse response){
        ExcelBoot.ExportBuilder(response,"材料", BaseMedicalMaterial.class)
                .exportResponse(null, new ExportFunction<Object, BaseMedicalMaterial>() {


                    @Override
                    public List<BaseMedicalMaterial> pageQuery(Object param, int pageNum, int pageSize) {

                        PageHelper.startPage(pageNum,pageSize);
                        return medicalMaterialMapper.selectNotNull();
                    }

                    @Override
                    public BaseMedicalMaterial convert(BaseMedicalMaterial queryResult) {
                        return queryResult;
                    }
                });
    }

    @GetMapping("/treatment/download")
    public void dowloadTreatment(HttpServletResponse response){
        ExcelBoot.ExportBuilder(response,"诊疗", BaseTreatment.class)
                .exportResponse(null, new ExportFunction<Object, BaseTreatment>() {
                    @Override
                    public List<BaseTreatment> pageQuery(Object param, int pageNum, int pageSize) {

                        PageHelper.startPage(pageNum,pageSize);
                        return treatmentMapper.selectNotNull();
                    }

                    @Override
                    public BaseTreatment convert(BaseTreatment queryResult) {
                        return queryResult;
                    }
                });
    }
}


