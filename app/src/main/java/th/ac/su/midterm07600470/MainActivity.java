package th.ac.su.midterm07600470;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEditText = findViewById(R.id.user_edit_text);


                EditText passwordEditText = findViewById(R.id.password_edit_text);

                String inputUser = userEditText.getText().toString();

                String inputPassword = passwordEditText.getText().toString();
                if(inputUser.equals("bbb")&& inputPassword.equals("222")){
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("user","Promlert Lovichit");
                    intent.putExtra("School","สวนกุหลาบวิทยาลัย");
                    intent.putExtra("live","กรุงเทพมหานคร");
                    startActivity(intent);

                }
                else if(inputUser.equals("aaa")&& inputPassword.equals("111")){
                    Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                    intent.putExtra("user","Nopparat Suwanbamrung");
                    intent.putExtra("School","สายธรรมจันทร์");
                    intent.putExtra("live","ราชบุรี");
                    startActivity(intent);

                }
                else {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                            //todo
                        }
                    });
                    dialog.show();

                }

            }
        });

    }
}
