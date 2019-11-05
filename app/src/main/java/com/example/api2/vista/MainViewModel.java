package com.example.api2.vista;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.api2.model.Resultado;
import com.example.api2.model.Resultados;
import com.example.api2.request.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String>lista;


    public LiveData<String>getLista(){
        if(lista==null){
            lista= new MutableLiveData<>();
        }
        return lista;
    }

    public void buscarVM(){
        Call<Resultado> datos= ApiClient.getMyApiInterface().leer();
        datos.enqueue(new Callback<Resultado>() {
            @Override
            public void onResponse(Call<Resultado> call, Response<Resultado> response) {
                if(response.isSuccessful()){
                    Resultados resultados= response.body();
                    StringBuffer
                            cadena = new StringBuffer();
                    Log.d("mensaje",resultados.getResults().size()+"");
                    for (Resultado it:resultados.getResults()){
                        cadena.append(it.getNombre()+"\n");
                    }
                    lista.postValue(cadena.toString());
                }
            }

            @Override
            public void onFailure(Call<Resultado> call, Throwable t) {
                lista.postValue(t.getMessage());
            }
        });

    }



}
