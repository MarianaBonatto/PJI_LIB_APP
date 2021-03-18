package com.example.libapp;

import android.provider.MediaStore;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class QuestoesPI {

    private List<String> respostas = new ArrayList<>();
    private int respostaCerta;

    public QuestoesPI(int respostaCerta, String... respostas){
        this.respostas.add(respostas[0]);
        this.respostas.add(respostas[1]);
        this.respostas.add(respostas[2]);
        this.respostas.add(respostas[3]);
        this.respostas.add(respostas[4]);
        this.respostaCerta = respostaCerta;
    }

    public List<String> getRespostas() {
        return respostas;
    }

    public void setRespostas(List<String> respostas) {
        this.respostas = respostas;
    }

    public int getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(int respostaCerta) {
        this.respostaCerta = respostaCerta;
    }
}
