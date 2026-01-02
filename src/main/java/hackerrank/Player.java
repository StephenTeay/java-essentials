package hackerrank;

public class Player {
    private String playerName;
    private int ammoCount;
    private DifficultyLevel difficultyLevel;


    public Player(String playerName, DifficultyLevel difficultyLevel) {
        this.playerName = playerName;
        this.difficultyLevel = difficultyLevel;
        CheckAmmoCount ammoCount = new CheckAmmoCount();
        this.ammoCount = ammoCount.checkAmmoCount(difficultyLevel);
    }

    class CheckAmmoCount {
        public int checkAmmoCount(DifficultyLevel level) {
            int ammoCount = 0;
            switch (level) {
                case EASY:
                    ammoCount = 100;
                    break;
                case MEDIUM:
                    ammoCount = 50;
                    break;
                case HARD:
                    ammoCount = 15;
                    break;
                default:
                    ammoCount = 0;
            }
            return ammoCount;
        }
    }

    @Override
    public String toString() {
        return "Player " + playerName + " is playing " + this.difficultyLevel + " level " + "and has " + this.ammoCount + " ammo to win";
    }
}
