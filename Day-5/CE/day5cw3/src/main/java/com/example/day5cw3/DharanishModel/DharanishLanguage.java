package com.example.day5cw3.DharanishModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DharanishLanguage {
    @Id
    private int languageId;
    private String languageName;
    private String languageComplexity;
    public DharanishLanguage() {
    }
    public DharanishLanguage(int languageId, String languageName, String languageComplexity) {
        this.languageId = languageId;
        this.languageName = languageName;
        this.languageComplexity = languageComplexity;
    }
    public int getLanguageId() {
        return languageId;
    }
    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }
    public String getLanguageName() {
        return languageName;
    }
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
    public String getLanguageComplexity() {
        return languageComplexity;
    }
    public void setLanguageComplexity(String languageComplexity) {
        this.languageComplexity = languageComplexity;
    }
    
}
