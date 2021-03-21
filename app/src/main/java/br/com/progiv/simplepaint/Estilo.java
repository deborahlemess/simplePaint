package br.com.progiv.simplepaint;

import android.graphics.Color;
import android.graphics.Paint;


public class Estilo {

    public static Paint getEstilosParaLinha(){
            Paint estiloLinha = new Paint();
        estiloLinha.setAntiAlias(true);
        estiloLinha.setColor(Color.BLUE);
        estiloLinha.setStyle(Paint.Style.STROKE);
        estiloLinha.setStrokeWidth(4f);
        estiloLinha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinha;
        }

    public static Paint getEstilosParaLinhaVermelha(){
        Paint estiloLinhaVermelha = new Paint();
        estiloLinhaVermelha.setAntiAlias(true);
        estiloLinhaVermelha.setColor(Color.RED);
        estiloLinhaVermelha.setStyle(Paint.Style.STROKE);
        estiloLinhaVermelha.setStrokeWidth(4f);
        estiloLinhaVermelha.setStrokeJoin(Paint.Join.ROUND);
        return estiloLinhaVermelha;
    }

    public static Paint getEstiloPessoal() {
        Paint estiloLivre = new Paint();
        estiloLivre.setAntiAlias(true);
        estiloLivre.setColor(Color.CYAN);
        estiloLivre.setStyle(Paint.Style.FILL);
        estiloLivre.setStrokeWidth(24f);
        estiloLivre.setStrokeJoin(Paint.Join.ROUND);
        return estiloLivre;
    }
}


