package br.com.reneabreu.jogodosorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.Random;

public class JogoDoSorteio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_do_sorteio);

        // Get Button
        Button btn_Play = findViewById(R.id.btn_Play);

    }

    private int GetRandomNumber() {
        Random randomNumber = new Random();

        return randomNumber.nextInt(101);
    }

}
