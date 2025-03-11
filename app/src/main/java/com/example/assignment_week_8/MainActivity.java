package com.example.assignment_week_8;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //declare the input and output variables
    private EditText firstNum, secondNum;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //find the input and output variables
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        result = findViewById(R.id.result);
    }
    //functions for the buttons
    public void addNumbers(View view) {
        double num1 = Double.parseDouble(firstNum.getText().toString());
        double num2 = Double.parseDouble(secondNum.getText().toString());
        double sum = num1 + num2;
        result.setText(String.valueOf(sum));
    }
    public void minusNumbers(View view) {
        double num1 = Double.parseDouble(firstNum.getText().toString());
        double num2 = Double.parseDouble(secondNum.getText().toString());
        double sum = num1 - num2;
        result.setText(String.valueOf(sum));
    }
    public void multiNumbers(View view) {
        double num1 = Double.parseDouble(firstNum.getText().toString());
        double num2 = Double.parseDouble(secondNum.getText().toString());
        double sum = num1 * num2;
        result.setText(String.valueOf(sum));
    }
    public void divideNumbers(View view) {
        double num1 = Double.parseDouble(firstNum.getText().toString());
        double num2 = Double.parseDouble(secondNum.getText().toString());
        double sum = num1 / num2;
        result.setText(String.valueOf(sum));
    }
}