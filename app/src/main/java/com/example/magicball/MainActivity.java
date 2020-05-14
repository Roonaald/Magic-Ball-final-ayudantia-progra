package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView ball;
    private TextView respuesta;
    private String [] respuestaArray = {"No lo se, tu dime","Quizas","No puedo responder eso","Probablemente","Afortunadamente si","No me cuentes tu vida crack","Yo creo que si",
    "No lo se, No me importa","Que pena tu vida","No cuentes con ello","F","Que triste","JA, no","Deja de perder tiempo","Ya valiste"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ball = findViewById(R.id.boton);

        respuesta= findViewById(R.id.respuesta);

        ball.setOnClickListener ((View.OnClickListener) this);

        Toast.makeText(MainActivity.this, "Bienvenido a la esfera magica!", Toast.LENGTH_LONG  ).show ();
        Toast.makeText(MainActivity.this, "Piensa en una pregunta y luego presiona la esfera", Toast.LENGTH_LONG  ).show ();


    }

    @Override
    public void onClick (View v){


        switch (v.getId()){

            case R.id.boton:
                int rand = new Random().nextInt(respuestaArray.length);
                  respuesta.setText(respuestaArray[rand]);
                  break;
        }
        Toast.makeText(MainActivity.this, "LA ESFERA A HABLADO!", Toast.LENGTH_SHORT  ).show ();

        Toast.makeText(MainActivity.this, "PRUEBA OTRA VEZ", Toast.LENGTH_SHORT  ).show ();
        Toast.makeText(MainActivity.this, "Piensa en una pregunta y luego presiona la esfera", Toast.LENGTH_SHORT  ).show ();
    }


}
