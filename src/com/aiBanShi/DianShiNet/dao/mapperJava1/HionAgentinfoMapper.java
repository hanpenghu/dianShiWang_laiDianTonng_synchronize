package com.aiBanShi.DianShiNet.dao.mapperJava1;

import com.aiBanShi.DianShiNet.dto.HionAgentinfo;
import com.aiBanShi.DianShiNet.dto.HionAgentinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HionAgentinfoMapper {
    long countByExample(HionAgentinfoExample example);

    int deleteByExample(HionAgentinfoExample example);

    int deleteByPrimaryKey(Integer recid);

    int insert(HionAgentinfo record);

    int insertSelective(HionAgentinfo record);

    List<HionAgentinfo> selectByExample(HionAgentinfoExample example);

    HionAgentinfo selectByPrimaryKey(Integer recid);

    int updateByExampleSelective(@Param("record") HionAgentinfo record, @Param("example") HionAgentinfoExample example);

    int updateByExample(@Param("record") HionAgentinfo record, @Param("example") HionAgentinfoExample example);

    int updateByPrimaryKeySelective(HionAgentinfo record);

    int updateByPrimaryKey(HionAgentinfo record);
}