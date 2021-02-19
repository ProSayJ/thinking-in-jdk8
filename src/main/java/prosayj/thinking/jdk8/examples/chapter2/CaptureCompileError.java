package prosayj.thinking.jdk8.examples.chapter2;

import javax.swing.*;

/**
 * 所有Lambda表达式中的参数类型都是由编译器推断得出的
 */
public class CaptureCompileError {
    //等号右边的代码并没有声明类型，系统根据上下文推断出类型信息.Lambda表达式中引用既成事实上的final 变量
    final String[] array = {"hello", "world"};


    private JButton button;

    public void error() {
        String name = getUserName();
        name = formatUserName(name);
        //未使用既成事实上的final 变量，导致无法通过编译 (Uncommenting this line should cause a compile error:)
        //button.addActionListener(event -> System.out.println("hi " + name));
    }

    private String formatUserName(String name) {
        return name.toLowerCase();
    }

    private String getUserName() {
        return "RICHARD";
    }
}
