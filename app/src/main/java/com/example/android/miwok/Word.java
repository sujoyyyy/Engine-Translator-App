package com.example.android.miwok;

public class Word {
    public String defaultTranslation;
    public String engineTranslation;
    private int imageResourceID=-1;
    private int audioResourceID;

    public Word(String defaultTranslation, String engineTranslation,int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
        this.audioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String engineTranslation, int imageResourceID, int audioResourceID) {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
        this.imageResourceID = imageResourceID;
        this.audioResourceID = audioResourceID;
    }
    public Word(String defaultTranslation, String engineTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.engineTranslation = engineTranslation;
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

    public boolean hasImage()
    {
        if (imageResourceID!=-1)
        {
            return true;
        }
        else
            return false;
    }
    public int getAudioResourceID(){
        return audioResourceID;
    }

    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", engineTranslation='" + engineTranslation + '\'' +
                ", imageResourceID=" + imageResourceID +
                ", audioResourceID=" + audioResourceID +
                '}';
    }
}
