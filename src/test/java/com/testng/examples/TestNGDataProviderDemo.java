package com.testng.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderDemo {

    @Test(dataProvider = "studentProvider")
    public void sampleTest1(String name, String email, String phone) {
        System.out.println("Name Received : "+name);
        System.out.println("Email Received : "+email);
        System.out.println("Phone Received : "+phone);
    }

    // DATAPROVIDER RETURN TYPE IS OBJECT[][]
    @DataProvider(name = "studentProvider")
    public Object[][] readDataFromSource() {
        return new String[][] {
                {"name", "email", "phone"},
                {"santosh", "santosh@test.com", "12323245"},
                {"satish", "satish@gmail.com", "30218309"}
        };
    }
}
