package MyList;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/19 0:46
 */
public class TestDemo {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();

        mySingleList.createList();
        mySingleList.display();
        mySingleList.addIndex(4,99);
        mySingleList.display();

    }
}
