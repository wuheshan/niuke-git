package Test0_20;

import java.util.Scanner;

/**
 * 将一个字符串str的内容颠倒过来，并输出。str的长度不超过100个字符。
 * 如：输入“I am a student”，输出“tneduts a ma I”。
 *
 * */
public class Test003 {

    public static void main(String[] args) {



        /*Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            //next()是遇到空格；nextLine()是遇到回车
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse().toString());
        }*/

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            StringBuffer sb = new StringBuffer();
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                sb.append(chars[i]);
            }
            System.out.println(sb.toString());
        }



        /*
        *  开发人员写了一句话
        * */



    }



}
