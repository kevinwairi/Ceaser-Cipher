public class App {

    public static void main(String[] args){

        Encrypt isEncrypt =new Encrypt();
        Decrypt isDecrypt =new Decrypt();


        String textEnc = "This is some message";
        String Cipherin = isEncrypt.encrypt(textEnc,5);
        System.out.println(Cipherin);

        String textDec = "ymnx nx xtrj rjxxflj";
        String Cipherout = isDecrypt.decrypt(textDec,5);
        System.out.println(Cipherout);
    }
}
