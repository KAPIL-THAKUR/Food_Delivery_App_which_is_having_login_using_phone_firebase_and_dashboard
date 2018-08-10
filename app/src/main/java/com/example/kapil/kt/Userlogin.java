package com.example.kapil.kt;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Userlogin extends AppCompatActivity {

    Button button;
    FirebaseAuth firebaseAuth;
    ImageView imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,imageView19,imageView20,imageView21,imageView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        firebaseAuth=FirebaseAuth.getInstance();
        imageView13=findViewById(R.id.imageView13);
        imageView14=findViewById(R.id.imageView14);
        imageView15=findViewById(R.id.imageView15);
        imageView16=findViewById(R.id.imageView16);
        imageView17=findViewById(R.id.imageView17);
        imageView18=findViewById(R.id.imageView18);
        imageView19=findViewById(R.id.imageView19);
        imageView20=findViewById(R.id.imageView20);
        imageView21=findViewById(R.id.imageView21);
        imageView22=findViewById(R.id.imageView22);


        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                finish();
                Toast.makeText(Userlogin.this,"Logout Sucessfull",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Userlogin.this,SplashActivity.class));




            }
        });

    }
}
