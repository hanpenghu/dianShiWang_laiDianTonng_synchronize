package com.aiBanShi.DianShiNet.dao.mapperJava1;

import com.aiBanShi.DianShiNet.dto.HionContact;
import com.aiBanShi.DianShiNet.dto.HionCustomer;
import com.aiBanShi.DianShiNet.dto.HionCustomerExample;
import java.util.List;

import com.aiBanShi.DianShiNet.dto.OneNvarchar;
import org.apache.ibatis.annotations.Param;

public interface HionCustomerMapper {
    long countByExample(HionCustomerExample example);

    int deleteByExample(HionCustomerExample example);

    int deleteByPrimaryKey(Integer recid);

    int insert(HionCustomer record);

    int insertSelective(HionCustomer record);

    List<HionCustomer> selectByExampleWithBLOBs(HionCustomerExample example);

    List<HionCustomer> selectByExample(HionCustomerExample example);

    HionCustomer selectByPrimaryKey(Integer recid);

    int updateByExampleSelective(@Param("record") HionCustomer record, @Param("example") HionCustomerExample example);

    int updateByExampleWithBLOBs(@Param("record") HionCustomer record, @Param("example") HionCustomerExample example);

    int updateByExample(@Param("record") HionCustomer record, @Param("example") HionCustomerExample example);

    int updateByPrimaryKeySelective(HionCustomer record);

    int updateByPrimaryKeyWithBLOBs(HionCustomer record);

    int updateByPrimaryKey(HionCustomer record);


    List<OneNvarchar> selectAllNotNullKhbh();

    int updateZdy2(HionCustomer hionCustomer);
}