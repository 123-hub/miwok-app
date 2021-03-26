package com.example.pra;

import android.media.Image;
import android.provider.ContactsContract;
import android.widget.ImageView;

import java.security.PublicKey;

public class Word {

    private String mmiwoktranslation;

    private String mdefaulttranslation;

    private int mImageResourceid=NO_IMAGE_PROVIDED;

   private static final int NO_IMAGE_PROVIDED=-1;

  private int mAudioResourceId;



    public Word(String defaulttranslation, String miwoktranslation, int audioresourseid ){
        mmiwoktranslation = miwoktranslation;
        mdefaulttranslation = defaulttranslation;
         mAudioResourceId=audioresourseid;
    }

  public Word(String defaulttranslation,String miwoktranslation,int ImageResourceid, int audioResourceId){

        mmiwoktranslation = miwoktranslation;
        mdefaulttranslation = defaulttranslation;
        mImageResourceid=ImageResourceid;
        mAudioResourceId=audioResourceId;
    }
    public String getMiwokTranslation() {
        return mmiwoktranslation;
    }

    public String getDefaultTranslation() {
        return mdefaulttranslation;
    }

    public int getmImageResourceid()
    {
        return mImageResourceid;
    }

    public boolean hasimage()
    {
        return mImageResourceid!=NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){ return mAudioResourceId; }

}
