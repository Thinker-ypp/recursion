package com.test.digui;

/**
 * 递归函数
 *
 * 求1+2+3+4+5+6+7……+1000的和
 * @version v0.0.1
 * @author: yupanpan
 * @since: 2017-12-05 10:34
 */
public class DiGuiTest2 {

    public static int sum(int n){
        if (n < 0){
            return 0;
        }else{
            return n + sum(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("结果是："+sum(1000));
    }
}
