package se.davand;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({UnitTestSuite.class, IntegrationTestSuite.class})
public class AllTestsSuite {
}
