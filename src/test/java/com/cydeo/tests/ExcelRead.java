package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        //.xlsx path name I want to access
        String path = "Mock Interview Schedule  (1).xlsx";
        // we need to create an object of
        File file = new File(path);

        //to read from excel we to load it to FileInput Stream

        FileInputStream fileInputStream = new FileInputStream(file);

        //workbook > sheet > row>cell

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("Moc_Interview_Schedule");

        //row and cell starts from 0
        System.out.println(sheet.getRow(1).getCell(0));

        System.out.println(sheet.getRow(3).getCell(2));

        // .getPhysicalNumberOfRows(); method is to check how many used cell from the Excel's sheet
        // start counting from 1
        int usedRows = sheet.getPhysicalNumberOfRows();


        int usedRowsCount = sheet.getLastRowNum();
        System.out.println("usedRowsCount = " + usedRowsCount);



    }


}
