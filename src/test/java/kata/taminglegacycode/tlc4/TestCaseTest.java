package kata.taminglegacycode.tlc4;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class TestCaseTest {
    @Test
    public void should_return_number_of_tests_run() {
        TestCase testCase = new TestCase();
        TestResult mockTestResult = mock(TestResult.class);
        List<kata.taminglegacycode.tlc4.Test> tests = Arrays.asList(new kata.taminglegacycode.tlc4.Test(), new kata.taminglegacycode.tlc4.Test());
        given(mockTestResult.tests()).willReturn(tests);

        assertThat(testCase.run(mockTestResult), is(2));
    }
}
