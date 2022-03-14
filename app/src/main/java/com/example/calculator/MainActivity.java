package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.input);

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString())){

                }
            }
        });
    }


    public void ZeroBTN(View view){

    }

    public void OneBTN(View view){

    }

    public void TwoBTN(View view){

    }

    public void ThreeBTN(View view){

    }

    public void FourBTN(View view){

    }
    public void FiveBTN(View view){

    }

    public void SixBTN(View view){

    }

    public void SevenBTN(View view){

    }

    public void EightBTN(View view){

    }

    public void NineBTN(View view){

    }

    public void AdditionBTN(View view){

    }

    public void SubstractionBTN(View view){

    }

    public void MultiplicationBTN(View view){

    }

    public void DivisionBTN(View view){

    }

    public void PercentageBTN(View view){

    }

    public void ExponentBTN(View view){

    }

    public void PointBTN(View view){

    }

    public void ClearBTN(View view){

    }

    public void BackspaceBTN(View view){

    }

    public void EqualsBTN(View view){

    }

}