
package lugares.modelos;

import java.util.Objects;

public class Lugar {
    
    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar(Lugar unLugar){
        System.out.println(unLugar);
        System.out.println("****************************************");
    }
    
    @Override
    public String toString() {
        return "Lugar: " + nombre;
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.nombre);
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
        final Lugar other = (Lugar) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
      
}
