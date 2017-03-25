package com.wsh.designmodes.prototype.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/25.
 */

public class DailyWeek implements Cloneable{
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DailyWeek{" +
               "name='" + name + '\'' +
               ", date='" + date + '\'' +
               ", content='" + content + '\'' +
               '}';
    }

    public Object clone(){
        Object object = null;
        try{
            object=super.clone();
            return object;
        } catch (Exception e){
            XLog.e("不支持克隆！");
            return null;
        }
    }
}
