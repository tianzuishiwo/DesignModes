package com.wsh.designmodes.command;

import com.wsh.designmodes.command.practise1.Command;
import com.wsh.designmodes.command.practise1.KeyWord;
import com.wsh.designmodes.command.practise1.OffCommand;
import com.wsh.designmodes.command.practise1.OpenCommand;

/**
 * Created by laobai on 2017/3/26.
 */

public class CommandTest {
    private CommandTest() {
    }

    private static class SINGLETON{
        private static final CommandTest INSTANCE = new CommandTest();
    }

    public static CommandTest getInstance(){
        return SINGLETON.INSTANCE;
    }

    public void test(){
        testPractise1();
    }

    private void testPractise1() {
        Command open;
        Command off;

        open = new OpenCommand();
        off = new OffCommand();

        KeyWord keyWord = new KeyWord();
        keyWord.setCommand(open);
        keyWord.excute();

        keyWord.setCommand(off);
        keyWord.excute();
    }
}
