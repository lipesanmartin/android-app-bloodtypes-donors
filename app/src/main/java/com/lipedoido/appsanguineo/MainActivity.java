package com.lipedoido.appsanguineo;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.lipedoido.appsanguineo.model.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.blood_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        TextView textDonors = findViewById(R.id.textDonors);
        textDonors.setVisibility(TextView.INVISIBLE);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClick(View v) {
        TextView textDonors = findViewById(R.id.textDonors);
        textDonors.setVisibility(TextView.VISIBLE);
        TextView textBloodTypes = findViewById(R.id.textBloodTypes);
        textBloodTypes.setVisibility(TextView.VISIBLE);
        Spinner spinner = findViewById(R.id.spinner);
        textBloodTypes.setText(String.join(", ", onItemSelected(spinner)));
    }



    public List<String> onItemSelected(Spinner spinner) {
        String bloodType = String.valueOf(spinner.getSelectedItem());
        User user = new User(bloodType);
        return user.canDonate(bloodType);
    }
}