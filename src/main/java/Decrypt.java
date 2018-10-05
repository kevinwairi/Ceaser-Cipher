public class Decrypt {

    public static String decrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift % 26) + 26;
        }

        String Ciphertext = "";
        int length = plainText.length();
        for (int i = 0;i<length;i++){
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c = (char)(ch - shift);
                    if (c<'a'){
                        Ciphertext += (char)(ch + (26-shift));
                    }else{
                        Ciphertext += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch + shift);
                    if (c <'A'){
                        Ciphertext += (char)(ch + (26-shift));
                    }else{
                        Ciphertext += c;
                    }
                }
            }else{
                Ciphertext += ch;
            }

        }
        return Ciphertext;
    }
}