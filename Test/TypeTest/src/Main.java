import java.lang.*;

public class Main {
    public static void main(String[] args) {

        boolean bool = true;    // false
        byte b1 = 127;  // -128 ~ 127, 1byte
        int i1 = Integer.MAX_VALUE;   // 32bit, 4bytes
        //System.out.println(bool);
        String s1 = "안녕하세요.";
        System.out.println(s1);

        byte b2 = 1;
        int i2 = 2;
        double d2 = b2 + i2;    // 자동 타입 변환

        i2 = (int)d2;
    }
}