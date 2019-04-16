package com.yunzi.khsys.service;

import com.deepexi.util.pageHelper.PageBean;
import com.yunzi.khsys.domain.eo.MortgageSchedule;
import java.util.*;

public interface MortgageScheduleService {

    PageBean<MortgageSchedule> findPage(MortgageSchedule eo, Integer page, Integer size);

    List<MortgageSchedule> findAll(MortgageSchedule eo);

    MortgageSchedule detail(String pk);

    Boolean update(String pk, MortgageSchedule eo);

    Boolean create(MortgageSchedule eo);

    Boolean delete(String... pk);
}