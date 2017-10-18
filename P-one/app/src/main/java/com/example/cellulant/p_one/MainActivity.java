package com.example.cellulant.p_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cellulant.p_one.utils.AppConstants;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AuthenticationRequest() {

        StringRequest request = new StringRequest(Request.Method.POST, AppConstants.URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();


                params.put("grant_type", AppConstants.GRANT_TYPE);
                params.put("client_id", AppConstants.CLIENT_ID);
                params.put("client_secret", AppConstants.CLIENT_SECRET);

                return params;
            }
        };

        Volley.newRequestQueue(this).add(request);
    }

    public void GetPaymentOptions(final String values[], final String keys[]) {
        StringRequest request = new StringRequest(Request.Method.POST, AppConstants.URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                for (int i = 0; i < keys.length; i++) {

                    params.put(keys[i], values[i]);

                }

                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }

    public void postCheckOutRequest(final String keys[], final String values[]) {
        StringRequest request = new StringRequest(Request.Method.POST, AppConstants.URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();

                for (int i = 0; i < keys.length; i++) {

                    params.put(keys[i], values[i]);

                }

                return params;
            }
        };
        Volley.newRequestQueue(this).add(request);
    }
}
