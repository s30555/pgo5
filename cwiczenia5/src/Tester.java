import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Tester extends Employee {
    public Tester(String imieT, String nazwiskoT, String adresT, String mailT, String peselT, int rokzatrudnieniaT) {
        super(imieT, nazwiskoT, adresT, mailT, peselT, rokzatrudnieniaT);
        tests = new HashSet<>();
    }

    private Set<Test> tests;
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 300 * tests.size();
    }

    public void addTest(Test test) {
        tests.add(test);
    }

    @Override
    public String toString() {
        return super.toString() + ", tests: " + Arrays.toString(tests.toArray()) + "}";
    }

    public Set<Test> getTests() {
        return tests;
    }

}
