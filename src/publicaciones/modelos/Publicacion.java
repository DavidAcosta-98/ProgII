
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

public class Publicacion {
    
    private String titulo;
    private LocalDate fechaPublicacion;
    private String enlace;
    private String resumen;
    private ArrayList<PalabraClave> palabrasClave = new ArrayList<>();
    private Lugar unLugar;
    private Idioma unIdioma;
    private Tipo unTipo;
    private MiembroEnGrupo miembro;

    public Publicacion(String titulo, MiembroEnGrupo miembro, LocalDate fechaPublicacion, Tipo unTipo, Idioma unIdioma, Lugar unLugar,ArrayList<PalabraClave> palabrasClave, String enlace, String resumen) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.unLugar = unLugar;
        this.unIdioma = unIdioma;
        this.unTipo = unTipo;
        this.miembro = miembro;
        this.palabrasClave = palabrasClave;
    }

    public void mostrar(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + miembro.getAutor().getNombres() + ", " + miembro.getAutor().getApellidos());
        System.out.println("Grupo: " + miembro.getUnGrupo().verNombre());
        System.out.println("Rol: " + miembro.getRol());
        System.out.println("Fecha de publicacion: " + fechaPublicacion);
        System.out.println("Tipo: " + unTipo);
        System.out.println("Idioma: " + unIdioma);
        System.out.println("Lugar: " + unLugar);
        System.out.println("Palabras claves");
        System.out.println("--------------------------------");
        for (PalabraClave p : palabrasClave)
            p.mostrar();
        System.out.println("\n");
        System.out.println("Enlace: " + enlace);
        System.out.println("Resumen: " + resumen);
        System.out.println("****************************************");
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public ArrayList<PalabraClave> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<PalabraClave> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public Lugar getUnLugar() {
        return unLugar;
    }

    public void setUnLugar(Lugar unLugar) {
        this.unLugar = unLugar;
    }

    public Idioma getUnIdioma() {
        return unIdioma;
    }

    public void setUnIdioma(Idioma unIdioma) {
        this.unIdioma = unIdioma;
    }

    public Tipo getUnTipo() {
        return unTipo;
    }

    public void setUnTipo(Tipo unTipo) {
        this.unTipo = unTipo;
    }

    public MiembroEnGrupo getMiembro() {
        return miembro;
    }

    public void setMiembro(MiembroEnGrupo miembro) {
        this.miembro = miembro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
      
}
