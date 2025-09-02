public class Main {
  public static void main(String[] args) {
    Cat mary = new Cat("메리", 2, "하얀색");
    // mary.name = "메리";  // 직접접근(x)
    mary.setName("메리 고양이");
    System.out.println(mary.getName());  // 간접접근(o)

    mary.Meow();
    mary.Eat();
  }
}
