package com.my.generator;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.TopLevelClass;

public class ToStringPlugin extends org.mybatis.generator.plugins.ToStringPlugin {
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        return false;
    }


}
