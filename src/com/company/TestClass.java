package com.company;

public class TestClass {
    private String testId;

    public  TestClass(){
        this("a");
    }

    public TestClass(String a){
        this.testId = a;
    }

    public void setTestId(String testId){
        this.testId = testId;
    }

    public String getTestId(){
        return testId;
    }
}
