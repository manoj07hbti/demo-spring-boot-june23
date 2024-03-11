package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.service.ReadXLSandSaveDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class ReadXLSandSaveDataController {

    @Autowired
    private ReadXLSandSaveDataService service;


    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        try {

            ReadXLSandSaveDataService.processXlsFile(file);
            return ResponseEntity.ok("File uploaded successfully");

        } catch (IOException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading file");
        }
    }
}




