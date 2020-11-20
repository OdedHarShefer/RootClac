package com.example.rootclac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class MainActivity extends AppCompatActivity {

    EditText eta;
    EditText etb;
    EditText etc;

    TextView x1;
    TextView x2;

    int a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eta = findViewById(R.id.editTextA);
        etb = findViewById(R.id.editTextB);
        etc = findViewById(R.id.editTextC);

        x1 = findViewById(R.id.textViewX1);
        x2 = findViewById(R.id.textViewX2);
    }

    public void calc(View view) {
        a = Integer.parseInt(eta.getText().toString());
        b = Integer.parseInt(etb.getText().toString());
        c = Integer.parseInt(etc.getText().toString());

        x1.setText((-b + sqrt(b * b - 4 * a * c)) / 2 * a + "");
        x2.setText((-b - sqrt(b * b - 4 * a * c)) / 2 * a + "");
    }
}