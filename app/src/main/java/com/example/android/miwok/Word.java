package com.example.android.miwok;

public class Word {
    public String defaultTranslation;
    public String engineTranslation;
    private int imageResourceID;

    public Word(String defaultTranslation, String engineTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
    }

    public Word(String defaultTranslation, String engineTranslation, int imageResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
        this.imageResourceID = imageResourceID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getEngineTranslation() {
        return engineTranslation;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
}
