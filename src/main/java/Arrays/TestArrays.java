package Arrays;

import java.util.Arrays;
import java.util.Random;

public class TestArrays {
    private static final int SIZE = 10000000;
    private static final int RANGE = 10000000;
    private static int count = 0;
    private static final int START = 0;
    private static Random random = new Random();

    private static void load (int [] a, int START, int RANGE ){
        for(int i = 0; i<a.length; i++){
            a[i] = START + random.nextInt(RANGE);
        }
    }

    private static int search(int [] a, int x){
        int lo = 0;
        int hi = a.length;
        while(lo<hi){
            ++count;
            int i = (lo+hi)/2;
            if(a[i] ==  x){
                return i;}
            else if(a[i] < x){
                lo = i +1;}
            else{
                hi = i;}
        }
        return -1;
    }
    public static void main (String [] args){
        int [] testArray = new int [SIZE];
        load(testArray,START,RANGE);
        Arrays.sort(testArray);
        System.out.println(search(testArray, random.nextInt(RANGE)));
        System.out.println(count+" iterations");
    }

}
