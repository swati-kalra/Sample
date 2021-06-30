package main;

public class BranchOrDecisionCoverage {

    public boolean isValidPassword(String password){
        if(password.length() > 5 && password.length() < 8){
            if(password.contains("@")) {
                System.out.println("Valid Password");
                return true;
            }
            else {
                System.out.println("Invalid Password");
                return false;
            }
        }
        else {
            System.out.println("Invalid Password");
            return false;
        }
    }
}
