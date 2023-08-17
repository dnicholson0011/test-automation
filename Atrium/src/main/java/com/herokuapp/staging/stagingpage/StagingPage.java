package com.herokuapp.staging.stagingpage;

public class StagingPage {

    private String str;

    private int[] arr = new int[5];

    public StagingPage(String str) {
        this.str = "Yo";
        System.out.println(str);
    }

    public void testMethod() {
        System.out.println("My test method");
    }
}
