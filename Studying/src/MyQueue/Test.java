package MyQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: patient.fyd@gmail.com
 * @Description:
 * @DateTime: 2023/7/6 21:34
 */
public class Test {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        int val = queue.poll();
        System.out.println(val);
        System.out.println(queue.peek());
        queue.offer(4);
    }
}
