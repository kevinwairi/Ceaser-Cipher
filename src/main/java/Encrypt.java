public class Encrypt {

    public static String encrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String Ciphertext = "";
        int length = plainText.length();
        for (int i = 0;i<length;i++){
            char ch = plainText.charAt(i);
        }


        return Ciphertext;
    }
}
