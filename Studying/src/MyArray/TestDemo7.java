package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/17 1:16
 */
public class TestDemo7 {
    public static void main(String[] args) {
        int a = 10;
        // 自动装箱
        Integer b = a;
        // 手动装箱
        Integer c = Integer.valueOf(a);
        System.out.println(b);

        Integer e = 10;
        int d = e;
        // 自动拆箱默认都是intValue()
        double d2 = e;
        // 手动拆箱
        double d3 = e.doubleValue();
        System.out.println(d);


        Integer n = 100;
        Integer m = 100;
        // 包装类之间要用equals进行比较，直接用== 会调用valueOf方法，只在-128~127之间能判断
        System.out.println(m.equals(n));

    }
}
