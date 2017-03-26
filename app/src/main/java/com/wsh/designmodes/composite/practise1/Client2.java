package com.wsh.designmodes.composite.practise1;

import com.wsh.designmodes.XLog;

/**
 * Created by laobai on 2017/3/26.
 */

public class Client2 {
    public void init(){
        Folder1 folder1;
        Folder2 folder2;
        File1 file1;
        File2 file2;
        File3 file3;

        folder1=new Folder1("一把手");
        folder2=new Folder2("二把手");
        file1=new File1("狗腿一");
        file2=new File2("狗腿二");
        file3=new File3("狗腿三");

        folder1.addComponent(file1);
        folder1.addComponent(folder2);

        folder2.addComponent(file2);
        folder2.addComponent(file3);

        folder1.opration();
        XLog.i("=====================================");
        XLog.i("=====================================");
        XLog.i("=====================================");
        folder2.opration();
    }
}
