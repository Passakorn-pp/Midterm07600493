package th.ac.su.midterm07600493;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import th.ac.su.midterm07600493.mode.Auth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailText = findViewById(R.id.email_edit_text);
                EditText passwordText = findViewById(R.id.password_edit_text);
                String inputEmail = emailText.getText().toString();
                String inputPassword = passwordText.getText().toString();


                Auth auth = new Auth();
                auth.setmEmail(inputEmail);
                auth.setmPassword(inputPassword);

                int result = auth.check();
                if (result==1) {
                    Intent intent = new Intent(MainActivity.this,User1.class);
                    intent.putExtra("user1","aaa");
                    startActivity(intent);

                }
                if (result==2) {
                    Intent intent = new Intent(MainActivity.this,User2.class);
                    intent.putExtra("user2","bbb");
                    startActivity(intent);

                }
            }
        });
    }
}
