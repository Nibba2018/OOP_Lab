public class UserOrder {
    public static void main(String[] args) {
        Order order = new Order();
        ShippedOrder shipped = new ShippedOrder();

        order.setCust_name();
        order.setCust_num();
        order.setQuantity();
        order.setUnit_price();
        order.computeTotalPrice();
        System.out.println("\nOrder Details:");
        order.display();

        shipped.setCust_name();
        shipped.setCust_num();
        shipped.setQuantity();
        shipped.setUnit_price();
        shipped.computeTotalPrice();
        System.out.println("\nShipped Order Details:");
        shipped.display();

    }
}