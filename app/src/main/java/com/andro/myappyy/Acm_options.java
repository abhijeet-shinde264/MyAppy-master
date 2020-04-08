package com.andro.myappyy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

public class Acm_options extends AppCompatActivity {


   LinearLayout cd1,cd2;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acm_options);
        cd1=findViewById(R.id.cd_acm);
        cd2=findViewById(R.id.cd2_acm);


        auth=FirebaseAuth.getInstance();
       // getSupportActionBar().setTitle("MyAppy");









        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Acm_options.this,Main3Activityacm.class);//add event
                startActivity(intent);
            }
        });
        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Acm_options.this,Main3Activityacm_retrieve.class);//show event
                startActivity(intent);
            }
        });
    }


}
