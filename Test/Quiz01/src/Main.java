import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a : ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("b : ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("a : " + a + " b : " + b);
        // 코딩
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("a : " + a + " b : " + b);
    }
}