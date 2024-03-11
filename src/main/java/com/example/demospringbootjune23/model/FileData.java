package com.example.demospringbootjune23.model;


import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "file_data")

public class FileData {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private String filePath;



}
