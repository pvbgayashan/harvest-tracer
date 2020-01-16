package com.harvesttracer.app.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.harvesttracer.app.R;
import com.harvesttracer.app.agri_officer.AgriOfficerActivity;
import com.harvesttracer.app.buyer.BuyerActivity;
import com.harvesttracer.app.farmer.FarmerActivity;
import com.harvesttracer.app.user_management.SignUpActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // go to farmer activity
        final Button farmerButton = findViewById(R.id.farmerBtn);

        farmerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent farmerViewIntent = new Intent(getApplicationContext(), FarmerActivity.class);
                startActivity(farmerViewIntent);
            }

        });

        // go to agri officer activity
        final Button agriOfficerBtn = findViewById(R.id.agriOfficerBtn);

        agriOfficerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent agriOfficerViewIntent = new Intent(getApplicationContext(), AgriOfficerActivity.class);
                startActivity(agriOfficerViewIntent);
            }

        });

        // go to buyer activity
        final Button buyerButton = findViewById(R.id.buyerBtn);

        buyerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent buyerViewIntent = new Intent(getApplicationContext(), BuyerActivity.class);
                startActivity(buyerViewIntent);
            }

        });

        // go to sign up activity
        final Button signUpButton = findViewById(R.id.signUpBtn);

        signUpButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent signUpViewIntent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(signUpViewIntent);
            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item_list, menu);

        return true;
    }
}
