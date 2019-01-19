package com.zhuxinwang.nashron.day1;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 * 在Java中使用JavaScript
 * @author 易用软件-朱新旺(zhuxinwang@aliyun.com)
 * @date 2019/1/19 0019 10:11
 */

public class JavaScript {

    public static void main(String[] args) throws ScriptException, FileNotFoundException, NoSuchMethodException {

        //region 1.使用JavaScript在控制台输出Hello World ！
        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName("nashorn");
        scriptEngine.eval("print('Hello World !')");
        //endregion

        ScriptEngine scriptEngine1 = new ScriptEngineManager().getEngineByName("javascript");
        scriptEngine1.eval(new FileReader("E:\\study\\java\\Nashron\\src\\main\\java\\com\\zhuxinwang\\nashron\\day1\\script.js"));

        Invocable invocable = (Invocable) scriptEngine1;
        Object result = invocable.invokeFunction("fun1", "zhuxinwang");
        System.out.println(result);
        System.out.println(result.getClass());

        System.out.println(invocable.invokeFunction("fun2", new Date()));
        System.out.println(invocable.invokeFunction("fun2", LocalDateTime.now()));
        System.out.println(invocable.invokeFunction("fun2", new ArrayList<String>()));


    }


    static String fun1(String name){
        System.out.println("Hi there from Java , " + name);
        return "greetings from java";
    }


}
