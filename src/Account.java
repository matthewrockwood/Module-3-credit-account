public class Account {
    private String accountNumber;
    protected  String customerFirstName;

    private double amount = 0;
    Account(){
        this.accountNumber = "A-000-001";
        this.customerFirstName = "A Customer";
    }
    Account(String _accountNumber,String _firstName){
        this.accountNumber =_accountNumber;
        this.customerFirstName = _firstName;
    }
    Account(Account account){
        this.accountNumber = account.accountNumber;
        this.customerFirstName = account.customerFirstName;
    }
    public void setaccountNumber(String _accountNumber){
        this.accountNumber = _accountNumber;
    }
    public boolean deposit(double amount){
        if(amount<=0){
            return false;
        }
        else {
            this.amount += amount;
            System.out.println(this.amount);
            return true;
        }

    }
    public boolean withdraw(double amount){
        if(amount > this.amount){
            return false;
        }
        else {
            this.amount = this.amount - amount;
            System.out.println(this.amount);
            return true;

        }

    }
}
