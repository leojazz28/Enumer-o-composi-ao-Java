import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(),  OrderStatus.PENDING_PAYMENT);

        System.out.println(order);


        // FORMAS DE PASSA VALORES DO ENU PEGANDO UMA PALAVRA DA CLASSE DO ENUM
        OrderStatus os1 = OrderStatus.DELIVERED;  // NO CASO ENUM , NAO ṔRECISA CHAMAR O NEW
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);






    }
}