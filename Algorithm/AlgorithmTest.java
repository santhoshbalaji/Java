public class AlgorithmTest {
    public static void main(String[] args) {
        String text = "santhoshbalaji7676@gmail.com";
        System.out.println(text);
        Encryption encryption = new Encryption(text);
        String encode = encryption.encrypt();
        System.out.println(encode);
        Decryption decryption = new Decryption(encode);
        String decode = decryption.decrypt();
        System.out.println(decode);
        if(text.equals(decode)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
