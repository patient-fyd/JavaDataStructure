package MyArraylist;

import java.util.Arrays;

/**
 * @Author: patient.fyd@gmail.com
 * @Description: 实现顺序表
 * @DateTime: 2023/1/17 20:35
 */
public class MyArraylist {
    public int[] elem;
    public int usedSize;
    private static final int DEFAULT_SIZE = 10;

    public MyArraylist() {
        this.elem = new int[DEFAULT_SIZE];
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
     * 判定是否包含某个元素
     */
    public boolean contains(int toFind) {

        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    /**
     * 查找某个元素对应的位置
     */
    public int indexOf(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean checkPosInGet(int pos) {
        if (pos < 0 || pos >= this.usedSize){
            System.out.println("pos位置不合法");
            return false;
        }
        return true;
    }
    /**
     * 获取 pos 位置的元素
     * @param pos
     * @return
     */
    public int get(int pos) {
        if (!checkPosInGet(pos)) {
            throw new MyArrayListIndexOutOfException("获取pos下标时，位置不合法");
        }
        if (isEmpty()){
            throw new MyArrayListEmptyException("获取元素的时候，顺序表为空");
        }
        return this.elem[pos];
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    /**
     * 给 pos 位置的元素设为 value
     * @param pos
     * @param value
     */
    public void set(int pos, int value) {

    }

    /**
     * 删除第一次出现的关键字key
     * @param toRemove
     */
    public void remove(int toRemove) {

    }

    /**
     * 获取顺序表长度
     * @return
     */
    public int size() {
        return 0;
    }

    /**
     * 清空顺序表
     */
    public void clear() {

    }

}
