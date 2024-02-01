package chapter06.access;

import chapter05.PublicAccess;

public class AccessSampleSamePackage {
    void test() {
        PublicAccess publicAccess = new PublicAccess();
        System.out.println(publicAccess.test);
    }
}