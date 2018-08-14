package com.cbalt.desafio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.cbalt.desafio01.models.Credential;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView nameTv, departmentTv, jobTitleTv;
    DatabaseReference root;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTv = findViewById(R.id.nameTv);
        departmentTv = findViewById(R.id.departmentTv);
        jobTitleTv = findViewById(R.id.jobTitleTv);

        root = new Nodes().getDesafio02();

        root.child("credentials").child("00030").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Credential credential = dataSnapshot.getValue(Credential.class);

                if(credential != null){
                    nameTv.setText(credential.getName());
                    departmentTv.setText(credential.getDepartment());
                    jobTitleTv.setText(credential.getJobTitle());
                } else {
                    Toast.makeText(MainActivity.this, "Credencial no es válida", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
