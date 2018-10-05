public class App {

    public static void main(String[] args){

        Encrypt isEncrypt =new Encrypt();


        String textEnc = "This is some message";
        String Cipherin = isEncrypt.encrypt(textEnc,5);
        System.out.println(Cipherin);

    }
}
