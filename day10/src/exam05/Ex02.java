package exam05;

public class Ex02 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        juicer.make2(appleBox);// Apple, Fruit, Object

        FruitBox<Fruit> grapeBox = new FruitBox<>(); // Fruit는 Grape의 상위 클래스
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());
        juicer.make2(grapeBox);
    }
}
