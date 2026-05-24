package com.mycompany.app;

/**
 * 一个简单的 Hello World 应用
 * 这是 simple-java-maven-app 的核心类
 */
public class App {

    // 定义一个常量消息
    private static final String MESSAGE = "Hello World!";

    // 构造方法
    public App() {
    }

    // 主函数：程序入口
    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    // 获取消息的方法（用于单元测试）
    public String getMessage() {
        return MESSAGE;
    }
}