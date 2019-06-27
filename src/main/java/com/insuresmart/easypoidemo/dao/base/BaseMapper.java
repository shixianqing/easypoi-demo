package com.insuresmart.easypoidemo.dao.base;

import java.util.List;

public interface BaseMapper<D> {

    int deleteByPrimaryKey(Integer id);

    int insert(D domain);

    int insertSelective(D domain);

    D selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(D record);

    int updateByPrimaryKey(D record);

    }
