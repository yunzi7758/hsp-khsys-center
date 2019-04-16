package com.yunzi.khsys.service;

import com.deepexi.util.pageHelper.PageBean;
import com.yunzi.khsys.domain.eo.Track;
import java.util.*;

public interface TrackService {

    PageBean<Track> findPage(Track eo, Integer page, Integer size);

    List<Track> findAll(Track eo);

    Track detail(String pk);

    Boolean update(String pk, Track eo);

    Boolean create(Track eo);

    Boolean delete(String... pk);
}