package Week7;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void characterCount(String inputString){

        HashMap<Character, Integer> CharCntMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for(char c : strArray){

            if (CharCntMap.containsKey(c)){

                CharCntMap.put(c, CharCntMap.get(c) + 1);
            } else {
                CharCntMap.put(c, 1);
            }
        }
        for (Map.Entry entry : CharCntMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    public static void main(String[] args){
        String str = "Stephens";
        String str2 = "Miles Mixxon";
        characterCount(str);
        characterCount(str2);

    }
}
