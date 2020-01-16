package com.harvesttracer.app.farmer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.harvesttracer.app.R;

import androidx.appcompat.app.AppCompatActivity;

public class FarmerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer);

        // add new farmer
        final FloatingActionButton addFarmerBtn = findViewById(R.id.addFarmerBtn);

        addFarmerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent addFarmerViewIntent = new Intent(getApplicationContext(), AddFarmer.class);
                startActivity(addFarmerViewIntent);
            }

        });
    }
}
