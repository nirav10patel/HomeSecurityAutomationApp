package com.example.homesecurityautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AccessCamera extends AppCompatActivity {

    private ImageView mainPic;
    private ImageButton back, gallery;
    private Button takePic, call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_camera);

        mainPic = findViewById(R.id.mainPic);
        back = findViewById(R.id.back);
        gallery = findViewById(R.id.gallery);
        takePic = findViewById(R.id.takePic);
        call = findViewById(R.id.call);



        back.setOnClickListener(this);
        gallery.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view)
    {
        if(view == back)
        {
            finish();
            startActivity(new Intent( this, MainControlActivity.class));
        }

        if(view == gallery)
        {
            finish();
            startActivity(new Intent(this,Pictures.class));
        }
    }
}
