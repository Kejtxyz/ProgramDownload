package Payment;

import java.util.Objects;

public class OrderLine {
    /**
     * model opisuje pojedyncza linbie z koszyka z karty jednej
     */
    //nazwa produktow i ilosc
    private final String product;
    private final int price;
    private final int amount;



    /**
     * koszt orderline pojedynczje lini zakupu
     * amount - ilosc
     * @return
     */
    int cost(){
        return price * amount;
    }

// konstruktor alt+insert generowany
    public OrderLine(String product, int price, int amount) {
        this.product = product;
        this.price = price;
        this.amount = amount;
    }
// alt+insert genreujemy equals i hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderLine orderLine = (OrderLine) o;
        return price == orderLine.price &&
                amount == orderLine.amount &&
                Objects.equals(product, orderLine.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price, amount);
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
