package com.macro.mall.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GreePmLxDto {

    //项目信息
    private String projectName; //项目名称
    private Integer projectCataId;//项目分类ID
    private String projectCataName;//项目分类名字
    private String projectMainMan; //项目负责人
    private String joinMan;//项目成员
    private Integer important;//项目重要程度
    private String projectDesc; //项目介绍
    //计划信息
    private String planName;//计划名称
    private String planOperate;//操作人
    private Date planFinishTime;//计划完成时间
    private String planDoc;//计划文档
    private String planDesc;//计划详情,

    //项目完结信息
    private String projectCloseName;//完结人
    private Boolean projectIsClose;//是否完结
    private Integer closeStatus; //完结状态
    private Date finishTime;//项目完成时间

}
