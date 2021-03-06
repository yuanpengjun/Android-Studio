package com.thisway.app_led_demo;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button = null;
    private Boolean ledon = false;
    private CheckBox checkbox1 = null;
    private CheckBox checkbox2 = null;
    private CheckBox checkbox3 = null;
    private CheckBox checkbox4 = null;
    class MyButtonListenter implements View.OnClickListener{
        public void onClick(View v){
            ledon = !ledon;
            if(ledon) {
                button.setText("ALL LED OFF");
                checkbox1.setChecked(true);
                checkbox2.setChecked(true);
                checkbox3.setChecked(true);
                checkbox4.setChecked(true);
            }
            else {
                button.setText("ALL LED ON");
                checkbox1.setChecked(false);
                checkbox2.setChecked(false);
                checkbox3.setChecked(false);
                checkbox4.setChecked(false);
            }
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.Led1:
                if (checked)
                    Toast.makeText(getApplicationContext(), "LED1 light on", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "LED1 light off", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Led2:
                if (checked)
                    Toast.makeText(getApplicationContext(), "LED2 light on", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "LED2 light off", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Led3:
                if (checked)
                    Toast.makeText(getApplicationContext(), "LED3 light on", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "LED3 light off", Toast.LENGTH_SHORT).show();
                break;
            case R.id.Led4:
                if (checked)
                    Toast.makeText(getApplicationContext(), "LED4 light on", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "LED4 light off", Toast.LENGTH_SHORT).show();
                break;
            // TODO: Veggie sandwich

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        checkbox1 = (CheckBox)findViewById(R.id.Led1);
        checkbox2 = (CheckBox)findViewById(R.id.Led2);
        checkbox3 = (CheckBox)findViewById(R.id.Led3);
        checkbox4 = (CheckBox)findViewById(R.id.Led4);
        button.setOnClickListener(new MyButtonListenter());
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
