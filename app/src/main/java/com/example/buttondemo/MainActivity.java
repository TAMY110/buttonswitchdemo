package com.example.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    private boolean open = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(open == true){
                    Toast.makeText(MainActivity.this, "open = "+open,Toast.LENGTH_LONG).show();
                    open = false;
                }else {
                    Toast.makeText(MainActivity.this,"open = "+open,Toast.LENGTH_LONG).show();
                    open = true;
                }
            }
        });
    }
}
