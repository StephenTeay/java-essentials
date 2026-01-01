package hackerrank;

import java.util.*;

public class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    public String getWinner() {
        LinkedList<Integer> score = new LinkedList<Integer>();
        Iterator<Integer> it = players.values().iterator();
        while (it.hasNext()) {
            score.add(it.next());
        }
        int highestScore = Collections.max(score);
        String winnerName = "";
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue().equals(highestScore)) {
                winnerName = entry.getKey();
            }
        }
        return winnerName;


    }

}

class Program {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        System.out.println(game.getWinner());
    }
}
