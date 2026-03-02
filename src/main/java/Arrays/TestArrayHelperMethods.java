package Arrays;

import java.util.Arrays;

public class TestArrayHelperMethods {
    public static void main(String[] args) {
        ArrayHelperMethods arrayHelp = new ArrayHelperMethods();
        int [] a = {21,37,11,21,90,112,90,34,26,89,11,21};
        int [] b = {90,1,5,2,5,12,5,5,2};

        System.out.println("Before:  a = "+ Arrays.toString(a));
        System.out.println("after: a = "+ Arrays.toString(arrayHelp.withoutDuplicates(a)));
        ArrayHelperMethods.reverse(b);
    }
}
