package Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patilsh on 8/3/2016.
 */
public class FrequencyCount {
    private String inputString = "";
    Map<Character,Integer> charFrequencyMap ;
    private int count;
    public FrequencyCount(String inputString) {
        this.inputString = inputString;
        charFrequencyMap = new HashMap<Character,Integer>();
        count = 0;
    }

    public String getInputString() {
        return inputString;
    }

    public void getFrequencyMap(){
        for(int i = 0; i < inputString.length(); ++i){

            if(!charFrequencyMap.containsKey(inputString.charAt(i))){
                charFrequencyMap.put(inputString.charAt(i),1);
            }else{
                charFrequencyMap.put(inputString.charAt(i),charFrequencyMap.get(inputString.charAt(i))+1);
            }
        }
    }

    public void display(){
        System.out.println(charFrequencyMap);
    }
}
