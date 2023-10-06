package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText departure_date, arrival_Date;
     int year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        departure_date = findViewById(R.id.departure_date);
        arrival_Date = findViewById(R.id.arrival_date);
    }

    public void onClick(View v) {
        if (v == departure_date) {
            // Get Current Date
            final Calendar c = Calendar.getInstance();
            year = c.get(Calendar.YEAR);
            month = c.get(Calendar.MONTH);
            day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            departure_date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        }
                    }, year, month, day);
            datePickerDialog.show();
        }
        if(v == arrival_Date){
            // Get Current Date
            final Calendar c = Calendar.getInstance();
            year = c.get(Calendar.YEAR);
            month = c.get(Calendar.MONTH);
            day = c.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                            arrival_Date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);
                        }
                    }, year, month, day);
            datePickerDialog.show();
        }
    }

//    public void onClick(View view){
//        Spinner spinner = findViewById(R.id.planets);
//        int idx = spinner.getSelectedItemPosition();
//        String[] planets = getResources().getStringArray(R.array.planets);
//        Toast.makeText(this, "planet: " + planets[idx], Toast.LENGTH_SHORT).show();
//        Log.d("mytag", "planets: " + planets[idx]);
//    }

}