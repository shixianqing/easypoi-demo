package com.insuresmart.easypoidemo.service.impl;

import com.insuresmart.easypoidemo.service.BillService;
import com.insuresmart.easypoidemo.mapper.BillMapperExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insuresmart.easypoidemo.model.Bill;
import java.util.List;

/**
* BillServiceImpl
* @author:shixianqing
* @ctime: 2019/6/30
*/
@Service
public class BillServiceImpl implements BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillServiceImpl.class);

    @Autowired
    private BillMapperExt repository;

    /**
    * 增加
    * @param:entity
    */
    @Override
    public void save(Bill entity){

    }

    /**
    * 删除
    * @param:entity
    */
    @Override
    public void delete(Bill entity){

    }

    /**
    * 修改
    * @param:entity
    */
    @Override
    public void update(Bill entity){

    }

    /**
    * 列表查询
    * @param:entity
    */
    @Override
    public List<Bill> list(Bill entity){

        return null;
    }


}