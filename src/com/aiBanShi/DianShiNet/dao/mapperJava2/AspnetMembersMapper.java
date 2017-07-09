package com.aiBanShi.DianShiNet.dao.mapperJava2;

import com.aiBanShi.DianShiNet.dto.AspnetMembers;
import com.aiBanShi.DianShiNet.dto.AspnetMembersExample;
import java.util.List;

import com.aiBanShi.DianShiNet.dto.OrderInfo;
import org.apache.ibatis.annotations.Param;

public interface AspnetMembersMapper {
    long countByExample(AspnetMembersExample example);

    int deleteByExample(AspnetMembersExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(AspnetMembers record);

    int insertSelective(AspnetMembers record);

    List<AspnetMembers> selectByExample(AspnetMembersExample example);

    AspnetMembers selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") AspnetMembers record, @Param("example") AspnetMembersExample example);

    int updateByExample(@Param("record") AspnetMembers record, @Param("example") AspnetMembersExample example);

    int updateByPrimaryKeySelective(AspnetMembers record);

    int updateByPrimaryKey(AspnetMembers record);

    List<Integer> selectAllUserId();

    List<OrderInfo> selectInfoFromOrderTabByUserId(@Param("userId") Integer userId);
}