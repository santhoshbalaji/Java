import java.util.LinkedHashMap;

public class Encryption extends Algorithm {
    private String word = "";
    private LinkedHashMap caps = null;
    private LinkedHashMap small = null;
    private int[] pairs = null;
    public Encryption(String text){
        this.word = text;
        Algorithm algorithm = new Algorithm();
        String[] key = algorithm.getKey();
        pairs = algorithm.getPairs();
        caps = new LinkedHashMap();
        small = new LinkedHashMap();
        for(int i = 65,count = 0; i < 91; i++,count++ ){
            caps.put(i,key[count]);
        }
        for(int i = 122, count = 0; i > 96; i--,count++ ){
            small.put(i,key[count].toLowerCase());
        }
    }
    public String encrypt() {
        String encodedWord = "";
        int pairCount = 0;
        int wordLength = this.word.length();
        String keyWord = "";
        char[] text = this.word.toCharArray();
        for (int i = 0; i < text.length; i++) {
            if (i % 2 == 0) {
                String len = ""+(int)text[i];
                if(len.length() == 2){
                    encodedWord += "0"+len;
                }else{
                    encodedWord += len;
                }

            } else {
                if (Character.isUpperCase(text[i])) {
                    encodedWord += pairs[pairCount] + "" + caps.get((int) text[i]);
                } else if(Character.isLowerCase(text[i])) {
                    encodedWord += pairs[pairCount] + "" + small.get((int) text[i]);
                } else{
                    String len = ""+(int)text[i];
                    if(len.length() == 2){
                        encodedWord += pairs[pairCount] + "" +"0"+len;
                    }else{
                        encodedWord += pairs[pairCount] + "" +len;
                    }
                }

            }
            pairCount++;
            if (pairCount == pairs.length) {
                pairCount = 0;
            }

        }
//        encodedWord += wordLength;
        return encodedWord;
    }

}
