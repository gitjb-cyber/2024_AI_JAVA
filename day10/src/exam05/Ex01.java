package exam05;

public class Ex01 {
    public static void main(String[] args) {
        // FruitBox<Apple> appleBox = new FruitBox<>(); // Apple, Grape, Fruit
        FruitBox<Fruit> appleBox = new FruitBox<>();
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        juicer.make(appleBox);// 사과 주스

        FruitBox<Grape> grapeBox = new FruitBox<>();
        grapeBox.add(new Grape());
        grapeBox.add(new Grape());

        juicer.make(grapeBox);// 포도 주스

        FruitBox<Toy> toyBox = new FruitBox<>();
        // juicer.make(toyBox);
    }
}
