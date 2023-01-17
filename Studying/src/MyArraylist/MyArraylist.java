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
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    /**
     * 新增元素,默认在数组最后新增
     * @param data 默认在末尾添加的数据
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
     *
     * @param pos 在pos下标上
     * @param data 添加data数据
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
     * @param toFind 要判断的元素
     * @return 包含：true,不包含：false
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
     * @param toFind 查找的元素
     * @return 找到了返回下标，没找到返回-1
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
     * @param pos 获取数据的下标
     * @return 返回pos上面的元素数据
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
     * 给 pos 位置的元素更新为 value
     * @param pos 要更新数据的下标
     * @param value 更新替换的数据
     */
    public void set(int pos, int value) {
        if (!checkPosInGet(pos)) {
            throw new MyArrayListIndexOutOfException("更新pos下标的元素，位置不合法");
        }
        if (isEmpty()) {
            throw new MyArrayListEmptyException("顺序表为空!");
        }

        this.elem[pos] = value;
    }

    /**
     * 删除第一次出现的关键字key
     * @param toRemove 要删除的数据
     */
    public void remove(int toRemove) {
        if (isEmpty()) {
            throw new MyArrayListEmptyException("顺序表为空，无法删除");
        }
        int index = indexOf(toRemove);
        if(index == -1) {
            System.out.println("不存在你要删除的数据");
            return;
        }
        for (int i = index; i < usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
        this.elem[usedSize] = 0;
    }

    /**
     * 获取顺序表长度
     * @return 返回长度
     */
    public int size() {
        return this.usedSize;
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        // 如果是引用类型，要一个一个遍历置空
        this.usedSize = 0;
    }

}
