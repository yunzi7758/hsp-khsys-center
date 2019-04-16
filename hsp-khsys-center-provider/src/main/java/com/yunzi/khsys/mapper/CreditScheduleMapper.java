package com.yunzi.khsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzi.khsys.domain.eo.CreditSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CreditScheduleMapper extends BaseMapper<CreditSchedule> {

    List<CreditSchedule> findList(@Param("eo") CreditSchedule eo);

    int deleteByIds(@Param("pks") String... pks);
}
