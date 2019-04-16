package com.yunzi.khsys.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yunzi.khsys.service.MemberService;
import com.yunzi.khsys.domain.eo.Member;
import com.yunzi.khsys.extension.AppRuntimeEnv;
import com.yunzi.khsys.mapper.MemberMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@Service(version = "$ {demo.service.version}")
public class MemberServiceImpl implements MemberService {

    private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Autowired
    private MemberMapper MemberMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Override
    public PageBean findPage(Member eo, Integer page, Integer size) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        PageHelper.startPage(page, size);
        List<Member> list = MemberMapper.findList(eo);
        return new PageBean<>(list);
    }
    @Override
    public List<Member> forSelect(Member eo) {
        List<Member> list = MemberMapper.findList(eo);
        return list;
    }
    @Override
    public List<Member> findAll(Member eo) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        List<Member> list = MemberMapper.findList(eo);
        return list;
    }
    @Override
    public Member detail(String pk) {
        return MemberMapper.selectById(pk);
    }

    @Override
    public Boolean create(Member eo) {
        eo.setBaseFeild(eo.getCreatedBy(),appRuntimeEnv.getTenantId());
        int result = MemberMapper.insert(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean update(String pk,Member eo) {
        eo.setId(pk);
        int result = MemberMapper.updateById(eo);
        if (result > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = MemberMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }



}