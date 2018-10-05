import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaeserCipher_test {

    private Encrypt testEncrypt = new Encrypt();

    @Test
    public void test(){
        assertEquals( "id", testEncrypt.encrypt("gb",2));
    }
}
