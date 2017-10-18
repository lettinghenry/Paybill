package com.example.cellulant.p_one;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Button;

public class ResultsPage extends AppCompatActivity {

    RelativeLayout reltv_container;
    TextView txt_status;
    TextView txt_status_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
        initialise();

    }

    private void initialise(){
        reltv_container = (RelativeLayout) findViewById(R.id.reltv_container);
        txt_status = (TextView) findViewById(R.id.txt_status);
        txt_status_description = (TextView) findViewById(R.id.txt_status_description);

    }

    private void setDataOnViews(){

    }

}
