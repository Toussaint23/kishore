package it.business.jj.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JJMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjmain);
    }

    public void newGame(View view){
        Intent intent = new Intent(this, JJConfigurationActivity.class);
        startActivity(intent);
        finish();
    }
}
