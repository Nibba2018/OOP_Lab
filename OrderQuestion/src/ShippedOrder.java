public class ShippedOrder extends Order {

    @Override
    public Double computeTotalPrice() {
        this.total_price = super.computeTotalPrice() + 4.0;
        return this.total_price;
    }

}
