package com.test.digui;

/**
 * 递归函数
 *
 * 求5的阶乘
 * @version v0.0.1
 * @author: yupanpan
 * @since: 2017-12-05 10:00
 */
public class DiGuiTest1 {

    public static int digui(int n){
        if (n ==1 || n ==0 ){
            System.out.println("执行了" + n + "次...");
            return  1;
        }else {
            System.out.println("执行了" + n + "次...");
            return n * digui(n - 1);
        }
    }

    public static void main(String[] args) {
        int result =digui(5);
        System.out.println("结果是："+result);
    }
}
