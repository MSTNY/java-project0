package chapter03;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++;                                                //x=10
        ++x;                                                //x=12
        System.out.println("x=" + x);

        System.out.println("----------------------");
        y--;                                                //y=10
        --y;                                                //y=8
        System.out.println("y=" + y);

        System.out.println("----------------------");
        z = x++;                                            //z=12
        System.out.println("z=" + z);
        System.out.println("x=" + x);                       //x=13

        System.out.println("----------------------");
        z = ++x;                                            //z=14
        System.out.println("z=" + z);
        System.out.println("x=" + x);                       //x=14

        System.out.println("----------------------");
        z = ++x + y++;                                      //z=23
        System.out.println("z=" + z);
        System.out.println("x=" + x);                       //x=15
        System.out.println("y=" + y);                       //y=9
    }
}