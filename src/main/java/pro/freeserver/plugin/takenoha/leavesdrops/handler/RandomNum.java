package pro.freeserver.plugin.takenoha.leavesdrops.handler;

import java.util.Random;

public class RandomNum {
    public static int getRandom(){
        int base = 9;
        Random random = new Random();
        int randomNum = random.nextInt(base);
        System.out.println(randomNum);
        return randomNum;
    }
}
