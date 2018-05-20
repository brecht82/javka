package classesandobjects;

public class AccountHolder {
    String firstName;
    String lastName;
    int age;
    float accountBalance;
    boolean eligibleForCC;

    public void testEligibilityForCC(){
        if(age>25 && accountBalance>=20000){
            eligibleForCC=true;


        }
    }
}
