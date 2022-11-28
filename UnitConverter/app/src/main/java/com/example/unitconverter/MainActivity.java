package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_text, result_text;
    Button btn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome_text = findViewById((R.id.welcome_text));
        result_text = findViewById((R.id.result_textView));
        btn = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double input_kilos = Double.parseDouble(editText.getText().toString());
                result_text.setText(""+convertKgToPounds(input_kilos));
            }
        });
    }

    public double convertKgToPounds(double kilos) {
        double pounds_result = kilos*2.20462;
        return pounds_result;
    }
}