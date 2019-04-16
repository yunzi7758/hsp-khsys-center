package com.yunzi.khsys.service;

import com.deepexi.util.pageHelper.PageBean;
import com.yunzi.khsys.domain.eo.CreditSchedule;
import java.util.*;

public interface CreditScheduleService {

    PageBean<CreditSchedule> findPage(CreditSchedule eo, Integer page, Integer size);

    List<CreditSchedule> findAll(CreditSchedule eo);

    CreditSchedule detail(String pk);

    Boolean update(String pk, CreditSchedule eo);

    Boolean create(CreditSchedule eo);

    Boolean delete(String... pk);
}