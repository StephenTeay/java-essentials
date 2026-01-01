package collections;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    public static void main(String[] args) {
        Map<String, Integer> gradeBook = new HashMap<>();
        Map<String, Integer> makeupBook = new HashMap<>();
        gradeBook.put("Ayomide", 10);
        gradeBook.put("Temiloluwa", 25);
        System.out.println("This is the original Score sheet " + gradeBook);

        makeupBook.put("Ayomide", 5);
        makeupBook.put("Temiloluwa", 200);
        System.out.println("This is the Make Up Score sheet " + makeupBook);

        updateScore(gradeBook, makeupBook);

        System.out.println("This is the updated Score sheet " + gradeBook);


    }

    static void updateScore(Map<String, Integer> gradeBook, Map<String, Integer> makeupBook) {
        gradeBook.forEach((name, score) -> {
            Integer newScore = makeupBook.get(name);
            if (newScore > score) {
                gradeBook.put(name, newScore);
            }
        });
    }
}
