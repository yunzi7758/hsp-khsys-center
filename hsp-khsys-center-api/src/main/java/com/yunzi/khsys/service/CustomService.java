package com.yunzi.khsys.service;

import com.deepexi.util.pageHelper.PageBean;
import com.yunzi.khsys.domain.eo.Custom;
import java.util.*;

public interface CustomService {

    PageBean<Custom> findPage(Custom eo, Integer page, Integer size);

    List<Custom> findAll(Custom eo);

    Custom detail(String pk);

    Boolean update(String pk, Custom eo);

    Boolean create(Custom eo);

    Boolean delete(String... pk);
}