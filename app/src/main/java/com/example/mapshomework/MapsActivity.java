package com.example.mapshomework;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

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
        //Zoom control
        mMap.getUiSettings().setZoomControlsEnabled(true);

        //Markers
        LatLng firstMarker = new LatLng(-16.5246794,-68.0684597);
        LatLng secondMarker = new LatLng(-16.5747721,-68.1267923);
        LatLng thirdMarker = new LatLng(-16.532217,-68.0894109);
        LatLng fourthMarker = new LatLng(-16.5246741,-68.1126552);
        LatLng fifthMarker = new LatLng(-16.4957357,-68.1356726);
        LatLng sixthMarker = new LatLng(-16.5438864,-68.0803479);
        LatLng seventhMarker = new LatLng(-16.5112521,-68.1965444);



        //Position of markers inside the map
        mMap.addMarker(new MarkerOptions().position(firstMarker).title("Marker at Home"));
        mMap.addMarker(new MarkerOptions().position(secondMarker).title("Marker at university"));
        mMap.addMarker(new MarkerOptions().position(thirdMarker).title("Marker at Mega Center"));
        mMap.addMarker(new MarkerOptions().position(fourthMarker).title("Marker at university Obrajes"));
        mMap.addMarker(new MarkerOptions().position(fifthMarker).title("Marker at Plaza Murillo"));
        mMap.addMarker(new MarkerOptions().position(sixthMarker).title("Marker at Texas in San Miguel"));
        mMap.addMarker(new MarkerOptions().position(seventhMarker).title("Marker at Airport"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(firstMarker,16));
    }
}
