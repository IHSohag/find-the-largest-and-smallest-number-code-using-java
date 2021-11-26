package ih.sohag;

import java.util.Scanner;

class Number{
     int largeNumber(int a,int b,int c){
        int max = a;
        if (max<b) {
            max = b;
        }
        if (max<c) {
            max = c;
        }
        return max;
    }
     int smallNumber(int a,int b,int c){
         int min = a;
         if (min>b) {
             min = b;
         }
         if (min>c) {
             min = c;
         }
         return min;
     }
}

public class FindLargeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        Number number = new Number();
        int largeNumber = number.largeNumber(a, b,c);
        int smallNumber = number.smallNumber(a, b, c);
        System.out.println("Smallest number : "+smallNumber);
        System.out.println("Largest number : "+largeNumber);
    }
}
