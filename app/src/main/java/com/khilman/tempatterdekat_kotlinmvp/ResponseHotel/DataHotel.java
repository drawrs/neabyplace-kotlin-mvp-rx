
package com.khilman.tempatterdekat_kotlinmvp.ResponseHotel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataHotel {

    @SerializedName("html_attributions")
    private List<String> mHtmlAttributions;
    @SerializedName("next_page_token")
    private String mNextPageToken;
    @SerializedName("results")
    private List<Result> mResults;
    @SerializedName("status")
    private String mStatus;

    public List<String> getHtmlAttributions() {
        return mHtmlAttributions;
    }

    public void setHtmlAttributions(List<String> htmlAttributions) {
        mHtmlAttributions = htmlAttributions;
    }

    public String getNextPageToken() {
        return mNextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        mNextPageToken = nextPageToken;
    }

    public List<Result> getResults() {
        return mResults;
    }

    public void setResults(List<Result> results) {
        mResults = results;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
