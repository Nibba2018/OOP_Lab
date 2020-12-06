public class CheckingAccount {
    String acc_num;
    Integer balance;
    private boolean clipped;

    public CheckingAccount(String acc_num, Integer balance) {
        this.acc_num = acc_num;
        this.balance = balance;
        this.clipped = false;

        if(balance.intValue() < 200){
            this.balance = 0;
            this.clipped = true;
        }
    }

    public void details(){
        System.out.println("Account Details:");
        System.out.println("Account Number: "+this.acc_num);
        System.out.println("Balance: "+this.balance);

        if(this.clipped){
            System.out.println("Account balance was reduced to 0 due to"+
                               " insufficient threshold balance of $200.00");
        }
    }
}
