package online.music.com.mymusic.model;

import com.google.gson.annotations.SerializedName;

import online.music.com.mymusic.utils.SongEntryConstants;

public class User {
    @SerializedName(SongEntryConstants.USER_NAME)
    private String mUserName;

}
