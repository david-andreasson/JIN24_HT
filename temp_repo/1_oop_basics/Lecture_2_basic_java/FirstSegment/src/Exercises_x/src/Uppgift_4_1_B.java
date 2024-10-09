public class Uppgift_4_1_B {
    public static void main(String[] args) {
//        Skapa en klass Kund för en bank med attributen namn, saldo, och kontonummer.Skapa metoder för att sätta in
//        och ta ut pengar samt att visa kontouppgifter.

        // Kom ihåg! I normala fall skapar men en fil per klass, det är standard.

        class Customer {
            String name;
            double balance;
            final int accNumber;

            public Customer(String name, double balance, int accNumber) {
                this.name = name;
                this.balance = balance;
                this.accNumber = accNumber;
            }

            public void showBalance() {
                System.out.println(balance);
            }

            public void deposit() {
                balance += 10;
                System.out.println(name + " deposited 10$ to account " + accNumber);
                System.out.println("New balance is " + balance);
            }

            public void withdraw() {
                balance -= 10;
                System.out.println(name + " withdrew 10$ from account " + accNumber);
                System.out.println("New balance is " + balance);

            }
        }
        Customer John = new Customer("John Smith", 1000, 1001);
        Customer Eve = new Customer("Eve Smith", 2000, 1002);

        John.showBalance();
        Eve.showBalance();
        John.withdraw();
        Eve.withdraw();
        John.showBalance();
        Eve.showBalance();
        John.deposit();
        Eve.deposit();
        John.showBalance();
        Eve.showBalance();

    }
}
