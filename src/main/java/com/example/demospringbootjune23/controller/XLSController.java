package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.File;
import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.XLSService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class XLSController {


    @Autowired
    XLSService service;


    @GetMapping("entities")
    public ResponseEntity<List<File>> getAllFileEntities() {
        List<File> entities = service.getAllFileEntities();
        //Logic to create XLS file using Apache POI and return it
        //EXAMPLE: Create XLS file using Apache POI
        Workbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.createSheet("Entities");
        int rewNum = 0;
        for (File file : entities) {
            Row row = sheet.createRow(rewNum++);
            row.createCell(0).setCellValue(file.getId());
            row.createCell(1).setCellValue(file.getName());
            // Add other cell values as needed

        }
        //Write workbook to a file ByteArrayOutputStream
        //Return the XLS file as a response
        //Example;
        //   ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        //   workbook.write(outputStream);
        //  byte [] bytes= outputStream.toByteArray();
        // return ResponseEntity.ok().contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")).body(bytes);


        return null;
    }
}




