package com.marufahmed.unitcnvrtx;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Creating  private variable
    private Button button;
    private TextView textView;
    private EditText editText;
    private TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        textView4 = findViewById(R.id.textView4);

//  FIRST WAY!(01)
       /* button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //collect strings from EditText BOX
                String s = editText.getText().toString();
                // Convert String to INT
                int kg = Integer.parseInt(s);
                // Calculate kg to pounds
                double pound = 2.250 * kg;
                //Show the text in app
                editText.setText("     "+kg+" KG = "+pound+" Pound");
                // Toast.makeText(MainActivity.this, this.msg, Toast.LENGTH_SHORT).show();
                }
            });
         }*/



    }



// OTHER WAY(02)
        public void calculate(View view){

            textView4 = findViewById(R.id.textView4);

            String s = editText.getText().toString();
            int kg = Integer.parseInt(s);
            double pound = 2.250 * kg;
            textView4.setText(kg+" KG = "+pound+" Pound");
        }



}