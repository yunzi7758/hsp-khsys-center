package com.yunzi.khsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzi.khsys.domain.eo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {

    List<Member> findList(@Param("eo") Member eo);

    int deleteByIds(@Param("pks") String... pks);
}
