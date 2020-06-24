package Test0_20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            Double res = getCubeRoot(Double.parseDouble(scan.next()));
            System.out.println(res);
        }
    }

    private static Double getCubeRoot(double num) {

        if (num == 0) {
            return num;
        }

        double num1,num2;
        num1 = num;
        num2 = (2*num1/3)+(num/(num1*num1*3));//利用牛顿迭代法求解
        while(Math.abs(num2-num1)>0.000001){
            num1=num2;
            num2=(2*num1/3)+(num/(num1*num1*3));
        }
        DecimalFormat df = new DecimalFormat("#.0");
        return Double.parseDouble(df.format(num2));

    }

}
