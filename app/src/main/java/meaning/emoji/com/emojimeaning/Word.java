package meaning.emoji.com.emojimeaning;

/**
 * Created by paparikh on 7/4/17.
 */

public class Word {

    // default translation
    private String mDefaultMeaning;

    //miwok translation
//    private String mExpandedMeaning;

    // image
    private  int mImageResoureId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

//    public Word(String defaultTranslation, String miwokTranslation ) {
//        mDefaultMeaning = defaultTranslation;
//        mMiwokTranslation = miwokTranslation;
//    }

    public Word(String defaultMeaning, int imageResourceId ) {
        mDefaultMeaning = defaultMeaning;
        mImageResoureId = imageResourceId;
    }

    public String getDefaultMeaning() {
        return mDefaultMeaning;
    }

//    public String getMiwokTranslation() {
//        return  mMiwokTranslation;
//    }

    public int getImageResoureId(){
        return mImageResoureId;
    }

    public boolean hasImage(){
        return mImageResoureId != NO_IMAGE_PROVIDED;
    }
}
