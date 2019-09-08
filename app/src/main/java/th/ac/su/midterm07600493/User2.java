package th.ac.su.midterm07600493;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import th.ac.su.midterm07600493.mode.Auth;

public class User2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("user2");
        Auth auth = new Auth();
        Toast.makeText(User2.this,"Welcome "+auth.checkname(name), Toast.LENGTH_SHORT).show();
    }
}
