import java.util.*;
import java.security.*;
import java.math.*;
//import javax.xml.bind.DatatypeConverter;
public class MD5Hash {
    /*
    public void givenPassword_whenHashing_thenVerifying()
            throws NoSuchAlgorithmException {
        String hash = "35454B055CC325EA1AF2126E27707052";
        String password = "ILoveJava";

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());
        byte[] digest = md.digest();
        String myHash = DatatypeConverter
                .printHexBinary(digest).toUpperCase();

        assertThat(myHash.equals(hash)).isTrue();
    }
    */
    /*
    String plaintext = "your text here";
    MessageDigest m = MessageDigest.getInstance("MD5");
    m.reset();
    m.update(plaintext.getBytes());
    byte[] digest = m.digest();
    BigInteger bigInt = new BigInteger(1,digest);
    String hashtext = bigInt.toString(16);
    // Now we need to zero pad it if you actually want the full 32 chars.
    while(hashtext.length() < 32 ){
        hashtext = "0"+hashtext;
    */
}
