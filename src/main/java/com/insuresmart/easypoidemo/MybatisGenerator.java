package com.insuresmart.easypoidemo;


import com.src.common.util.MybatisGeneratorUtil;
import com.src.common.util.PropertiesFileUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:sxq
 * @Date: 2019/6/23
 * @Description:
 */
public class MybatisGenerator {

    //Model + ModelExample 存放的路径和包名
    /**
     * 项目名
     */
    private static String targetProject = "easypoi-demo";

    private static String controllerPack = "com.insuresmart.easypoidemo.controller";

    private static String servicePack = "com.insuresmart.easypoidemo.service";

    private static String serviceImplPack = "com.insuresmart.easypoidemo.service.impl";

    /**
     * model存放路径
     */
    private static String modelPack = "com.insuresmart.easypoidemo.model";

    //Mapper.java + Mapper.xml 存放路径和包名

    /**
     * mapper文件存放包名
     */
    private static String mapperPack = "com.insuresmart.easypoidemo.mapper";


    /**
     * mapperxml存放路径，resources下
     */
    private static String sqlmapperPack = "mapper";


    /**
     * 数据库名
     */
    private static String DATABASE = "tpa";

    /**
     * 需要生成的数据表前缀
     */
    private static String TABLE_PREFIX = "";

    /**
     * 指定需要生成的某个表auth_role，与TABLE_PREFIX二选一
     */
    private static String TABLE_NAME = "bill";

    /**
     * 创建人
     */
    private static String author = "shixianqing";
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");


    /**
     *  需要insert后返回主键的表配置，key:表名,value:主键名
     */
    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();

    static {
        //TODO ..
        LAST_INSERT_ID_TABLES.put("bill", "id");
    }

    /**
     * 自动代码生成
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {

        MybatisGeneratorUtil.generator(
                null,
                targetProject,
                modelPack, mapperPack, sqlmapperPack,
                controllerPack,servicePack,serviceImplPack,
                JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD,
                DATABASE, TABLE_PREFIX, TABLE_NAME,LAST_INSERT_ID_TABLES, author
        );
    }

}
