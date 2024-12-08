package se.davand;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("se.davand")
@IncludeClassNamePatterns({"OrderTest", "UserTest", ".*IntegrationTest"})
public class SelectiveTestSuite {
}
