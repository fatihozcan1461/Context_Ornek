package com.example.context_ornek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void skipactivity1(View view)
    {
        Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
        startActivity( intent1 );

    }
}
