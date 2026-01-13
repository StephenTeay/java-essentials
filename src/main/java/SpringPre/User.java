package SpringPre;

public class User {
    private int id;
    private String name;
    private String email;

    static boolean validateEmail(String email){
        var checkMail = true;
        if(!email.contains("@") || !email.contains(".com")){
            checkMail = false;
            System.out.println(email +" isn't properly written");
        }
        return checkMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean isValidEmail = validateEmail(email);
        if(isValidEmail){
            this.email = email.toLowerCase();
        }
        else{
            this.email = "";
        }
    }

    @Override
    public String toString() {
        return "User: "+ this.getName() + " email: "+this.getEmail()+ " ID: "+this.getId();
    }
}
