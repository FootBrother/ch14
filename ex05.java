package ch14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex05 {
    public static void main(String[] args) {
        // 指定文件路径
        String filePath = "D:\\program\\code\\java\\ch14\\donkey.txt";

        try (FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            bufferedReader.readLine();

            int character;
            int charCount = 0;

            while ((character = bufferedReader.read()) != -1) {
                System.out.print((char) character);
                charCount++;
            }

            System.out.println("\n\n字元數: " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
