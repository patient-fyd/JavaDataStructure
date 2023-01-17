package MyArraylist;

import java.util.ArrayList;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/18 0:56
 */
public class TestArrayList {
    public static void main(String[] args) {
        // 在调用这个构造方法的时候，数组是空的
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 第一次add的时候，底层的数组才变成了10，扩容的方式是1.5倍扩容
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(99);
        arrayList.add(5);
        System.out.println(arrayList);


        // 删除下标为2的元素
        arrayList.remove(2);
        // 删除数据为99的元素
        arrayList.remove(new Integer(99));

        // 使用其他的集合来构造当前的list
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
        arrayList2.add(99);
        arrayList2.add(199);
        System.out.println(arrayList2);

        // 重新定义容量
        ArrayList<Integer> arrayList3 = new ArrayList<>(5);
        System.out.println(arrayList3);
    }
}
