package kata.taminglegacycode.tlc4;

public class TestCase {
    public int run() {
        return run(new TestResult());
    }

    public int run(TestResult testResult) {

        // run the tests and populate the test result

        return testResult.tests().size();
    }
}
