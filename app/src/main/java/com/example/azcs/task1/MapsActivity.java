package com.example.azcs.task1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap , mMaps;
    private static final LatLng Saud = new LatLng(24.722575, 46.627601);
    //private static final LatLng Nourah= new LatLng(24.852394, 46.723890);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMaps = googleMap;


        // Add a marker in King Saud University
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("King Saud University")
                .position(new LatLng(24.722575, 46.627601)));

        // Add a marker in Princess Nourah Bint Abdulrahman University
        mMap.addMarker(new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker))
                .anchor(0.0f, 1.0f) // Anchors the marker on the bottom left
                .title("Princess Nourah Bint Abdulrahman University")
                .position(new LatLng(24.852394, 46.723890)));

        // Move the camera instantly to King Saud University with a zoom of 11
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Saud, 11));


    }
}
