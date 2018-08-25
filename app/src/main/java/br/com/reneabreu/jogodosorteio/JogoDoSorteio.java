package br.com.reneabreu.jogodosorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class JogoDoSorteio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_do_sorteio);

        // Get Button
        Button btn_Play = findViewById(R.id.btn_Play);

        // Set Button Behaviour
        btn_Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Click Behaviour", "Clicked and got number:" + GetRandomNumber());
            }
        });
    }

    private int GetRandomNumber() {
        Random randomNumber = new Random();

        return randomNumber.nextInt(101);
    }

}
