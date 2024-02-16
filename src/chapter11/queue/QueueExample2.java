package chapter11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSms", "제니"));
        messageQueue.offer(new Message("sendKakaoTalk", "리사"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.getCommand()) {
                case "sendMail" -> System.out.println(message.getTo() + "에게 메일을 보냅니다.");
                case "sendSms" -> System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                case "sendKakaoTalk" -> System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
            }
        }
    }
}