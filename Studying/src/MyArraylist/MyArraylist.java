package MyArraylist;

import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/17 20:35
 */
public class MyArraylist {
    public int[] elem;
    public int usedSize;

    public MyArraylist() {
        this.elem = new int[10];
    }

    /**
     * 打印顺序表:
     *  根据usedSize遍历打印
     */
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.println(this.elem[i]+" ");
        }
        System.out.println();
    }

    /**
     * 新增元素,默认在数组最后新增
     * @param data
     */
    public void add(int data) {
        //1、判断是否是满的，满的要进行扩容
        if (isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //2、不满进行插入
        this.elem[this.usedSize] = data;
        this.usedSize++;
    }

    /**
     * 判断当前的顺序表是不是满的
     * @return true:满，，false:不满
     */
    public boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    private boolean checkPosInAdd(int pos) {
        if (pos < 0 || pos > this.usedSize){
            System.out.println("pos位置不合法");
            return false;
        }
        return true;
    }
    /**
     * 在 pos 位置新增元素
     */
    public void add(int pos, int data) {
        if(!checkPosInAdd(pos)) {
            throw new MyArrayListIndexOutOfException("添加方法的pos不合理");
        }
        if (isFull()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }

        // 从后往前挪动数据
        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    /**
     *  判定是否包含某个元素
     */
    public boolean contains(int toFind) {
        return true;
    }
    /**
     * 查找某个元素对应的位置
     */
    public int indexOf(int toFind) {
        return -1;
    }
    // 获取 pos 位置的元素
    public int get(int pos) {
        return -1;
    }
    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {

    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {

    }
    // 获取顺序表长度
    public int size() {
        return 0;
    }
    // 清空顺序表
    public void clear() {

    }

}
