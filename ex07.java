package ch14;

import java.io.FileWriter;
import java.io.IOException;

public class ex07 {
    public static void main(String[] args) {
        // 字符串数组
        char[] hi = { 'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a', ' ', '\r', '\n' };

        String filePath = "D:\\program\\code\\java\\ch14\\hello.txt";

        try (FileWriter fileWriter = new FileWriter(filePath)) {

            fileWriter.write(hi);

            fileWriter.write("Welcome");

            System.out.println("成功寫入文件 " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
