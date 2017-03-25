package com.wsh.designmodes.prototype.practise3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by laobai on 2017/3/25.
 */

public class CloneManager {
    Map<String ,IBeauty> hashMap = new HashMap<>();

    private static CloneManager instance = new CloneManager();

    public static CloneManager getInstance(){
        return instance;
    }

    public void addBeauty(String key,IBeauty beauty){
       hashMap.put(key,beauty);
    }

    public void removeBeauty(String key){
        hashMap.remove(key);
    }

    public IBeauty getBeautyClone(String key){
        return hashMap.get(key).clone();
    }
}
