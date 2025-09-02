import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        // Q. 가로 세로 값을 입력 받아 삼각형의 넓이를 구하는 java 프로그램을 작성하세요.
        // 단, area의 Type(자료형)은 double로 하세요.
        int width, height;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.print("width : ");
        width = Integer.parseInt(sc.nextLine());
        System.out.print("height : ");
        height = Integer.parseInt(sc.nextLine());
        area = width * height / 2.0;

        System.out.println("삼각형의 넓이 : " + area);
    }
}