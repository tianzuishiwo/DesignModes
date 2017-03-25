package com.wsh.designmodes.prototype.practise2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by laobai on 2017/3/25.
 */

public class DailWeekV2 implements Serializable{
    private String name;
    private String date;
    private String content;
    private AttachMent mAttachMent;

    @Override
    public String toString() {
        return "DailWeekV2{" +
               "name='" + name + '\'' +
               ", date='" + date + '\'' +
               ", content='" + content + '\'' +
               ", mAttachMent=" + mAttachMent.toString() +
               '}';
    }

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

    public AttachMent getAttachMent() {
        return mAttachMent;
    }

    public void setAttachMent(AttachMent attachMent) {
        mAttachMent = attachMent;
    }

    public DailWeekV2 clone(){
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos;
        try {
            oos= new ObjectOutputStream(bos);
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Object object = ois.readObject();
            return (DailWeekV2) object;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
