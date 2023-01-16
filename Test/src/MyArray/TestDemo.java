package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 21:05
 */

class  MyArray {
    public Object[] array = new Object[10];

    /**
     * 获取pos下标的值
     * @param pos
     * @return
     */
    public Object getPos(int pos) {
        return array[pos];
    }

    /**
     * 给pos下标放一个元素
     * @param pos
     * @param val
     */
    public void setPos(int pos,Object val){
        array[pos]=val;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.setPos(0,1);
        myArray.setPos(1,"hello");

        String ret = (String)myArray.getPos(1);
        System.out.println(ret);
    }
}
