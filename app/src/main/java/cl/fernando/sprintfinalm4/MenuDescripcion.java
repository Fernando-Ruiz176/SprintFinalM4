package cl.fernando.sprintfinalm4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import cl.fernando.sprintfinalm4.databinding.ActivityMenuDescripcionBinding;

public class MenuDescripcion extends AppCompatActivity {

    private ActivityMenuDescripcionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuDescripcionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //initListener();

    }

    //private void initListener() {

        //binding.btnlinkedin.setOnClickListener(new View.OnClickListener() {

            //@Override
            //public void onClick(View v) {
                //Intent intentLinkedin = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Fernando-Ruiz176"));
                //startActivity(intentLinkedin);
            //}

        //});
    //}


}