package pl.uj.jwzp.security;

import lombok.Getter;

public enum AccessLevel  {
    BANNED(Values.BANNED_VALUE),
    UNVERIFIED(Values.UNVERIFIED_VALUE),
    USER(Values.USER_VALUE),
    ADMIN(Values.ADMIN_VALUE);

    private class Values {
        private static final String BANNED_VALUE = "BANNED";
        private static final String UNVERIFIED_VALUE = "UNVERIFIED";
        private static final String USER_VALUE = "USER";
        private static final String ADMIN_VALUE = "ADMIN";
    }

    @Getter
    private String name;

    AccessLevel(String name) {
        this.name = name;
    }
}
