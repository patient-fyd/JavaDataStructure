package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 22:30
 */

/**
 * 写一个泛型类，类中有个方法，求数组的最大值
 */
class Alg<T extends Comparable<T>> {
    public T findMax(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Alg<Integer> alg = new Alg<Integer>();
        Integer[] array = {1,4,22,5,19};
        Integer max = alg.findMax(array);
        System.out.println(max);

    }
}
