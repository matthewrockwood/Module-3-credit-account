public class creditAccount extends Account{
    private double balance;

    creditAccount(){
        this.balance = 0;

    }
    creditAccount(String firstname, double balance){
        this.customerFirstName = firstname;
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if (amount<0){
            return false;
        }
        else{
            this.balance+=amount;
            System.out.println(balance);
            return true;
        }
    }
    public boolean withdraw(double amount) {
        if (amount > this.balance){
            return false;
    }
        else{
            balance -= amount;
            System.out.println(balance);
            return true;
        }

    }


}
