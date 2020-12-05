import java.util.Scanner;

public class Order {

    String cust_name;
    Integer cust_num, quantity;
    Double unit_price, total_price;
    private Scanner sc= new Scanner(System.in);

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name() {
        System.out.print("Enter customer name: ");
        this.cust_name = this.sc.nextLine();
    }

    public Integer getCust_num() {
        return cust_num;
    }

    public void setCust_num() {
        System.out.print("Enter customer number: ");
        this.cust_num = Integer.parseInt(sc.nextLine());
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity() {
        System.out.print("Enter Quantity: ");
        this.quantity = Integer.parseInt(this.sc.nextLine());
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price() {
        System.out.print("Enter Unit Price: ");
        this.unit_price = Double.parseDouble(this.sc.nextLine());
    }

    public Double computeTotalPrice(){
        this.total_price = this.quantity * this.unit_price;
        return this.total_price;
    }

    public void display(){
        System.out.println("Customer Name   : "+this.cust_name);
        System.out.println("Customer Number : "+this.cust_num);
        System.out.println("Quantity        : "+this.quantity);
        System.out.println("Unit Price      : "+this.unit_price);
        System.out.println("Total Price     : "+this.total_price);
        System.out.println();
    }
}
