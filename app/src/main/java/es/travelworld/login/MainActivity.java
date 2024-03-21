package es.travelworld.login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.ViewDataBinding;

import com.google.android.material.snackbar.Snackbar;

import es.travelworld.login.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // inicializamos la snackbar con la info a mostrar
        Snackbar snackbar = Snackbar.make(findViewById(R.id.container).getRootView(), "Proximamente...", Snackbar.LENGTH_SHORT);
        Snackbar snackbar2 = Snackbar.make(findViewById(R.id.container).getRootView(), "Proximamente...", Snackbar.LENGTH_SHORT);

        // le decimos a nuestra vista que cuando la clicken, muestre el snackbar
        binding.tietUsuario.setOnClickListener(v -> snackbar.show());
        binding.tietContrasena.setOnClickListener(v -> snackbar.show());

        binding.bLogin.setOnClickListener(v -> {
            binding.tietUsuario.setText("");
            binding.tietContrasena.setText("");
            binding.tietContrasena.clearFocus();
        });
    }

}