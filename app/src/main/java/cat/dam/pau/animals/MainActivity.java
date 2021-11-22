package cat.dam.pau.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    GridLayout gridLayout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();
        final int random_lleo = r.nextInt(10)+1;
        final int random_elefant = r.nextInt(10)+1;
        final TextView tv = findViewById(R.id.resultat);
        final ImageButton menor = (ImageButton) findViewById(R.id.menor);
        final ImageButton igual = (ImageButton) findViewById(R.id.igual);
        final ImageButton major = (ImageButton) findViewById(R.id.major);
        final GridLayout layout = (GridLayout) findViewById(R.id.GL_superior);
        menor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                if(random_lleo > random_elefant) {
                    tv.setText("Es correcte");
                }
                else tv.setText("Es Incorrecte!!!");
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                if(random_elefant == random_lleo) {
                    tv.setText("Es correcte");
                }
                else tv.setText("Es Incorrecte!!!");
            }
        });
        major.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                if(random_elefant > random_lleo) {
                    tv.setText("Es correcte");
                }
                else tv.setText("Es Incorrecte!!!");
            }
        });


        gridLayout = (GridLayout) findViewById(R.id.GL_superior);
        for (int i = 0; i <random_elefant ; i++) {
            ImageView n = new ImageView(this);
            n.setImageResource(R.drawable.elefant);
            n.setAdjustViewBounds(true);
            int alt = 100, ample=100;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ample, alt);
            n.setLayoutParams(params);
            gridLayout.addView(n);
        }
        gridLayout = (GridLayout) findViewById(R.id.GL_inferior);
        for (int i = 0; i <random_lleo ; i++) {
            ImageView n = new ImageView(this);
            n.setImageResource(R.drawable.lleo);
            n.setAdjustViewBounds(true);
            int alt = 100, ample=100;
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ample, alt);
            n.setLayoutParams(params);
            gridLayout.addView(n);
        }
    }
}