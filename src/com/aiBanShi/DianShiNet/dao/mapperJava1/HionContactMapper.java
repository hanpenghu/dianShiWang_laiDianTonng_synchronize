package com.aiBanShi.DianShiNet.dao.mapperJava1;

import com.aiBanShi.DianShiNet.dto.HionContact;
import com.aiBanShi.DianShiNet.dto.HionContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HionContactMapper {
    long countByExample(HionContactExample example);

    int deleteByExample(HionContactExample example);

    int deleteByPrimaryKey(Integer recid);

    int insert(HionContact record);

    int insertSelective(HionContact record);

    List<HionContact> selectByExample(HionContactExample example);

    HionContact selectByPrimaryKey(Integer recid);

    int updateByExampleSelective(@Param("record") HionContact record, @Param("example") HionContactExample example);

    int updateByExample(@Param("record") HionContact record, @Param("example") HionContactExample example);

    int updateByPrimaryKeySelective(HionContact record);

    int updateByPrimaryKey(HionContact record);

    int updateContact(HionContact hionContact);

    int updateMobel(HionContact hionContact);

    int updateAddr(HionContact hionContact);

    int updateQq(HionContact hionContact);

    int updateEmail(HionContact hionContact);
}