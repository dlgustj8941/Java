public class Main {
    public static void main(String[] args) {
        // 1 ~ 100까지 출력
        // 1 2 3 4 5 ... 100 ????
        for(int i=1; i<=100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        int j = 1;
        while(j <= 100) {
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
    }
}