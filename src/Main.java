// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       DebitAccount d1 = new DebitAccount("A-000-002","Me",5000.0);
       d1.deposit(+500);

       Account a1 = new Account("111", "Matt");

       a1.deposit(12.0);
       a1.withdraw(4.0);

       creditAccount c1 = new creditAccount("Matt", 400);

       c1.withdraw(20);

    }
}