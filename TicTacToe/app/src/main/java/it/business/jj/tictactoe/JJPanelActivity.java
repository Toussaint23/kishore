package it.business.jj.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import it.business.jj.tictactoe.controller.TicTacToeController;

public class JJPanelActivity extends AppCompatActivity {
    private int level;
    private int starter;
    private int countPlayer;
    private TicTacToeController ticTacToeController;

    private ImageButton POINT00;
    private ImageButton POINT01;
    private ImageButton POINT02;
    private ImageButton POINT10;
    private ImageButton POINT11;
    private ImageButton POINT12;
    private ImageButton POINT20;
    private ImageButton POINT21;
    private ImageButton POINT22;
    private TextView player1;
    private TextView player2;
    private TextView score1;
    private TextView score2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjpanel);
        init();
    }


    private void init(){
        Bundle bundle = getIntent().getExtras();
        POINT00 = findViewById(R.id.btn00);
        POINT01 = findViewById(R.id.btn01);
        POINT02 = findViewById(R.id.btn02);
        POINT10 = findViewById(R.id.btn10);
        POINT11 = findViewById(R.id.btn11);
        POINT12 = findViewById(R.id.btn12);
        POINT20 = findViewById(R.id.btn20);
        POINT21 = findViewById(R.id.btn21);
        POINT22 = findViewById(R.id.btn22);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        score1 = findViewById(R.id.score1);
        score2 = findViewById(R.id.score2);

        level = bundle.getInt("level");
        starter = bundle.getInt("starter");
        countPlayer = bundle.getInt("countPlayer");
        //player1.setText("toto");
        //player2.setText(bundle.getString("player2"));
        ticTacToeController = new TicTacToeController();
    }

    public void move(View view){
        Toast.makeText(this, level+"", Toast.LENGTH_LONG).show();
        Toast.makeText(this, starter+"", Toast.LENGTH_LONG).show();
        Toast.makeText(this, countPlayer+"", Toast.LENGTH_LONG).show();
        //Toast.makeText(this, player2+"", Toast.LENGTH_LONG).show();
    }
}
