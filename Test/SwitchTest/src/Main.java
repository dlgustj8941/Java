import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String strValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 1개 입력하세요 : ");
        strValue = sc.next();   // 문자열 입력

        switch(strValue) {
            case "A":
                System.out.println("A를 입력하셨습니다.");
                break;
            case "B":
                System.out.println("B를 입력하셨습니다.");
                break;
            case "C":
                System.out.println("C를 입력하셨습니다.");
                break;
            default:
                System.out.println("문자를 입력하셨습니다.");
                break;
        }
    }
}