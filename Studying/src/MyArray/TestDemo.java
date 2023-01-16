package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 21:05
 */

/**
 * <T> 占位符，代表当前类是一个泛型类
 * @param <T>
 */
class  MyArray<T> {
    //public Object[] array = new Object[10];

    public T[] array = (T[]) new Object[10];
    /**
     * 获取pos下标的值
     * @param pos
     * @return
     */
    public T getPos(int pos) {
        return array[pos];
    }

    /**
     * 给pos下标放一个元素
     * @param pos
     * @param val
     */
    public void setPos(int pos,T val){
        array[pos]=val;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        /**
         * 1、<Integer>指定当前类中，使用的类型是Integer类型
         * 2、泛型帮我在编译期间做了两件事情
         *  2.1 存放元素的时候，进行类型的检查
         *  2.2 取元素的时候，进行类型的转换
         * 3、<引用类型>
         */
        MyArray<Integer> myArray = new MyArray<Integer>();


        myArray.setPos(0,1);
        myArray.setPos(1,2);

        Integer ret = myArray.getPos(1);
        System.out.println(ret);
    }
}
