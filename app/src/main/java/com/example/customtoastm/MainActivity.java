package com.example.customtoastm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2= findViewById(R.id.button2);
        button3= findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View v =inflater.inflate(R.layout.layout1,null);

                TextView toasttext=findViewById(R.id.toast_text1);
                ImageView toastimage = findViewById(R.id.toast_image1);

                toasttext.setText("Good Morning");
                toastimage.setImageResource(R.drawable.coffee1);
                Toast customToast = new Toast(getApplicationContext());
                customToast.setGravity(Gravity.BOTTOM,0,0);
                customToast.show();
                customToast.setDuration(Toast.LENGTH_SHORT);
                customToast.setView(v);


                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        LayoutInflater inflater = getLayoutInflater();
                        View v = inflater.inflate(R.layout.layout2,null);
                        TextView toasttext = findViewById(R.id.toast_text2);
                        ImageView toastimage = findViewById(R.id.toast_image2);
                        toastimage.setImageResource(R.drawable.car2);
                        toasttext.setText("Have a safe Ride");
                        Toast customToast = new Toast(getApplicationContext());
                        customToast.setView(v);
                        customToast.show();
                        customToast.setDuration(Toast.LENGTH_SHORT);
                        customToast.setGravity(Gravity.BOTTOM,0,0);



                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                LayoutInflater inflater = getLayoutInflater();
                                View v = inflater.inflate(R.layout.layout3,null);
                                TextView toasttext = findViewById(R.id.toast_text3);
                                ImageView toastimage = findViewById(R.id.toast_image3);
                                toastimage.setImageResource(R.drawable.food3);
                                toasttext.setText("Yummy...Tasty Meal");
                                Toast customToast = new Toast(getApplicationContext());
                                customToast.setGravity(Gravity.BOTTOM,0,0);
                                customToast.show();
                                customToast.setView(v);
                                customToast.setDuration(Toast.LENGTH_SHORT);

                            }
                        });
                    }
                });
            }
        });


    }
}