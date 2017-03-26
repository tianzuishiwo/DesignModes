package com.wsh.designmodes.command.practise1;

/**
 * Created by laobai on 2017/3/27.
 */

public class KeyWord {
    private Command mCommand;

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void excute(){
        mCommand.excute();
    }
}
