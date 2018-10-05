import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaeserCipher_test {

    private Encrypt testEncrypt = new Encrypt();
    private Decrypt testDecrypt = new Decrypt();

    @Test
    public void encryptdata(){
        assertEquals( "id", testEncrypt.encrypt("gb",2));
    }

    @Test
    public void decryptdata(){
        assertEquals( "gb", testDecrypt.decrypt("id",2));
    }
}
