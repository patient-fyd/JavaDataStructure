package Stack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/3/6 9:29
 */
public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack(){
        this.elem = new int[5];
    }

    /**
     * 入栈
     * @param val 入栈的元素
     */
    public void push(int val){
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.usedSize++] = val;
    }

    /**
     * 判断当前栈是否为满
     * @return 是返回true
     */
    public boolean isFull(){
        return usedSize == elem.length;
    }

    /**
     * 出栈
     * @return
     */
    public int pop() {
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        int ret = elem[usedSize-1];
        // 如果是引用类型的时候，要把它置为空
        usedSize--;
        return ret;
    }

    private boolean empty() {
        return usedSize == 0;
    }


}
