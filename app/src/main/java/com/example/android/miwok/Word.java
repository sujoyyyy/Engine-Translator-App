package com.example.android.miwok;

public class Word {
    private String defaultTranslation;
    private String engineTranslation;
    public Word(String defaultTranslation, String engineTranslation)
    {
        defaultTranslation = this.defaultTranslation;
        engineTranslation = this.engineTranslation;
    }
    public String getDefaultTranslation()
    {
        return  defaultTranslation;
    }

    public String getEngineTranslation() {
        return engineTranslation;
    }
}
