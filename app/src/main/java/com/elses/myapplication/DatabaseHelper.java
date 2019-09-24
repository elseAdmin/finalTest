package com.elses.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.google.android.gms.common.stats.LoggingConstants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class DatabaseHelper {
    public DatabaseHelper() {
        if(beacons==null)
        beacons = new HashSet<>();
    }
    private static Set<String> beacons;

    public void addBeacon (String name) {
       beacons.add(name);
    }
    public boolean isBeaconDetected(String beaconName){
        return beacons.contains(beaconName);
    }

    public void removeBeacon(String beaconName) {
      beacons.remove(beaconName);
    }
}
