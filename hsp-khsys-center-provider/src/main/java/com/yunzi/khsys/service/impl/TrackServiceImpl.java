package com.yunzi.khsys.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.util.StringUtil;
import com.yunzi.khsys.domain.eo.Custom;
import com.yunzi.khsys.mapper.CustomMapper;
import com.yunzi.khsys.service.TrackService;
import com.yunzi.khsys.domain.eo.Track;
import com.yunzi.khsys.extension.AppRuntimeEnv;
import com.yunzi.khsys.mapper.TrackMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "$ {demo.service.version}")
public class TrackServiceImpl implements TrackService {

    private static final Logger logger = LoggerFactory.getLogger(TrackServiceImpl.class);

    @Autowired
    private TrackMapper TrackMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;
    @Autowired
    private CustomMapper customMapper;

    @Override
    public PageBean findPage(Track eo, Integer page, Integer size) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        PageHelper.startPage(page, size);
        List<Track> list = TrackMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<Track> findAll(Track eo) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        List<Track> list = TrackMapper.findList(eo);
        return list;
    }
    @Override
    public Track detail(String pk) {
        return TrackMapper.selectById(pk);
    }

    @Override
    public Boolean create(Track eo) {
        if (StringUtil.isNotEmpty(eo.getCustomId())){
            Custom custom = customMapper.selectById(eo.getCustomId());
            eo.setRemark1(custom.getName());
        }
        eo.setBaseFeild(eo.getCreatedBy(),appRuntimeEnv.getTenantId());
        int result = TrackMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,Track eo) {
        if (StringUtil.isNotEmpty(eo.getCustomId())){
            Custom custom = customMapper.selectById(eo.getCustomId());
            eo.setRemark1(custom.getName());
        }
        eo.setId(pk);
        int result = TrackMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = TrackMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}