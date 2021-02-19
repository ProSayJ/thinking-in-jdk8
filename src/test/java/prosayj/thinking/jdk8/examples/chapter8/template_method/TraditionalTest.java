package prosayj.thinking.jdk8.examples.chapter8.template_method;

import prosayj.thinking.jdk8.examples.chapter8.template_method.ApplicationDenied;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.CompanyLoanApplication;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.EmployeeLoanApplication;
import prosayj.thinking.jdk8.examples.chapter8.template_method.traditional.PersonalLoanApplication;
import org.junit.Test;

public class TraditionalTest {

    @Test
    public void fitsTogether() throws ApplicationDenied {
        new CompanyLoanApplication().checkLoanApplication();
        new PersonalLoanApplication().checkLoanApplication();
        new EmployeeLoanApplication().checkLoanApplication();
    }

}