package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private float celstofor(float celsium){

        return (((celsium * 9)/5) + 32);
    }

    public void onClick(View view){
        EditText inputEditText = (EditText) findViewById(R.id.editText);
        TextView outputTextView = (TextView) findViewById(R.id.textView2);

        if (inputEditText.getText().length() == 0){
            Toast.makeText(getApplicationContext(),"Введите градусы",
            Toast.LENGTH_LONG).show();
        }
        else {

            float inputValue = Float.parseFloat(inputEditText.getText().toString());

            String degrease = celstofor(inputValue) + " фаренгейт";

            outputTextView.setText(degrease);
        }
    }
}
