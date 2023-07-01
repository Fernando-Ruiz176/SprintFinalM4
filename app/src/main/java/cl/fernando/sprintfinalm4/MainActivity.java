package cl.fernando.sprintfinalm4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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
                Intent activityMenu = new Intent(getBaseContext(), MenuDescripcion.class);
                startActivity(activityMenu);
            }
        });

    }

    }