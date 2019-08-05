package com.insuresmart.easypoidemo.mapper;

import com.insuresmart.easypoidemo.model.Bill;
import com.insuresmart.easypoidemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


/**
* BillMapperExt接口
* Created by shixianqing on 2019/6/30.
*/


/**
* BillMapperExt接口
* @auther shixianqing
* @createTime 2019/6/30.
*/
@Mapper
public interface BillMapperExt extends BaseMapper<Bill> {

    List<Bill> pageQuery(Bill record);

}