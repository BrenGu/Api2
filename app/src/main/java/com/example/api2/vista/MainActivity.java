package com.example.api2.vista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.api2.R;

public class MainActivity extends AppCompatActivity {
    private TextView salida;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configView();
    }

    public void configView(){
        salida=findViewById(R.id.tvsalida);
        mainViewModel= ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getLista().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                salida.setText(s);
            }
        });
    }

    public void buscar(View v){
        mainViewModel.buscarVM();

    }
}
