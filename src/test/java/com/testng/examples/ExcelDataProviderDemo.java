package com.testng.examples;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataProviderDemo {

    @Test(dataProvider = "studentData")
    public void studentDataTest(String name, String email, String phone) {
        System.out.println("Received Student name : "+name);
        System.out.println("Received Student email : "+email);
        System.out.println("Received Student phone : "+phone);
        System.out.println("------------------------------");
    }


    @DataProvider(name = "studentData")
    public String[][] getDataFromExcel() throws IOException {
        return readExcel();
    }

    public String[][] readExcel() throws IOException {
        FileInputStream fis = new FileInputStream(new File("Students.xlsx"));
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("Students");
        int numRows = sheet.getPhysicalNumberOfRows();
        int numCols = sheet.getRow(0).getLastCellNum();
        System.out.println("Row Count : "+numRows);
        System.out.println("Col Count : "+numCols);
        String[][] excelArray = new String[numRows][numCols];
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<numCols; j++) {
                excelArray[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
        return excelArray;
    }
}
