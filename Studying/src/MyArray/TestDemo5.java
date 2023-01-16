package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 23:21
 */
class Food {
}
class Fruit extends Food {
}
class Apple extends Fruit {
}
class Banana extends Fruit {
}

class Plate<T> { // 设置泛型上限
    private T message ;
    public T getPlate() {
        return message;
    }
    public void setPlate(T message) {
        this.message = message;
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        Plate<Apple> plate1 = new Plate<Apple>();
        Plate<Banana> plate2 = new Plate<Banana>();

        fun(plate1);
        fun(plate2);
    }

    /**
     * 通配符的上界，一般用来读取元素
     * @param temp
     */
    public static void fun(Plate<? extends Fruit> temp){

        Fruit fruit = temp.getPlate();
        System.out.println(temp.getPlate());
    }
}
