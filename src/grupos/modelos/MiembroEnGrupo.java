
package grupos.modelos;

import autores.modelos.Autor;
import java.util.Objects;

public class MiembroEnGrupo {
    
    private Grupo unGrupo;
    private Rol rol;
    private Autor autor;

    
    public MiembroEnGrupo(Autor autor, Grupo unGrupo, Rol rol) {
        this.unGrupo = unGrupo;
        this.rol = rol;
        this.autor = autor;
    }

    public Grupo getUnGrupo() {
        return unGrupo;
    }

    public void setUnGrupo(Grupo unGrupo) {
        this.unGrupo = unGrupo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.autor);
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }
    
    public void mostrar(){
        System.out.println("Autor: " + this.autor.getNombres() + ", " + this.autor.getApellidos() + " Rol: " + this.rol);
        System.out.println("Gupo: " + unGrupo.verNombre());
        System.out.println("");
    }
    
}
