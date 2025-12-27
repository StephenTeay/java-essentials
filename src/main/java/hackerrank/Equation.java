package hackerrank;

import java.lang.Math;
import java.util.Scanner;


public class Equation {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(0<=t && t<=500 ){


            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if((0<=a && a<=50) && (0<=b && b<=50) && (1<=n && n<=15)){
                    int firstValue = (int) (a + Math.pow(2.0,0.0) * b);
                    System.out.printf("%d ",firstValue);
                    for(int j=1; j<n; j++){
                        int nextValue = (int) (firstValue + Math.pow(2.0,j) *b);
                        System.out.printf("%d ",nextValue);
                        firstValue = nextValue;
                    }
                }
            }
            in.close();

        }
    }
}
