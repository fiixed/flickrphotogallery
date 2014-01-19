package com.fiixed.flickrphotogallery;

/**
 * Created by abell on 1/20/14.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }



    public String toString() {
        return mCaption;
    }
}
