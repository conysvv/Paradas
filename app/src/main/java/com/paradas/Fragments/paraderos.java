package com.paradas.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.paradas.R;

public class paraderos extends Fragment implements OnMapReadyCallback {

    private static paraderos INSTANCE = null;

    View view;

    GoogleMap map;
    MapView mapView;

    public paraderos (){
    }

    public static paraderos getINSTANCE(){
        if (INSTANCE == null)
            INSTANCE = new paraderos();
        return INSTANCE;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.paraderos,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = view.findViewById(R.id.mapsView);

        if (mapView !=null){
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        map = googleMap;

        LatLng marcador1=new LatLng(-33.022443, -71.551420);
        LatLng marcador2=new LatLng(-33.022025, -71.551533);
        LatLng marcador3=new LatLng(-33.019832, -71.550790);
        LatLng marcador4=new LatLng(-33.017841, -71.550387);
        LatLng marcador5=new LatLng(-33.017783, -71.550661);
        LatLng marcador6=new LatLng(-33.014553, -71.549784);
        LatLng marcador7=new LatLng(-33.014562, -71.549982);
        LatLng marcador8=new LatLng(-33.013590, -71.549580);
        LatLng marcador9=new LatLng(-33.013590, -71.549580);
        LatLng marcador10=new LatLng(-33.010819, -71.549022);
        LatLng marcador11=new LatLng(-33.009814, -71.549051);
        LatLng marcador12=new LatLng(-33.009740, -71.548786);
        LatLng marcador13=new LatLng(-33.008928, -71.548872);
        LatLng marcador14=new LatLng(-33.013064, -71.549607);



        map.addMarker(new MarkerOptions().position(marcador1).title("Uno Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(marcador1,18));
        map.addMarker(new MarkerOptions().position(marcador2).title("Uno Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador3).title("Tres Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador4).title("Cinco Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador5).title("Cinco Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador6).title("Ocho Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador7).title("Ocho Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador8).title("Nueve Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador9).title("Diez Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador10).title("Doce Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador11).title("Trece Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador12).title("Trece Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador13).title("Catorce Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        map.addMarker(new MarkerOptions().position(marcador14).title("Diez Norte - Libertad").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
    }

}


