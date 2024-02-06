package chapter09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("존재하지_않는_파일"));
        br.readLine();
        br.close();
    }
}
