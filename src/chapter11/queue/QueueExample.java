package chapter11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Member> queue = new LinkedList<>();
        queue.offer(new Member("Iron Man"));
        queue.offer(new Member("Captain America"));
        queue.offer(new Member("Thor"));

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("-------------------");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
