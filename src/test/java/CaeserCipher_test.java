import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaeserCipher_test {

    private Encrypt testEncrypt = new Encrypt();
    private Decrypt testDecrypt = new Decrypt();

    @Test
    public void isEncrypt_encryptdata_true() {
        assertEquals("cd", testEncrypt.encrypt("ab", 2));
    }


    @Test
    public void isDecrypt_decryptdata_true(){
        assertEquals( "ab", testDecrypt.decrypt("cd",2));
    }
}
