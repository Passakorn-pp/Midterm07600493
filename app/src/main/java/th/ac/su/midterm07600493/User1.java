package th.ac.su.midterm07600493;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import th.ac.su.midterm07600493.mode.Auth;

public class User1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user1);
        Intent intent = getIntent();
        String name = intent.getStringExtra("user1");
        Auth auth = new Auth();
        Toast.makeText(User1.this,"Welcome "+auth.checkname(name), Toast.LENGTH_SHORT).show();

    }
}
