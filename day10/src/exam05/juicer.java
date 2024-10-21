package exam05;

import java.util.List;

public class juicer {

    // ? - Apple, Grape, Fruit
    public static void make(FruitBox<? extends Fruit> fruitBox) { // <?> 와일드 카드 : 모든 타입을 대신할 수 있다
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    // Apple, Fruit, Object (Apple 을 포함한 상위 클래스, Grape X)
    public static void make2(FruitBox<? super Apple> fruitBox) { // <?> 와일드 카드 : 모든 타입을 대신할 수 있다
        List<?> items = fruitBox.getItems();
        System.out.println(items);
    }

    public static <T extends Fruit> void make3(FruitBox<T> fruitBox) {

    }


    /*
    public static void make(FruitBox<Apple> appleBox) {
        List<Apple> items = appleBox.getItems();
        System.out.println(items);
    }
    */


    /* 메서드 중복 정의, 정의 불가/
    public static void make(FruitBox<Grape> grapeBox) {
        List<Grape> items = grapeBox.getItems();
        System.out.println(items);
    }
    */
}
