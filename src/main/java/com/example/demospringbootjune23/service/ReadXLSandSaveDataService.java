package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.EntityFile;
import com.example.demospringbootjune23.repository.ReadXLSandSaveDataRepository;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

@Service
public class ReadXLSandSaveDataService {


    @Autowired
    static
    ReadXLSandSaveDataRepository repository;

    public static void processXlsFile(MultipartFile file) throws IOException {
        Workbook workbook = new HSSFWorkbook(file.getInputStream());
        // Use HSSFWorkbook for XLS files
        Sheet sheet = workbook.getSheetAt(0);
        //Assuming the data is in the first sheet
        for (Row row : sheet) {
            EntityFile entityFile = new EntityFile();
            entityFile.setName(row.getCell(0).getStringCellValue());

            entityFile.setDescription(row.getCell(1).getStringCellValue());

            repository.save(entityFile);
        }
        workbook.close();
    }
}