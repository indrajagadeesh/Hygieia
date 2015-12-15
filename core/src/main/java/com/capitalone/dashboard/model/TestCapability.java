package com.capitalone.dashboard.model;

import java.util.ArrayList;
import java.util.Collection;

public class TestCapability {

    /**
     * Creation timestamp
     */
    private long timestamp;

    /**
     * Identifies this test result in the source system
     */
    private String executionId;

    /**
     * Description of the test result that might make sense to a human
     */
    private String description;

    /**
     * Optional URL to test results
     */
    private String url;

    /**
     * Start test execution time {@link java.util.Date#getTime()}
     */
    private long startTime;

    /**
     * End test execution time {@link java.util.Date#getTime()}
     */
    private long endTime;

    /**
     * Test duration in milliseconds
     */
    private long duration;

    /**
     * Count of test cases that failed in all test suites
     */
    private int failedTestSuiteCount;

    /**
     * Count of test cases that generated an error in all test suites
     */
    private int successTestSuiteCount;

    /**
     * Count of test cases that were skipped in all test suites
     */
    private int skippedTestSuiteCount;

    /**
     * The total number of test cases in all test suites
     */
    private int totalTestSuiteCount;

    private int unknownStatusTestSuiteCount;

    private TestCaseStatus status;

    /**
     * Type of test
     */
    private TestSuiteType type;


    /**
     * Collection of {@link TestSuite}s generated by this TestResult.
     */
    private Collection<TestSuite> testSuites = new ArrayList<>();

    public TestCaseStatus getStatus() {
        return status;
    }

    public void setStatus(TestCaseStatus status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getFailedTestSuiteCount() {
        return failedTestSuiteCount;
    }

    public void setFailedTestSuiteCount(int failedTestSuiteCount) {
        this.failedTestSuiteCount = failedTestSuiteCount;
    }

    public int getSuccessTestSuiteCount() {
        return successTestSuiteCount;
    }

    public void setSuccessTestSuiteCount(int successTestSuiteCount) {
        this.successTestSuiteCount = successTestSuiteCount;
    }

    public int getSkippedTestSuiteCount() {
        return skippedTestSuiteCount;
    }

    public void setSkippedTestSuiteCount(int skippedTestSuiteCount) {
        this.skippedTestSuiteCount = skippedTestSuiteCount;
    }

    public int getTotalTestSuiteCount() {
        return totalTestSuiteCount;
    }

    public void setTotalTestSuiteCount(int totalTestSuiteCount) {
        this.totalTestSuiteCount = totalTestSuiteCount;
    }

    public int getUnknownStatusTestSuiteCount() {
        return unknownStatusTestSuiteCount;
    }

    public void setUnknownStatusTestSuiteCount(int unknownStatusTestSuiteCount) {
        this.unknownStatusTestSuiteCount = unknownStatusTestSuiteCount;
    }

    public Collection<TestSuite> getTestSuites() {
        return testSuites;
    }

    public void setTestSuites(Collection<TestSuite> testSuites) {
        this.testSuites = testSuites;
    }

    public TestSuiteType getType() {
        return type;
    }

    public void setType(TestSuiteType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestCapability capability  = (TestCapability) o;

        return url.equals(capability.getUrl()) && executionId.equals(capability.getExecutionId());
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }
}
