import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Encrypt isEncrypt = new Encrypt();
        Decrypt isDecrypt = new Decrypt();

        Scanner text = new Scanner(System.in);
        System.out.println("Please enter the text to encrypt");
        String plainText = text.next();
        System.out.println(isEncrypt.encrypt(plainText, 2));

    }
}