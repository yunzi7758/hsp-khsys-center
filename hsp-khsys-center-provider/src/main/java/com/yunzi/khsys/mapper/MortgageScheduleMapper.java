package com.yunzi.khsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzi.khsys.domain.eo.MortgageSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MortgageScheduleMapper extends BaseMapper<MortgageSchedule> {

    List<MortgageSchedule> findList(@Param("eo") MortgageSchedule eo);

    int deleteByIds(@Param("pks") String... pks);
}
