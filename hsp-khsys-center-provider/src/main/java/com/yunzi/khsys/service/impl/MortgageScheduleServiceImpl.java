package com.yunzi.khsys.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.util.StringUtil;
import com.yunzi.khsys.domain.eo.Custom;
import com.yunzi.khsys.domain.eo.Member;
import com.yunzi.khsys.mapper.CustomMapper;
import com.yunzi.khsys.mapper.MemberMapper;
import com.yunzi.khsys.service.MortgageScheduleService;
import com.yunzi.khsys.domain.eo.MortgageSchedule;
import com.yunzi.khsys.extension.AppRuntimeEnv;
import com.yunzi.khsys.mapper.MortgageScheduleMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "$ {demo.service.version}")
public class MortgageScheduleServiceImpl implements MortgageScheduleService {

    private static final Logger logger = LoggerFactory.getLogger(MortgageScheduleServiceImpl.class);

    @Autowired
    private MortgageScheduleMapper MortgageScheduleMapper;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private CustomMapper customMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(MortgageSchedule eo, Integer page, Integer size) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        PageHelper.startPage(page, size);
        List<MortgageSchedule> list = MortgageScheduleMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<MortgageSchedule> findAll(MortgageSchedule eo) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        List<MortgageSchedule> list = MortgageScheduleMapper.findList(eo);
        return list;
    }
    @Override
    public MortgageSchedule detail(String pk) {
        return MortgageScheduleMapper.selectById(pk);
    }

    @Override
    public Boolean create(MortgageSchedule eo) {
        if (StringUtil.isNotEmpty(eo.getBusineserId())){
            Member q = new Member();
            q.setUsername(eo.getBusineserId());

            Member member = memberMapper.findList(q).get(0);
            eo.setBusineserName(member.getRemark1());
        }

        if (StringUtil.isNotEmpty(eo.getCustomId())){
            Custom custom = customMapper.selectById(eo.getCustomId());
            eo.setCustomName(custom.getName());
        }
        eo.setBaseFeild(eo.getCreatedBy(),appRuntimeEnv.getTenantId());
        int result = MortgageScheduleMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,MortgageSchedule eo) {
        if (StringUtil.isNotEmpty(eo.getBusineserId())){
            Member q = new Member();
            q.setUsername(eo.getBusineserId());

            Member member = memberMapper.findList(q).get(0);
            eo.setBusineserName(member.getRemark1());
        }

        if (StringUtil.isNotEmpty(eo.getCustomId())){
            Custom custom = customMapper.selectById(eo.getCustomId());
            eo.setCustomName(custom.getName());
        }
        eo.setId(pk);
        int result = MortgageScheduleMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = MortgageScheduleMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}