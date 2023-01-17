package MyArraylist;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/17 23:59
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArraylist myArraylist = new MyArraylist();
        myArraylist.add(0,1);
        myArraylist.add(1,2);
        myArraylist.add(2,3);
        myArraylist.add(3,4);
        myArraylist.add(4,5);
        myArraylist.display();
        myArraylist.set(2,199);
        myArraylist.display();
        myArraylist.remove(4);
        myArraylist.display();
    }
}
