package Stack;

import java.util.Stack;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/3/6 9:15
 */
public class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        // 入栈
        stack.push(12);
        stack.push(23);
        stack.push(34);
        stack.push(45);
        int x = stack.pop();
        System.out.println(x);
        // 获取栈顶元素，但是不删除
        x = stack.peek();
        System.out.println(x);
        // 弹出一个元素，并且删除
        x = stack.pop();
        System.out.println(x);
        boolean flg = stack.empty();
        System.out.println(flg);
    }
}
