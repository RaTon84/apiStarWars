package models;

import java.net.http.HttpClient;

public class Peliculas {
    private String nombre;
    private String episodio;
    private String director;
    private String productor;
    private String anio;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEpisodio() {
        return episodio;
    }
    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getProductor() {
        return productor;
    }
    public void setProductor(String productor) {
        this.productor = productor;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    @Override
    public String toString() {
        return "Peliculas{" +
                "nombre='" + nombre +
                ", episodio='" + episodio +
                ", director='" + director +
                ", productor='" + productor +
                ", anio='" + anio +
                '}';
    }
}
