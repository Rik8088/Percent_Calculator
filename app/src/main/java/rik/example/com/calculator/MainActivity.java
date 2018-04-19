package rik.example.com.calculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static rik.example.com.calculator.R.id.txtresult;

public class MainActivity extends AppCompatActivity {

    private EditText entper;
    private EditText entnum;
    private Button cal;
    private TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        entper = (EditText)findViewById(R.id.entper);
        entnum = (EditText)findViewById(R.id.entnum);
        cal= (Button) findViewById(R.id.cal);
        txtresult=(TextView)findViewById(R.id.txtresult);


        cal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                float per=Float.parseFloat(entper.getText().toString());
                float dec=Float.parseFloat(entper.getText().toString())/100;
                float resu= Float.parseFloat(entnum.getText().toString())*dec;

                txtresult.setText(Float.toString(resu));




            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
