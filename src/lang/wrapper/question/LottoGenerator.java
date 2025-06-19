package lang.wrapper.question;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    static int[] rottoArray = new int[6];
    static int count = 0;
    public static void main(String[] args) {
        Random random = new Random();
        while(count < 6){
            int rottoNum = random.nextInt(45) + 1;
            boolean result = isUnique(rottoNum);
            if(result){
                rottoArray[count] = rottoNum;
                count++;
            }
        }
        System.out.println("로또 번호 : " + Arrays.toString(rottoArray));
    }
    public static boolean isUnique(int rottoNum){
        for(int i = 0; i < count; i++){
            if(rottoArray[i] == rottoNum){
                return false;
            }
        }
        return true;
    }
}
