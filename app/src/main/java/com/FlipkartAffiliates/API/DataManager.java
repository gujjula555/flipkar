package com.FlipkartAffiliates.API;

import android.preference.Preference;

public class DataManager {

    private static DataManager sInstance;

    private DataManager() {
        // This class is not publicly instantiable
    }

    public static synchronized DataManager getInstance() {
        if (sInstance == null) {
            sInstance = new DataManager();
        }
        return sInstance;
    }


    public FlipkartService getMovieService() {
        return FlipkartService.getInstance();
    }

}