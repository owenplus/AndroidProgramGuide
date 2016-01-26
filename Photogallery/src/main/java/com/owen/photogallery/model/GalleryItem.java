package com.owen.photogallery.model;

/**
 * Created by Owen on 2016/1/11.
 */
public class GalleryItem {
    private String mId;
    private String mCaption;
    private String mUrl;
    private String mOwner;

    public GalleryItem(String id, String caption, String url) {
        mId = id;
        mCaption = caption;
        mUrl = url;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public String getPhotoPageUrl() {
        return "https://www.flickr.com/photos/" + mOwner + "/" + mId;
    }

    @Override
    public String toString() {
        return mCaption;
    }
}
