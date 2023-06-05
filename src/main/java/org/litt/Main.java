package org.litt;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        System.out.println("The topography of the mountain is: " + ExcelFileHelper.getValuesFromExcelDoc().toString());
        System.out.println("The final amount of snow that could fall on the mountain is: " + ExcelFileHelper.logic());
    }
}