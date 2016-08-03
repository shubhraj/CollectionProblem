package Set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by patilsh on 8/3/2016.
 */
public class UniqueAphabets {
    private String inputString;
    private Set<Character> charSet;



    UniqueAphabets(String input){

        inputString = input.replaceAll("\\s","");
        charSet = new HashSet<Character>();
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString.replaceAll("\\s","");
    }

    public Set getUniqueCharacterSet(){
        for(int i = 0; i < inputString.length(); ++i){
            charSet.add(inputString.charAt(i));
        }
        return charSet;

    }
    public  void display(){
        System.out.println(charSet);
    }

}
