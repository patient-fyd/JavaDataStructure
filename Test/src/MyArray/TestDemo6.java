package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 23:36
 */

public class TestDemo6 {
    public static void main(String[] args) {
        Plate<Fruit> message = new Plate<Fruit>();
        message.setPlate(new Fruit());
        fun(message);
        Plate<Food> message2 = new Plate<Food>();
        message2.setPlate(new Food());
        fun(message2);
    }

    /**
     *  temp 接收Fruit及其子类的一个Message
     */
    public static void fun(Plate<? super Fruit> temp){
// 此时可以修改！！添加的是Fruit 或者Fruit的子类
        //这个是Fruit的子类
        temp.setPlate(new Apple());
        //这个是Fruit的本身
        temp.setPlate(new Fruit());
//Fruit fruit = temp.getMessage(); 不能接收，这里无法确定是哪个父类
        //只能直接输出
        System.out.println(temp.getPlate());
    }
}
