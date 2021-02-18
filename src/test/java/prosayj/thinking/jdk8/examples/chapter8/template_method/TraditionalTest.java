package prosayj.thinking.jdk8.examples.chapter8.template_method;

import org.junit.Test;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.CompanyLoanApplication;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.EmployeeLoanApplication;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.PersonalLoanApplication;

public class TraditionalTest {

    @Test
    public void fitsTogether() throws ApplicationDenied {
        new CompanyLoanApplication().checkLoanApplication();
        new PersonalLoanApplication().checkLoanApplication();
        new EmployeeLoanApplication().checkLoanApplication();
    }

}