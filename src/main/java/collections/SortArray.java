package collections;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
      LinkedList <Integer> arraySort = new LinkedList<Integer>();
        for (int i=0; i<11; i++){
            arraySort.add(scanner.nextInt());
        }
        System.out.println("Without Sorting: "+ arraySort);
        Collections.sort(arraySort);
        System.out.println("With sorting: "+ arraySort);
        System.out.println("Maximum Value in List: "+ Collections.max(arraySort));
        System.out.println("Minimum Value in List: "+ Collections.min(arraySort));

    }


}
