package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;

/**
 * Created by hossam on 4/25/2017.
 * Word class has two state for miwok word and default word for which miwok being translated
 */

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mSoundId = -1;


    public Word(String defaultWord, String miwokWord, int soundId){
        this.miwokTranslation = miwokWord;
        this.defaultTranslation = defaultWord;
        mSoundId = soundId;
    }

    public Word(String defaultWord, String miwokWord, int imageId, int soundId){
        this.miwokTranslation = miwokWord;
        this.defaultTranslation = defaultWord;
        imageResourceId = imageId;
        mSoundId = soundId;
    }

    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundId(){
        return mSoundId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", mSoundId=" + mSoundId +
                '}';
    }
}
