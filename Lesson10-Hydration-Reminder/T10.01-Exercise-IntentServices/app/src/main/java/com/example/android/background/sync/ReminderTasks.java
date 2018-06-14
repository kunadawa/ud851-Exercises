package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// DO (1) Create a class called ReminderTasks
public class ReminderTasks {
    public static final String ACTION_INCREMENT_WATER_COUNT = "ACTION_INCREMENT_WATER_COUNT";
// DO (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// DO (6) Create a public static void method called executeTask
    public static void executeTask(Context context, String action) {
        if (action.equals(ACTION_INCREMENT_WATER_COUNT)) incrementWaterCount(context);
    }
// DO (7) Add a Context called context and String parameter called action to the parameter list

// DO (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount

// DO (3) Create a private static void method called incrementWaterCount
    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
//DO (4) Add a Context called context to the argument list
// DO (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count
    }
}