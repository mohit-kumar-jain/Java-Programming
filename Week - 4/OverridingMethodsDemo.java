class Bank {
    double getInterestRate() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

public class OverridingMethodsDemo {
    public static void main(String[] args) {
        Bank myBank;

        myBank = new SBI();
        System.out.println("SBI Interest Rate: " + myBank.getInterestRate() + "%");

        myBank = new ICICI();
        System.out.println("ICICI Interest Rate: " + myBank.getInterestRate() + "%");
    }
}
