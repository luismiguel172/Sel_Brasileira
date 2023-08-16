package br.com.etecia.myapp;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.etecia.myapp.databinding.SelbrasileiraLayoutBinding;

public class Selbrasileira_Activity extends AppCompatActivity {

    RecyclerView idRecyclerView;
    List<Jogadoras> jogadorasList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        idRecyclerView = findViewById(R.id.idSelBrasileira);
        jogadorasList = new ArrayList<>();

        jogadorasList.add(
                new Jogadoras("")
        )


    }
}