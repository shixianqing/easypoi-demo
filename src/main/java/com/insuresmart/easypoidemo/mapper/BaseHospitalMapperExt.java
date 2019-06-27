package com.insuresmart.easypoidemo.mapper;

import com.insuresmart.easypoidemo.model.BaseHospital;
import com.insuresmart.easypoidemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


/**
* BaseHospitalMapperExt接口
* Created by shixianqing on 2019/6/27.
*/
@Mapper
public interface BaseHospitalMapperExt extends BaseMapper<BaseHospital> {

    List<BaseHospital> pageQuery(BaseHospital record);

    List<BaseHospital> selectAllHospital();

}