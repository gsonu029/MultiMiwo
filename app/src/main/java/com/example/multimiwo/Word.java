package com.example.multimiwo;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    // add variable foe audio resourse
    private int audioid;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        audioid=audio;
    }
    // creating new constructor that will be used for NUmbersActivity,ColorsActivity and FamilyActivity
    public Word(String defaultTranslation, String miwokTranslation, int  defaultImage,int audio) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=defaultImage;
        audioid=audio;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /*
    * for getting image resorce id*/
    public Integer getImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    // adding the method for getting audio resourse id
    public Integer getAudioResouseId() {
        return audioid;
    }
}
