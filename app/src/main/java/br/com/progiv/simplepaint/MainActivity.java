package br.com.progiv.simplepaint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewCanvas viewCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewCanvas = findViewById(R.id.area_desenho);
    }


    public void LimparDesenho(View view) {
        viewCanvas.limparCanvas();
    }


    public void corVermelha(View view) {
        viewCanvas.inicializaObjetosVermelhos();
    }
    

    public void estiloPessoal(View view) {
        viewCanvas.inicializaObjetosPessoal();
    }
}