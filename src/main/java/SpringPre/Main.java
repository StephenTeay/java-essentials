package SpringPre;

public class Main {
    public static void main(String[] args) {
        User ayo = new User();
        ayo.setId(1);
        ayo.setEmail("Boluwaji@gmail.com");
        ayo.setName("Ayomide");
        System.out.println(ayo);

        Task clean = new Task();
        clean.setId(ayo.getId());
        clean.setTaskId(1);

    }
}
