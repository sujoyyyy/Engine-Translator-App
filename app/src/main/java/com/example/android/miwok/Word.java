package com.example.android.miwok;

public class Word {
    public String defaultTranslation;
    public String engineTranslation;
    public Word(String defaultTranslation, String engineTranslation)
    {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
    }
    public String getDefaultTranslation()
    {
        return  defaultTranslation;
    }

    public String getEngineTranslation() {
        return engineTranslation;
    }
}
