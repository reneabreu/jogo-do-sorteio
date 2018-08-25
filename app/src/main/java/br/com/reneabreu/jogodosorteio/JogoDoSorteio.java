package br.com.reneabreu.jogodosorteio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class JogoDoSorteio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_do_sorteio);

        // Get Button
        Button btn_Play = findViewById(R.id.btn_Play);
        // Get Text
        final TextView txt_Feedback = findViewById(R.id.txtView_Feedback);

        // Set Button Behaviour
        btn_Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Click Behaviour", "Clicked and got number:" + GetRandomNumber());

                // Change text
                txt_Feedback.setText("Você selecionou o número: " + GetRandomNumber());
            }
        });
    }

    // Random Function
    private int GetRandomNumber() {
        // Create random variable
        Random randomNumber = new Random();

        // Return random int between 0, 100
        return randomNumber.nextInt(100);
    }

}
