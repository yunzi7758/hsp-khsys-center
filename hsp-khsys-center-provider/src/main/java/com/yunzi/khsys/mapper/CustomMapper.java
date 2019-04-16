package com.yunzi.khsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzi.khsys.domain.eo.Custom;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CustomMapper extends BaseMapper<Custom> {

    List<Custom> findList(@Param("eo") Custom eo);

    int deleteByIds(@Param("pks") String... pks);
}
