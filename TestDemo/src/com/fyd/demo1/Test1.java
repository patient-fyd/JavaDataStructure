package com.fyd.demo1;

import java.util.Scanner;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 猴子第一天摘了若子个桃子，当即吃了一半，还不解馋，又多吃了一个;
 * 第二天，吃剩下的桃子的一半，还不过瘾，又多吃了一个; 以后每天都吃前一天剩下的一半多一个，
 * 到第n天想再吃时，只剩下一个桃子了。问第一天共摘了多少个桃子?
 * (用户自已输入不同的天数，看第一天有多少个桃)
 * @DateTime: 2023/5/5 22:28
 */
public class Test1 {
    public static void main(String[] args) {
        // 用户输入天数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入天数：");
        int day = scanner.nextInt();
        // 定义桃子数量
        int peach = 0;
        // 从最后一天开始倒推
        for (int i = day; i > 0; i--) {
            // 最后一天的桃子数量
            if (i == day) {
                peach = 1;
            } else {
                // 第n天的桃子数量 = (第n+1天的桃子数量 + 1) * 2
                peach = (peach + 1) * 2;
            }
        }
        System.out.println("第一天共摘了" + peach + "个桃子");
    }

}
