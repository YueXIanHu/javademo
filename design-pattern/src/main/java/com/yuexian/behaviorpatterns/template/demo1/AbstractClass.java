package com.yuexian.behaviorpatterns.template.demo1;

/**
 * @author yuexian
 * @Description 抽象类
 * @Date 2021.4.13 19:48
 */
public abstract class AbstractClass {
    //模板方法
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    //具体方法
    public void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用...");
    }

    //抽象方法1
    public abstract void abstractMethod1();

    //抽象方法2
    public abstract void abstractMethod2();
}
