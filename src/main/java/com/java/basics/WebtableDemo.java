package com.java.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDemo {
    public static WebDriver driver;
    static String[] myData = {"Kenya","Nairobi","Kenyan Shilling","Swahili; Englis"};
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cosmocode.io/automation-practice-webtable/");
        searchForTextContent("Kenya");
        driver.quit();
    }

    public static void searchForTextContent(String text) {
        int numRows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr")).size();
        int numCols = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[1]/td")).size();
        System.out.println("Number of rows : "+numRows);
        System.out.println("Numbr of columns : "+numCols);
        for(int i=1; i<=numRows; i++){
            for(int j=1; j<=numCols; j++){
                String dynamicXpath = "//table[@id='countries']/tbody/tr["+i+"]/td["+j+"]";
                String tdTextContent = driver.findElement(By.xpath(dynamicXpath)).getText();
                if(text.equalsIgnoreCase(tdTextContent)) {
                    System.out.println("Value avaialable on row : "+i+" and Column "+j);
                    compareValuesFromWebTable(text, i);
                    break;
                }
            }
        }
    }

    public static void compareValuesFromWebTable(String text, int row) {
        String dataOnRow = driver.findElement(By.xpath("//table[@id='countries']/tbody/tr["+row+"]/td[2]")).getText();
        if(dataOnRow.equalsIgnoreCase(myData[0])) {
            System.out.println("Testcase Passed");
        }else {
            System.out.println("Testcase Failed!");
        }
    }
}
