package com.goodlucklee.foodtcheckapplication.map;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.overlay.Marker;

public class NaverMapUtil {
    private NaverMap naverMap;

    public NaverMapUtil(NaverMap naverMap) {
        this.naverMap = naverMap;
    }

    public void placeMarker(LatLng latlng) {
        Marker marker = new Marker();
        marker.setPosition(latlng);
        marker.setMap(naverMap);
    }
}
