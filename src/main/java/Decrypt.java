public class Decrypt {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";


    public static String decrypt(String plainText, int shiftKey){
        plainText = plainText.toLowerCase();
        String cipherText ="";
        for (int i = 0; i < plainText.length(); i++){

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
}
