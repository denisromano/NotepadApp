package br.com.fiap.notepadapp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by logonrm on 27/11/2017.
 */

public class Nota {

    private String id;
    private String titulo;
    @SerializedName(value = "descricao")
    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
