package com.yunzi.khsys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunzi.khsys.domain.eo.Track;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TrackMapper extends BaseMapper<Track> {

    List<Track> findList(@Param("eo") Track eo);

    int deleteByIds(@Param("pks") String... pks);
}
