package it.business.jj.tictactoe;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import org.w3c.dom.Text;

public class JJConfigurationActivity extends AppCompatActivity {

    private RadioGroup groupPlayer;
    private RadioGroup groupLevel;
    private RadioButton onePlayer;
    private RadioButton twoPlayers;
    private RadioButton easy;
    private RadioButton medium;
    private RadioButton hard;
    private Switch whoFirst;
    private EditText player1;
    private EditText player2;
    private Button start;
    private int countplayer = 1; /* 1 means one player, 2 means two players*/
    private int level = 0; /* 1 means easy, 2 means medium, 3 means hard*/
    private int starter = 1; /* 0 means computer, 1 means any human player*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jjconfiguration);
        init();
    }

    private void init(){
        groupPlayer = findViewById(R.id.groupplayer);
        groupLevel = findViewById(R.id.level);
        onePlayer = findViewById(R.id.oneplayer);
        twoPlayers = findViewById(R.id.twoplayers);
        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        hard = findViewById(R.id.hard);
        whoFirst = findViewById(R.id.switch1);
        player1 = findViewById(R.id.player1);
        player2 = findViewById(R.id.player2);
        start = findViewById(R.id.buttonstart);
    }


    public void selectPlayer(View view){
        if(groupPlayer.getCheckedRadioButtonId() == onePlayer.getId()){
            groupLevel.setClickable(false);
            easy.setEnabled(false);
            medium.setEnabled(false);
            hard.setEnabled(false);
            whoFirst.setEnabled(false);
            player2.setText("Jeanbot");
            player2.setEnabled(false);
            countplayer = 1;
        }else{
            groupLevel.setClickable(true);
            easy.setEnabled(true);
            medium.setEnabled(true);
            hard.setEnabled(true);
            whoFirst.setEnabled(true);
            player2.setText("");
            player2.setEnabled(true);
            level = 0;
            countplayer = 2;
        }
    }

    public void selectLevel(View view){
        if(groupLevel.getCheckedRadioButtonId() == easy.getId()){
            level = 1;
        }else if(groupLevel.getCheckedRadioButtonId() == medium.getId()){
            level = 2;
        }else {
            level = 3;
        }
    }

    public void selectStarter(View view){
        if(whoFirst.isSelected()){
            starter = 0;
        }else {
            starter = 1;
        }
    }

    public void startGame(View view){
        if(!player1.getText().toString().trim().equals("") && !player2.getText().toString().trim().equals("")){
            if(!player1.getText().toString().trim().equals(player2.getText().toString().trim())){
                Intent intent = new Intent(this, JJPanelActivity.class);
                intent.putExtra("starter", starter);
                intent.putExtra("level", level);
                intent.putExtra("countPlayer", countplayer);
                intent.putExtra("player1", player1.getText().toString());
                intent.putExtra("player2", player2.getText().toString());
                startActivity(intent);
                finish();
            }else{
                Toast.makeText(this, R.string.errorsamename, Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, R.string.erroremptyname, Toast.LENGTH_LONG).show();
        }
    }
}
