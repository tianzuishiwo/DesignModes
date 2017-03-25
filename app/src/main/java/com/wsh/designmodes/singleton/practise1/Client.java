package com.wsh.designmodes.singleton.practise1;

/**
 * Created by laobai on 2017/3/25.
 */

public class Client {
    private static Client instance;

    private Client() {
    }

    public static Client getInstance(){
        if (instance == null){
            synchronized (Client.class){
                if (instance==null){
                    instance = new Client();
                }
            }
        }

        return instance;
    }
}
