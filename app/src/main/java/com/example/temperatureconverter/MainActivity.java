package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.temperatureconverter.model.Temp;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ctf = findViewById(R.id.c);
        Button ftc = findViewById(R.id.f);


        ctf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed);
                TextView tv = findViewById(R.id.tv);

                int ed1 = Integer.parseInt(ed.getText().toString());

                Temp temp = new Temp(ed1);

                double result = temp.TempCalToF();
                int re = (int)result;
                String resulttext = String.valueOf(re);
                tv.setText(resulttext);
                Log.i(TAG, "ความสูงหน่วยเมตร = "+ String.valueOf(result));


            }
        });

        ftc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed = findViewById(R.id.ed);
                TextView tv = findViewById(R.id.tv);

                int ed1 = Integer.parseInt(ed.getText().toString());

                Temp temp = new Temp(ed1);

                double result = temp.FToCal();
                int re = (int)result;
                String resulttext = String.valueOf(re);
                tv.setText(resulttext);
                Log.i(TAG, "ความสูงหน่วยเมตร = "+ String.valueOf(result));


            }
        });
    }
}
