package classesandobjects;

import java.util.AbstractCollection;

public class AccountHolderObjects {
    public static void main(String[] args) {

        AccountHolder tom = new AccountHolder();
        AccountHolder henry = new AccountHolder();
        AccountHolder sarah = new AccountHolder();

        tom.firstName="Tom";
        tom.lastName="Smith";
        tom.accountBalance=1000;
        tom.age=21;
        tom.testEligibilityForCC();
        System.out.println("Is Tom eligible for Credit Card: "+tom.eligibleForCC);

        henry.firstName="Henry";
        henry.lastName="Snipes";
        henry.accountBalance=27000;
        henry.age=34;
        henry.testEligibilityForCC();
        System.out.println("Is Henry eligible for Credit Card: "+henry.eligibleForCC);
    }
}
