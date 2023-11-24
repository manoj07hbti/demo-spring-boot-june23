package com.example.demospringbootjune23.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DOCTOR_TABLE {

    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    Long id;
    public String docName;
    public int docID;
    public String specialist;

    public DOCTOR_TABLE() {
    }

    public DOCTOR_TABLE(String docName, int docID, String specialist) {
        this.docName = docName;
        this.docID = docID;
        this.specialist = specialist;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public int getDocID() {
        return docID;
    }

    public void setDocID(int docID) {
        this.docID = docID;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}
