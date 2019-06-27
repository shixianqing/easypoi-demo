package com.insuresmart.easypoidemo.mapper.base;

public interface BaseMapper<D> {

    int deleteByPrimaryKey(Integer id);

    int insert(D domain);

    int insertSelective(D domain);

    D selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(D record);

    int updateByPrimaryKey(D record);

    }
