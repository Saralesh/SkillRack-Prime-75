import javax.security.sasl.SaslClient;
import java.util.HashMap;
import java.util.Scanner;

public class Longest_Sub_strings_Equal_DigitsAlphabets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter = 0 , max = 0, current_len = 0 , pos = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(counter,pos);
        for(char ch : s.toCharArray()){
            pos++;
            if(Character.isAlphabetic(ch)) {
                counter++;
            }
            else counter--;
            if(map.containsKey(counter)){
                current_len = pos - map.get(counter);
                max = Math.max(max,current_len);
            }
            else{
                map.put(counter,pos);
            }
        }
        System.out.println(max);
    }
}
