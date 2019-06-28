package com.insuresmart.easypoidemo.mapper;

import com.insuresmart.easypoidemo.model.TestUser;
import com.insuresmart.easypoidemo.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


/**
* TestUserMapperExt接口
* Created by shixianqing on 2019/6/28.
*/
@Mapper
public interface TestUserMapperExt extends BaseMapper<TestUser> {

    List<TestUser> pageQuery(TestUser record);

}