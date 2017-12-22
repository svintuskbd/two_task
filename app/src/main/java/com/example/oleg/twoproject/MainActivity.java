package com.example.oleg.twoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button clean;
    Button print;
    String memberText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.hello_world);
        clean = (Button) findViewById(R.id.clean);
        print = (Button) findViewById(R.id.print);

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                if (text != null && !text.isEmpty()) {
                    memberText = text;
                    editText.setText("");
                }
            }
        });

        print.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (memberText != null && !memberText.isEmpty()) {
                    editText.setText(memberText);
                }
            }
        });
    }
}
