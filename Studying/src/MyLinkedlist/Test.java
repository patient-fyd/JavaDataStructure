package MyLinkedlist;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/3/1 15:06
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.display();
        System.out.println("-----------------------");
        myLinkedList.remove(5);
        myLinkedList.remove(4);
        myLinkedList.display();

    }

}
