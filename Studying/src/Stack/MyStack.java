package Stack;


import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/3/6 9:29
 */
public class MyStack<E> {
    public E[] elem;
    public int usedSize;

    public MyStack(){
        this.elem = (E[])new Object[5];
    }

    /**
     * 入栈
     * @param val 入栈的元素
     */
    public void push(E val){
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
     * @return 返回元素，并在栈中删除该元素
     */
    public E pop() {
        if (empty()) {
            throw new RuntimeException("栈为空");
        }
        E ret = elem[usedSize-1];
        // 如果是引用类型的时候，要把它置为空
        usedSize--;
        return ret;
    }


    public boolean empty() {
        return usedSize == 0;
    }

    /**
     * 获取栈顶元素，不删除
     * @return 返回元素，不删除
     */
    public E peek(){
        if (empty()){
            throw new RuntimeException("栈为空");
        }
        return elem[usedSize-1];
    }

    /**
     * 获取大小
     * @return 返回大小
     */
    public int getUsedSize(){
        return usedSize;
    }

}
