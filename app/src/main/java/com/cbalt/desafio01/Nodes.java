package com.cbalt.desafio01;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Nodes {

    DatabaseReference root = FirebaseDatabase.getInstance().getReference();
    DatabaseReference desafio01 = root.child("desafioE8");
    DatabaseReference desafio02 = root.child("desafioE82");

    public Nodes() {
    }

    public Nodes(DatabaseReference root) {
        this.root = root;
    }

    public DatabaseReference getRoot() {
        return root;
    }

    public void setRoot(DatabaseReference root) {
        this.root = root;
    }

    public DatabaseReference getDesafio02() {
        return desafio02;
    }

    public void setDesafio02(DatabaseReference desafio02) {
        this.desafio02 = desafio02;
    }

    /*Desafio 01*/
    DatabaseReference address = desafio01.child("clients").child("jhkkjnkjn").child("address");



}
