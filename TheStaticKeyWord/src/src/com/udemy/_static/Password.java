package src.com.udemy._static;

public class Password {
    private static final int key = 1442323;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encrypt(password);
    }

    private int encrypt(int password) {
        return password ^ key;
    }

    public final void storePasword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeInn(int password) {
        if (encrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome!");
            return true;
        } else {
            System.out.println("nope, get out! ");
            return false;
        }
    }
}
