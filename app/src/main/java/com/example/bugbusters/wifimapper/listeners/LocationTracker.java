package com.example.bugbusters.wifimapper.listeners;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

import com.example.bugbusters.wifimapper.Orchastrator;
import com.google.android.gms.maps.GoogleMap;

public class LocationTracker implements LocationListener {
    GoogleMap map;
    private Context context;

    public LocationTracker(GoogleMap m, Context c) {
        map = m;
        context = c;
    }

    @Override
    public void onLocationChanged(Location location) {

        Log.i("SendTest", "onLocationChanged");
        Orchastrator.sendData(context, location);
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
