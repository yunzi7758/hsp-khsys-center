package com.yunzi.khsys.util;

import com.deepexi.util.IdGenerator;

public class IdUtils {


    public static String getId() {
//        String uuid = CommonUtils.uuid();
//        String randomString = StringUtil.getRandomString(32 - uuid.length());
//        return uuid+randomString;
        return IdGenerator.getNumberId();
    }
}
