package chapter13.quiz;

import javax.swing.plaf.metal.MetalMenuBarUI;

public class Member {
    private String name;
    private String favoriteColor;
    private int age;

    public Member(String name, String favoriteColor, int age) {
        this.name = name;
        this.favoriteColor = favoriteColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public int getAge() {
        return age;
    }
}
