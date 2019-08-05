package com.insuresmart.easypoidemo.service;
import com.insuresmart.easypoidemo.model.Bill;
import java.util.List;


/**
* BillService
* @author:shixianqing
* @ctime: 2019/6/30
*/
public interface BillService  {

    /**
    * 增加
    * @param:entity
    */
    void save(Bill entity);

    /**
    * 删除
    * @param:entity
    */
    void delete(Bill entity);

    /**
    * 修改
    * @param:entity
    */
    void update(Bill entity);

    /**
    * 列表查询
    * @param:entity
    */
    List<Bill> list(Bill entity);

}