package Veridic;

/**
 * Created by Admin on 11-07-2017.
 */
public class Recursion {
  static int a=0,b=1,c=0;
     static void fibonacciSeries(int num)
    {
        if (num>0){
            c=a+b;
            a=b;
            b=c;
            System.out.println("" +c);
            fibonacciSeries(num-1);
        }
    }
    public static void main(String args[]){
        int num=10;
        System.out.println(+a);
        System.out.println(+b);

        fibonacciSeries(num-2);
    }
}