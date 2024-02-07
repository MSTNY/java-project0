package chapter09.account;

import chapter09.XXXException;

public class Bank {
    public static void main(String[] args) {
        // 출금
//        Account account = new Account();
//        account.deposit(2000);
//        System.out.println("잔액 : " + account.getBalance());
//
//        try {
//            account.withdraw(3000);
//        } catch (BalanceInsufficientException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace(); // 로깅
//        }

        // 송금
        Account account1 = new Account();
        Account account2 = new Account();
        account1.deposit(1000000);
        account2.deposit(500000);

        try {
            System.out.println("처리중");
            account1.withdraw(500000);
            account2.deposit(500000);
            System.out.println("완료");
        } catch (BalanceInsufficientException e) {

        }
    }
}
