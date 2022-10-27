//import java.util.*;
//import java.security.*;
//import java.math.*;
//import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
    public String encryptString (String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
         MD5Hash encryptor = new MD5Hash();

         String password = "monkey123";

         System.out.println(encryptor.encryptString(password));
    }
}
