
package com.khilman.tempatterdekat_kotlinmvp.ResponseHotel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OpeningHours {

    @SerializedName("open_now")
    private Boolean mOpenNow;
    @SerializedName("weekday_text")
    private List<Object> mWeekdayText;

    public Boolean getOpenNow() {
        return mOpenNow;
    }

    public void setOpenNow(Boolean openNow) {
        mOpenNow = openNow;
    }

    public List<Object> getWeekdayText() {
        return mWeekdayText;
    }

    public void setWeekdayText(List<Object> weekdayText) {
        mWeekdayText = weekdayText;
    }

}
