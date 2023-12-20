package ch14;

import java.io.FileReader;
import java.io.IOException;

public class ex04 {
    public static void main(String[] args) {
        // 指定文件路径
        String filePath = "D:\\program\\code\\java\\ch14\\donkey.txt";

        try (FileReader fileReader = new FileReader(filePath)) {
            int character;
            int charCount = 0;

            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character); // 输出文件内容
                charCount++;
            }

            System.out.println("\n\n字元數: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
