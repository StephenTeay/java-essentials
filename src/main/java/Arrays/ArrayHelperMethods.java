package Arrays;

import java.util.Arrays;

public class ArrayHelperMethods {
    public boolean isSorted(int [] a){
        if(a.length < 2){
            return true;
        }
        for(int i = 1; i<a.length; i++){
            if(a[i] < a[i-1]){
                return false;
            }
        }
        return true;
    }

    public int minimum(int [] a){
        int min = a[0];
        if(a.length < 2){
            return min;
        }
        for(int i = 0; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public double mean (double [] a){
        double total = 0;
        for(int i = 0; i<a.length; i++){
            total+= a[i];
        }
        return total/a.length;
    }

    public int [] withoutDuplicates(int [] a){
        int [] b = new int [a.length];
        Arrays.sort(a);
        b[0] = a[0];
        for(int i = 1; i<a.length; i++){
            int searchResult = search(b, a[i]);
            if(searchResult == -1){
                b[i] = a[i];
            }
        }
        return b;
    }
    //revisit

    private static int search(int [] a, int x){
        int lo = 0;
        int hi = a.length;
        while(lo<hi){
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

    public static void reverse(int [] a){
        int length = a.length;
        int [] b = new int [length];
        for(int i = 1; i<length; i++){
            b[i] = a[length-i];
        }
        System.out.println(Arrays.toString(b));


    }
}
