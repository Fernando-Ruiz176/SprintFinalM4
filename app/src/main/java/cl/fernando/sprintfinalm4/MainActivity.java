package cl.fernando.sprintfinalm4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.fernando.sprintfinalm4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idBtnInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityMenuDescripcion = new Intent(getBaseContext(),
                        MenuDescripcion.class);
                startActivity(activityMenuDescripcion);
            }
        });

    }

    }