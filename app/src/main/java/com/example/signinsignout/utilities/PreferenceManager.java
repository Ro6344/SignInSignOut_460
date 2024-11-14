package com.example.signinsignout.utilities;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {

    private final SharedPreferences sharedPreferences;

    /**
     * Initializes the PreferenceManager with the specified context and
     * sets up shared preferences
     * @param context the context used to access shared preferences
     */

    public PreferenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(Constants.KEY_PREFERENCE_NAME, Context.MODE_PRIVATE);

    }

    /**
     * Saves boolean value in shared preferences
     * @param key associated with the boolean value
     * @param value boolean value to store
     */
    public void putBoolean(String key, Boolean value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    /**
     * retrieves a boolean value from shared preferences
     * @param key associated with the boolean value
     * @return the boolea value
     */
    public  Boolean getBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);

    }

    /**
     * Saves a string value in shared prefernces
     * @param key associate with the string value
     * @param value string value to store
     */
    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * retrieves a string value from the prefernces
     * @param key associated with the string value
     * @return string value or null if the key does not exist
     */
    public String getString(String key) {
        return  sharedPreferences.getString(key, null);
    }

    /**
     * clears all data in shared preferences
     */
    public void clear() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}