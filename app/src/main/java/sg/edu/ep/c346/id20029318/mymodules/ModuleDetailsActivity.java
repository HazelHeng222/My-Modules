package sg.edu.ep.c346.id20029318.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// **Late Submission

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView modDetails;
    Button butBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        modDetails = findViewById(R.id.modDetails);
        butBack = findViewById(R.id.butBack);

        Intent intentReceived = getIntent();
        String modCode = intentReceived.getStringExtra("modCode");
        String details = "";

        if (modCode.equals("C218")) {
             details += "Module Code: C218\n" + "Module Name: UI/UX Design\n"
                    + "Academic Year: 2021" + "\nSemester: 1\n "
                    + "Module Credit: 4\n" + "Venue: W64G";
        }
        if (modCode.equals("C346")) {
             details += "Module Code: C346\n" + "Module Name: Mobile App Development\n"
                    + "Academic Year: 2021" + "\nSemester: 1\n "
                    + "Module Credit: 4\n" + "Venue: E62E";
        }
        if (modCode.equals("C203")) {
             details += "Module Code: C203\n" + "Module Name: Web App Development in php\n"
                    + "Academic Year: 2021" + "\nSemester: 1\n "
                    + "Module Credit: 4\n" + "Venue: W67M";
        }

        modDetails.setText(details);


        butBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); //end current ModuleDetailsActivity, onResume() MainActivity
            }
        });

    }
}
