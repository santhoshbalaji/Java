import java.util.LinkedHashMap;

public class Decryption extends Algorithm {
    private String word = "";
    private LinkedHashMap caps = null;
    private LinkedHashMap small = null;
    private int[] pairs = null;
    public Decryption(String text){
        this.word = text;
        Algorithm algorithm = new Algorithm();
        String[] key = algorithm.getKey();
        pairs = algorithm.getPairs();
        caps = new LinkedHashMap();
        small = new LinkedHashMap();
        for(int i = 65,count = 0; i < 91; i++,count++ ){
            caps.put(key[count],i);
        }
        for(int i = 122, count = 0; i > 96; i--,count++ ){
            small.put(key[count].toLowerCase(),i);
        }
    }
    public String decrypt(){
        String decodedWord = "";
        char[] wordArray = this.word.toCharArray();
        boolean boo = true;
        String threeWord = "";
        String fourWord = "";
        int count = 0;
        int innerCount = 0;
        while(boo){
            if(count % 2 == 0){
                threeWord += wordArray[innerCount];
                innerCount++;
                if(threeWord.length() == 3){
                    decodedWord += Character.toString((char)Integer.parseInt(threeWord));
                    count++;
                    threeWord = "";
                    for(int i = 0; i < 4; i++ ){
                        innerCount++;
                    }
                }
            }else{
                threeWord += wordArray[innerCount];
                innerCount++;
                if(threeWord.length() == 3){
                    if (Character.isUpperCase(threeWord.charAt(0))) {
                        decodedWord += Character.toString((char)(int)caps.get(threeWord));
                        count++;
                        threeWord = "";
                    }else if(Character.isLowerCase(threeWord.charAt(0))){
                        decodedWord += Character.toString((char)(int)small.get(threeWord));
                        count++;
                        threeWord = "";
                    }else{
                        decodedWord += Character.toString((char)Integer.parseInt(threeWord));
                        count++;
                        threeWord = "";
                    }
                }

            }
            if(innerCount >= this.word.length()){
                break;
            }
        }
        return decodedWord;
    }

}
