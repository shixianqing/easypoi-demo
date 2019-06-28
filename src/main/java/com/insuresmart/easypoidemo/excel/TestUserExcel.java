package com.insuresmart.easypoidemo.excel;

import com.excel.poi.annotation.ExportField;
import com.excel.poi.annotation.ImportField;
import lombok.*;

import java.io.Serializable;

/**
 * create by :shixianqing  2019/6/28
 *
 * @mbg.generated
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TestUserExcel implements Serializable {

    /**
     * 姓名
     *
     * @mbg.generated
     */
    @ImportField
    @ExportField(columnName = "姓名")
    private String name;

    /**
     * 年龄
     *
     * @mbg.generated
     */
    @ImportField
    @ExportField(columnName = "年龄")
    private Integer age;

    /**
     * 性别
     *
     * @mbg.generated
     */
    @ImportField
    @ExportField(columnName = "性别")
    private String sex;

    private static final long serialVersionUID = 1L;

}