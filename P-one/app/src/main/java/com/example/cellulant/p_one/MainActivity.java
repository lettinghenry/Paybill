package com.example.cellulant.p_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtPhoneNumber;
    EditText edtAmount;
    Button payButton;

    String amount = "";
    String phoneNumber = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialise();
    }


    private void initialise(){
        edtPhoneNumber = (EditText) findViewById(R.id.edt_phone_number);
        edtAmount = (EditText) findViewById(R.id.edt_amount);
        payButton = (Button) findViewById(R.id.btn_pay);
        payButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataOnViews();
            }
        });
    }

    private void getDataOnViews(){
        amount = edtAmount.getText().toString();
        phoneNumber = edtPhoneNumber.getText().toString();
    }

}
