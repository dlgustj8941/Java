public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("BMW");
        myCar.setSpeed(280);
        myCar.setColor("남색");
        System.out.println("브랜드 : " + myCar.getBrand());
        System.out.println("최고속도 : " + myCar.getSpeed());
        System.out.println("색상 : " + myCar.getColor());
    }
}
