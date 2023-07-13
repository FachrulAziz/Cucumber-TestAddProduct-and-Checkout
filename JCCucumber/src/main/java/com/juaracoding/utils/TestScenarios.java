package com.juaracoding.utils;

public enum TestScenarios {
    T1("Login Valid Functionality Test"),
    T2("Login Invalid Functionality Test"),
    T3("Dashboard Summary Test"),
    T4("Input Absen Masuk"),
    T5("Input Absen Masuk tanpa Upload Foto Selfie"),
    T6("Input Absen Masuk tanpa isi keterangan"),
    T7("Absen Pulang"),
    T8("Invalid absen pulang");
    private String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
