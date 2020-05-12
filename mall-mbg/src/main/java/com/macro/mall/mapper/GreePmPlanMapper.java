package com.macro.mall.mapper;

import com.macro.mall.model.GreePmPlan;
import com.macro.mall.model.GreePmPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GreePmPlanMapper {
    long countByExample(GreePmPlanExample example);

    int deleteByExample(GreePmPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GreePmPlan record);

    int insertSelective(GreePmPlan record);

    List<GreePmPlan> selectByExample(GreePmPlanExample example);

    GreePmPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GreePmPlan record, @Param("example") GreePmPlanExample example);

    int updateByExample(@Param("record") GreePmPlan record, @Param("example") GreePmPlanExample example);

    int updateByPrimaryKeySelective(GreePmPlan record);

    int updateByPrimaryKey(GreePmPlan record);
}