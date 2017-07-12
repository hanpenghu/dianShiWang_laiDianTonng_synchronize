package com.aiBanShi.DianShiNet.dao.mapperJava1;

import com.aiBanShi.DianShiNet.dto.FiveStrAndFiveInt;
import com.aiBanShi.DianShiNet.dto.HionDuty2015;
import com.aiBanShi.DianShiNet.dto.HionDuty2015Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HionDuty2015Mapper {
    long countByExample(HionDuty2015Example example);

    int deleteByExample(HionDuty2015Example example);

    int deleteByPrimaryKey(Integer recid);

    int insert(HionDuty2015 record);

    int insertSelective(HionDuty2015 record);

    List<HionDuty2015> selectByExample(HionDuty2015Example example);

    HionDuty2015 selectByPrimaryKey(Integer recid);

    int updateByExampleSelective(@Param("record") HionDuty2015 record, @Param("example") HionDuty2015Example example);

    int updateByExample(@Param("record") HionDuty2015 record, @Param("example") HionDuty2015Example example);

    int updateByPrimaryKeySelective(HionDuty2015 record);

    int updateByPrimaryKey(HionDuty2015 record);

    int updateOrdercol(FiveStrAndFiveInt fsfi);
}