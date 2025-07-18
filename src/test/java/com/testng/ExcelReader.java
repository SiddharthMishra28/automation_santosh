package com.testng;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("Students.xlsx"));
        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheet("Students");
        int numRows = sheet.getPhysicalNumberOfRows();
        int numCols = sheet.getRow(0).getLastCellNum();
        System.out.println("Row Count : "+numRows);
        System.out.println("Col Count : "+numCols);
        for(int i=0; i<numRows; i++) {
            for(int j=0; j<numCols; j++) {
                String data = sheet.getRow(i).getCell(j).getStringCellValue();
                System.out.print(data+ " | ");
            }
            System.out.println();
        }
    }
}
