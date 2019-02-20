package com.morgage.common;

import org.springframework.core.env.Environment;

public class Const {


    private static Environment env;

    public static class USER_ROLE {
        public static final String USER = "USER";
        public static final String ADMIN = "ADMIN";
        public static final String ORG_HEAD = "ORG_HEAD";
        public static final String ORG_MEMBER = "ORG_MEMBER";
        public static final String ORG_ADMIN = "ORG_ADMIN";
        public static final String ORG_UNPREPARED = "ORG_UNPREPARED";
    }

    public static class USER_STATUS {
        public static final Integer ACTIVE = 1;
        public static final Integer DEACTIVE = 2;
    }

}
