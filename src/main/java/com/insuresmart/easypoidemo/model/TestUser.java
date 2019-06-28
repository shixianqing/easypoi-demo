package com.insuresmart.easypoidemo.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * create by :shixianqing  2019/6/28
 *
 * @mbg.generated
 */
@Data
@Builder
@ToString
public class TestUser implements Serializable {

    private Integer id;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 年龄
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     * 性别
     *
     * @mbg.generated
     */
    private String sex;

    private static final long serialVersionUID = 1L;

}