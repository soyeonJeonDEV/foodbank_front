package com.hackarthon.foodbank;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class LocationSearchToggleRequest extends StringRequest {

    // 서버 url 설정 (php 파일 연동)
    final static private String URL = "http://ec2-54-180-46-45.ap-northeast-2.compute.amazonaws.com:3000/food-bank/center_search"; // "http:// 퍼블릭 DNS 주소/Register.php"
    private Map<String, String> parameters;


    public LocationSearchToggleRequest(String title,Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);

        parameters = new HashMap<>();
        parameters.put("title", title);



    }


    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }

}