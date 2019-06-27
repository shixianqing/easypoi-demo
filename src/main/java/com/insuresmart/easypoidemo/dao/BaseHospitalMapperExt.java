package com.insuresmart.easypoidemo.dao;

import com.insuresmart.easypoidemo.model.BaseHospital;
import com.insuresmart.easypoidemo.dao.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List


/**
* BaseHospitalMapperExt接口
* Created by shixianqing on 2019/6/27.
*/
@Mapper
public interface BaseHospitalMapperExt extends BaseMapper<BaseHospital> {

    List<BaseHospital> pageQuery(BaseHospital record);

}