package online.music.com.mymusic.data.model;

import com.google.gson.annotations.SerializedName;

import online.music.com.mymusic.util.SongEntryConstants;

public class User {
    @SerializedName(SongEntryConstants.USER_NAME)
    private String mUserName;

}
