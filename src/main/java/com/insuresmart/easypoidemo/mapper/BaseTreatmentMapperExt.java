package com.insuresmart.easypoidemo.mapper;

import com.insuresmart.easypoidemo.excel.BaseTreatment;
import com.insuresmart.easypoidemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
* BaseTreatmentMapperExt接口
 * @auther shixianqing
* @createTime 2019/8/2.
*/
@Mapper
public interface BaseTreatmentMapperExt extends BaseMapper<BaseTreatment> {
    List<BaseTreatment> pageQuery(BaseTreatment record);

    String getMaxCode();

    void logicalDeleteById(BaseTreatment treatment);

    BaseTreatment selectByName(BaseTreatment treatment);
    List<BaseTreatment> selectNotNull();
}