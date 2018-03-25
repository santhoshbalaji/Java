public class Algorithm {
    private String encode = null ;
    private String decode = null ;
    private String[] key = {"ADC","ASD","WER","SDE","ETY","CBF","NJI","JFH","YUR","SDF","FHG","YUI","SDG","TYR","BHJ","JKL","HUI","LKP","QNS","LIP","NBD","XML","HHG","DHD",
            "ZUY","CCB"};
    private int[] pairs = {1192,3456,2234,9802,3344,6511,2323,4455,2689,1075};
    public Algorithm(){

    }
    public String[] getKey(){
        return key;
    }
    public int[] getPairs(){
        return pairs;
    }
}
