package com.example.akki.calc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Akki on 22-04-2016.
 */
public class calc extends AppCompatActivity {

    Button a,s,m,d;
    EditText o1,o2;
    TextView rv;
    Toolbar tb;
    float a1=0,a2=0,r=0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        tb=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle(R.string.cal);
        a=(Button)findViewById(R.id.addid);
        s=(Button)findViewById(R.id.subid);
        m=(Button)findViewById(R.id.mulid);
        d=(Button)findViewById(R.id.divid);
        o1=(EditText)findViewById(R.id.fnid);
        o2=(EditText)findViewById(R.id.snid);
        rv=(TextView)findViewById(R.id.rid);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Float.parseFloat(o1.getText().toString());
                a2= Float.parseFloat(o2.getText().toString());
                r=a1+a2;
                rv.setText(" = " + r);
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Float.parseFloat(o1.getText().toString());
                a2= Float.parseFloat(o2.getText().toString());
                r=a1-a2;
                rv.setText(" = "+r);

            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Float.parseFloat(o1.getText().toString());
                a2= Float.parseFloat(o2.getText().toString());
                r=a1*a2;
                rv.setText(" = "+r);


            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1= Float.parseFloat(o1.getText().toString());
                a2= Float.parseFloat(o2.getText().toString());
                r=a1/a2;
                rv.setText(" = "+r);

            }
        });


    }
}
