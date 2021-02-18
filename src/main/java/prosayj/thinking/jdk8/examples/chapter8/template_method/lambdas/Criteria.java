package prosayj.thinking.jdk8.examples.chapter8.template_method.lambdas;


import prosayj.thinking.jdk8.examples.chapter8.template_method.ApplicationDenied;

// BEGIN Criteria
public interface Criteria {

    public void check() throws ApplicationDenied;

}
// END Criteria
