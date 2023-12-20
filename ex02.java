//#2,#3 ,#4,5,#6,#7,8,#9, #10,11
package ch14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ex02 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf;
        String str;

        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入字串: ");

        str = buf.readLine();
        System.out.println("轉換後的字串: " + str.toUpperCase());
    }
}
