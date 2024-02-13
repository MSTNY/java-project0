package chapter09;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("file.txt")){
            inputStream.read();
            System.out.println("test");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception 처리");
        }

//        String filePath = "C:\\Users\\msj68\\Desktop\\minseok\\java-project0";
//        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
//            System.out.println(br.readLine());
//        } catch(IOException e) {
//            System.out.println("예외처리 로직");
//        }

//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(filePath));
//            System.out.println(br.readLine());
//        } catch (IOException e) {
//
//        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//
//                }
//            }
//        }
    }
}
