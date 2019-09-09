package th.ac.su.midterm07600470;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent(); //เข้าถึง Intent ที่ส่งมาจากต้นทาง
        String user = intent.getStringExtra("user");
        String live = intent.getStringExtra("live");
        String school = intent.getStringExtra("school");

        TextView TextName = findViewById(R.id.nameProfile);
        TextView TextLive = findViewById(R.id.textFrom);
        TextView TextSchool = findViewById(R.id.textSchool);
        TextName.setText(user);
        TextLive.setText(live);
        TextSchool.setText(school);

    }
}
