package com.marufahmed.chap01practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView Text, Text2, Text3, Text4, Text5;
    Button button, button2, button3, button4, button5;
    EditText n1, n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//          Editable place



            button = findViewById(R.id.button);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            button4 = findViewById(R.id.button4);
            button5 = findViewById(R.id.button5);


//      ADDING
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    n1 = findViewById(R.id.n1);
                    n2 = findViewById(R.id.n2);
                    Text = findViewById(R.id.Text);

                    int sum = Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                    Text.setText("The sum = "+sum);

                }
            });
        //     SUBTRACT
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = findViewById(R.id.n1);
                n2 = findViewById(R.id.n2);
                Text2 = findViewById(R.id.Text2);

                int sum = Integer.parseInt(n1.getText().toString())-Integer.parseInt(n2.getText().toString());
                Text2.setText("The sum = "+sum);

            }
        });
        //     DIVITION
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = findViewById(R.id.n1);
                n2 = findViewById(R.id.n2);
                Text3 = findViewById(R.id.Text3);

                int sum = Integer.parseInt(n1.getText().toString())/Integer.parseInt(n2.getText().toString());
                Text3.setText("The sum = "+sum);

            }
        });
        //     MULTIPLE
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = findViewById(R.id.n1);
                n2 = findViewById(R.id.n2);
                Text4 = findViewById(R.id.Text4);

                int sum = Integer.parseInt(n1.getText().toString())*Integer.parseInt(n2.getText().toString());
                Text4.setText("The sum = "+sum);

            }
        });
        //     MODULAS
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1 = findViewById(R.id.n1);
                n2 = findViewById(R.id.n2);
                Text5 = findViewById(R.id.Text5);

                int sum = Integer.parseInt(n1.getText().toString())%Integer.parseInt(n2.getText().toString());
                Text5.setText("The sum = "+sum);

            }
        });
            //Text.setText("  GOOD MORNING!");


        //Toast.makeText(this, "GOOD MORNING!", Toast.LENGTH_SHORT).show();
    }
}