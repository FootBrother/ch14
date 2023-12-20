package ch14;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ex08 {
    public static void main(String[] args) {

        String filePath = "D:\\program\\code\\java\\ch14\\proverb.txt";

        try (FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            boolean skipSecondLine = true;

            // 读取并输出其余内容
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (skipSecondLine) {
                    skipSecondLine = false;
                } else {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
