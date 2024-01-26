package es.travelworld.login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buscamos la vista a clickar
        TextView textView = findViewById(R.id.tv_registrar);
        TextView textView2 = findViewById(R.id.tv_recuperar);

        // inicializamos la snackbar con la info a mostrar
        Snackbar snackbar = Snackbar.make(findViewById(R.id.container).getRootView(), "Proximamente...", Snackbar.LENGTH_SHORT);
        Snackbar snackbar2 = Snackbar.make(findViewById(R.id.container).getRootView(), "Proximamente...", Snackbar.LENGTH_SHORT);

        // le decimos a nuestra vista que cuando la clicken, muestre el snackbar
        textView.setOnClickListener(v -> snackbar.show());
        textView2.setOnClickListener(v -> snackbar.show());


    }

}