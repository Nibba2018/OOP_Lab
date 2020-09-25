public class Pay {
    double hours_worked;
    double rate_of_pay;
    double withholding_rate;
    double gross_pay;
    double net_pay;

    double computeNetPay(double hours_worked, double rate_of_pay,
                         double withholding_amt){

        this.hours_worked = hours_worked;
        this.rate_of_pay = rate_of_pay;
        this.gross_pay = this.hours_worked*this.rate_of_pay;
        this.net_pay = this.gross_pay - withholding_amt;
        return this.net_pay;
    }

    double computeNetPay(double hours_worked, double rate_of_pay){
        this.hours_worked = hours_worked;
        this.rate_of_pay = rate_of_pay;
        this.withholding_rate = 0.15;
        this.gross_pay = this.hours_worked*this.rate_of_pay;
        this.net_pay = this.gross_pay - this.withholding_rate*this.gross_pay;
        return this.net_pay;
    }

    double computeNetPay(double hours_worked){
        this.hours_worked = hours_worked;
        this.rate_of_pay = 5.85;
        this.withholding_rate = 0.15;
        this.gross_pay = this.hours_worked*this.rate_of_pay;
        this.net_pay = this.gross_pay - this.withholding_rate*this.gross_pay;
        return this.net_pay;
    }

    public static void main(String[] args){

        Pay pay1 = new Pay();

        System.out.println("Net Payments:");
        System.out.println("Payment 1:"+pay1.computeNetPay(30));
        System.out.println("Payment 2:"+pay1.computeNetPay(30, 6));
        System.out.println("Payment 3:"+pay1.computeNetPay(30, 6, 100));
    }
}
