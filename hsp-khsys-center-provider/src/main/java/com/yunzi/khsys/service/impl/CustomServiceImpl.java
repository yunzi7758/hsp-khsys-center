package com.yunzi.khsys.service.impl;
import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.util.StringUtil;
import com.yunzi.khsys.domain.eo.Member;
import com.yunzi.khsys.mapper.MemberMapper;
import com.yunzi.khsys.service.CustomService;
import com.yunzi.khsys.domain.eo.Custom;
import com.yunzi.khsys.extension.AppRuntimeEnv;
import com.yunzi.khsys.mapper.CustomMapper;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
@Service(version = "$ {demo.service.version}")
public class CustomServiceImpl implements CustomService {

    private static final Logger logger = LoggerFactory.getLogger(CustomServiceImpl.class);

    @Autowired
    private CustomMapper CustomMapper;

    @Autowired
    private AppRuntimeEnv appRuntimeEnv;

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public PageBean findPage(Custom eo, Integer page, Integer size) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        PageHelper.startPage(page, size);
        List<Custom> list = CustomMapper.findList(eo);
        return new PageBean<>(list);
    }

    @Override
    public List<Custom> findAll(Custom eo) {
        eo.setTenantCode(appRuntimeEnv.getTenantId());
        List<Custom> list = CustomMapper.findList(eo);
        return list;
    }
    @Override
    public Custom detail(String pk) {
        return CustomMapper.selectById(pk);
    }

    @Override
    @Transactional
    public Boolean create(Custom eo) {
        eo.setBaseFeild(eo.getCreatedBy(),appRuntimeEnv.getTenantId());
        if (StringUtil.isNotEmpty(eo.getManagerId())){
            if (eo.getTenantCode().equals(eo.getManagerId())){
                return false;
            }

            Member q = new Member();
            q.setUsername(eo.getManagerId());

            Member member = memberMapper.findList(q).get(0);
            eo.setManagerName(member.getRemark1());

            insertNewCustom(eo,null);
        }
        int result = CustomMapper.insert(eo);
        if (result > 0) {
            gjjl(eo);
            return true;
        }
        return false;
    }

    private void gjjl(Custom eo) {
        if (StringUtil.isNotEmpty(eo.getManagerName())){

        }
    }

    @Override
    @Transactional
    public Boolean update(String pk,Custom eo) {
        Custom detail = detail(pk);
        if (StringUtil.isNotEmpty(eo.getManagerId())){
            if (detail.getTenantCode().equals(eo.getManagerId())){
                return false;
            }


            Member q = new Member();
            q.setUsername(eo.getManagerId());

            Member member = memberMapper.findList(q).get(0);
            eo.setManagerName(member.getRemark1());


            insertNewCustom(detail,eo);
        }


        eo.setId(pk);
        int result = CustomMapper.updateById(eo);
        if (result > 0) {
            gjjl(eo);
            return true;
        }
        return false;
    }

    private boolean insertNewCustom(Custom orig,Custom update) {

        Custom eo = new Custom();

        BeanUtils.copyProperties(orig,eo);
        if (null != update){
            BeanUtils.copyProperties(update,eo);

            eo.setBaseFeild("",update.getManagerId());
        }else {
            eo.setBaseFeild("",orig.getManagerId());
        }

//        eo.setType(orig.getType());
//        eo.setName(orig.getName());
//        eo.setMobilePhone(orig.getMobilePhone());
//        eo.setHouse(orig.getHouse());
//        eo.setHouseDetail(orig.getHouseDetail());
//        eo.setConditions(orig.getConditions());
//        eo.setLiability(orig.getLiability());
//        eo.setMold(orig.getMold());
//        eo.setNeedTime(orig.getNeedTime());
//        eo.setProblem(orig.getProblem());
//        eo.setTrancStatus(orig.getTrancStatus());


        eo.setManagerName("");
        eo.setManagerId("");
        int result = CustomMapper.insert(eo);
        if (result > 0) {
            gjjl(eo);
            return true;
        }


        return false;
    }

    @Override
    public Boolean delete(String...pk) {
        int result = CustomMapper.deleteByIds(pk);
        if (result > 0) {
            return true;
        }
        return false;
    }

}