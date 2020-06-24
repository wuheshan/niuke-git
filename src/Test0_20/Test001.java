package Test0_20;

import java.util.Scanner;
/**
 * 求两个数的最小公倍数
 * */
public class Test001 {

    public static int getResult(int m ,int n){
        if(m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        int k;
        while(n!=0){
            k=m%n;
            m=n;
            n=k;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while(reader.hasNext()){
            int m = reader.nextInt();
            int n = reader.nextInt();
            System.out.println(m*n/getResult(m, n));
        }

    }
}
