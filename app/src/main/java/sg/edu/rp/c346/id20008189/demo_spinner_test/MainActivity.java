package sg.edu.rp.c346.id20008189.demo_spinner_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        spn=findViewById(R.id.spn);
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              switch(position){
                  case 0:
                      tv.setText("Spinner item, Yes Selected");
                      break;
                  case 1:
                      tv.setText("Spinner item,No Selected");
                      break;

              }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}