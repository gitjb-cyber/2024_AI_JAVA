package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Buyer buyer = order;
        buyer.buy();

        Seller seller = order;
        seller.sell();

        order.order(); // Buyer 의 order // 디폴트 메서드
    }
}
