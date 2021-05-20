package sg.edu.ep.c346.id20029318.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// **Late Submission and so are the xml files

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;
    TextView mod3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.txtMod1);
        mod2 = findViewById(R.id.txtMod2);
        mod3 = findViewById(R.id.txtMod3);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                i.putExtra("ModCode", "C218");
                startActivity(i);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                i.putExtra("ModCode", "C346");
                startActivity(i);
            }
        });

        mod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                i.putExtra("ModCode", "C203");
                startActivity(i);
            }
        });
    }
}