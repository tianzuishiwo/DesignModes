package com.wsh.designmodes.singleton.practise1;

/**
 * Created by laobai on 2017/3/25.
 */

public class User {
    private User() {
    }

    private static class SINGLETON{
        private static final User INSTANCE = new User();
    }

    public static User getInstance(){
        return SINGLETON.INSTANCE;
    }
}
