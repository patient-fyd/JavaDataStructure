package MyArray;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/16 23:04
 */
class Message<T> {
    private T message ;
    public T getMessage() {
        return message;
    }
    public void setMessage(T message) {
        this.message = message;
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Message<String> message = new Message() ;
        Message<Integer> message2 = new Message() ;
        message.setMessage("比特就业课欢迎您");
        message2.setMessage(1);
        // 通配符可以接收任何类型的数据
        fun(message);
        fun(message2);
    }
    public static void fun(Message<?> temp){

        // 通配符不能往里输入，因为他不知道他是什么类型

        System.out.println(temp.getMessage());
    }
}