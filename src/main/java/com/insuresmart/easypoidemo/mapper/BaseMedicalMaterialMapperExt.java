package com.insuresmart.easypoidemo.mapper;

import com.insuresmart.easypoidemo.excel.BaseMedicalMaterial;
import com.insuresmart.easypoidemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* BaseMedicalMaterialMapperExt接口
* @auther shixianqing
* @createTime 2019/8/2.
*/
@Mapper
public interface BaseMedicalMaterialMapperExt extends BaseMapper<BaseMedicalMaterial> {
    List<BaseMedicalMaterial> pageQuery(BaseMedicalMaterial record);

    int deleteMedicalMaterial(BaseMedicalMaterial medicalMaterial);


    BaseMedicalMaterial selectByName(BaseMedicalMaterial record);

    Integer selectCountByName(String name);

    String getMaxCode();

    List<BaseMedicalMaterial> selectNotNull();

}