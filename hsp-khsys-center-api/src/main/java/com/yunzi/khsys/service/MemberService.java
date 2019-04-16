package com.yunzi.khsys.service;

import com.deepexi.util.pageHelper.PageBean;
import com.yunzi.khsys.domain.eo.Member;
import java.util.*;

public interface MemberService {

    PageBean<Member> findPage(Member eo, Integer page, Integer size);

    List<Member> findAll(Member eo);

    Member detail(String pk);

    Boolean update(String pk, Member eo);

    Boolean create(Member eo);

    Boolean delete(String... pk);

    List<Member> forSelect(Member eo);
}