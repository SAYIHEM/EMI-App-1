package de.davidgollasch.emiexercise1;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DigitSumActivity extends AppCompatActivity {

    private TextView textOutput;
    private EditText edit;
    private Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digit_sum);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.tuAkzentfarbe1BlauHell)));

        // Initialises the views and event listeners
        InitializeActivity();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeActivity() {
        textOutput = (TextView) findViewById(R.id.textOutputField);
        btnCalc = (Button) findViewById(R.id.btnCalculate);
        edit = (EditText) findViewById(R.id.editField);

        btnCalc.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){

                textOutput.setText("Test");

                CalculateDigitSum();
            }
        });
    }

    /**
     * Trigger the Digit Sum Calculation
     */
    private void CalculateDigitSum() {

        String string = edit.getText().toString();

        int number = Integer.parseInt(string);

        number = digitSum(number);

        textOutput.setText(Integer.toString(number));
        }

    private int digitSum(int n) {

        int sum = 0;

        while (n != 0) {

            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

}
