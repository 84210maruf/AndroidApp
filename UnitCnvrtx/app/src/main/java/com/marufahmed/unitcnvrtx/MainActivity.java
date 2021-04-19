package com.marufahmed.unitcnvrtx;

import androidx.appcompat.app.AppCompatActivity;

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            String msg = "Hi It's me!";
            @Override
            public void onClick(View v) {

                //collect strings from EditText BOX
                String s = editText.getText().toString();
                // Convert String to INT
                int kg = Integer.parseInt(s);
                // Calculate kg to pounds
                double pound = 2.250 * kg;
                //Show the text in app
                textView.setText("The corresponding value in POUND is "+pound);
                Toast.makeText(MainActivity.this, this.msg, Toast.LENGTH_SHORT).show();

            }
        });
    }



}