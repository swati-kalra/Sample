package test;

import main.BranchOrDecisionCoverage;
import org.testng.annotations.Test;

public class testBranchOrDecisionCoverage {

    BranchOrDecisionCoverage branch = new BranchOrDecisionCoverage();

    @Test
    public void testValidPassword(){
        branch.isValidPassword("abcd@13");
    }

    @Test
    public void testInvalidPassword1(){
        branch.isValidPassword("test");
    }

    @Test
    public void testInvalidPassword2(){
        branch.isValidPassword("test123");
    }

    @Test
    public void testInvalidPassword3(){
        branch.isValidPassword("test123544565");
    }

}
