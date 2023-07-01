package cl.fernando.sprintfinalm4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import cl.fernando.sprintfinalm4.databinding.ActivityMenuDescripcionBinding;

public class MenuDescripcion extends AppCompatActivity {

    private ActivityMenuDescripcionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuDescripcionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListener();

    }

    private void initListener() {

        binding.btnlinkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/tecnologiadeprogramacion"));
                startActivity(intentLinkedin);
            }
        });

        binding.btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                String numeroTelefono = "+56977665544";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + numeroTelefono));
                startActivity(intent);
            }
        });

        binding.btnContactame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vista) {

                String emailText = binding.editTextMail.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"fernando.ruizfarias08@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Nuevo Mensaje");
                intent.putExtra(Intent.EXTRA_TEXT, emailText);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });


    }


}