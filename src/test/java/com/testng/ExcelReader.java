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
    public static void main(String[] args) {
        File file = new File("Students.xlsx");
        try {
            FileInputStream fis = new FileInputStream(file);
            Workbook studentsWb = new XSSFWorkbook(fis); // USE XSSFWorkbook for xlsx and HSSFWorkbook for xls
            Sheet studentsSheet = studentsWb.getSheet("Students");
            int rowCount = studentsSheet.getLastRowNum();
            int colCount = studentsSheet.getRow(0).getLastCellNum();
            System.out.println("Row Count: "+rowCount);
            System.out.println("Col Count: "+colCount);
            for(int i=0; i<=rowCount; i++) {
                Row activeRow = studentsSheet.getRow(i);
                for(int j=0; j<colCount; j++) {
                    String activeCellData = activeRow.getCell(j).getStringCellValue();
                    System.out.print(activeCellData+" | ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
