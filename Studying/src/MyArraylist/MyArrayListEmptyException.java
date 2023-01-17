package MyArraylist;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/1/17 21:34
 */
public class MyArrayListEmptyException extends RuntimeException{
    public MyArrayListEmptyException() {

    }

    public MyArrayListEmptyException(String message) {
        super(message);
    }

}
