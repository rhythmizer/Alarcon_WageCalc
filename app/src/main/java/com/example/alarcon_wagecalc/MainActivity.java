package com.example.alarcon_wagecalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed1 = findViewById(R.id.empsal);
        ed2 = findViewById(R.id.emptax);
        ed3 = findViewById(R.id.netsal);
        ed4 = findViewById(R.id.empname);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");

                ed4.requestFocus();

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double salary = Double.parseDouble(ed1.getText().toString());
                double tax;

                if(salary > 50000)

                {
                    tax =  salary * 10/100;

                }

                else if(salary > 30000)
                {

                    tax =  salary * 5/100;
                }

                else
                {
                    tax = 0;
                }

                ed2.setText(String.valueOf(tax));
                double netsal = salary - tax;
                ed3.setText(String.valueOf(netsal));
            }
        });

    }
}