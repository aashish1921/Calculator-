package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

import static com.example.calculator.R.color.Clock;

public class history extends AppCompatActivity  {

    //    TextView textView;
//
    WebView webView;
//    TextView txt_x, txt_y, txt_z;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
//        txt_x = findViewById(R.id.txt_x);
//        txt_y = findViewById(R.id.txt_y);
//        txt_z = findViewById(R.id.txt_z);
        getSupportActionBar().hide();

//        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//        if (sensorManager != null) {
//
//            Sensor accleroSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
//            if (accleroSensor != null) {
//                sensorManager.registerListener(this, accleroSensor, SensorManager.SENSOR_DELAY_NORMAL);
//            }
//        } else {
//            Toast.makeText(this, "Sensor", Toast.LENGTH_LONG).show();
//        }
//    }

//    @Override
//    public void onSensorChanged(SensorEvent event) {
//
//        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) ;
////        ((TextView) findViewById(R.id.txt_values)).setText("X: "+event.values[0]+", Y:"+event.values[1]+" , Z: "+event.values[2]);
//        txt_x.setText("X: " + event.values[0]);
//        txt_y.setText("Y: " + event.values[1]);
//        txt_z.setText("Z: " + event.values[2]);
//
//    }
//
//    @Override
//    public void onAccuracyChanged(Sensor sensor, int accuracy) {
//
//    }
//
//}


        webView = findViewById(R.id.html);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.setStatusBarColor(this.getResources().getColor(R.color.Clock));
        }
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.Clock));
        }


    }

}