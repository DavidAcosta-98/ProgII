
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.modelos.Rol;
import java.util.ArrayList;

public class Autor {
    
    private int dni;
    private String apellidos;
    private String nombres;
    private String clave;
    ArrayList <MiembroEnGrupo> grupos = new ArrayList<>();

    public Autor(int dni, String apellidos, String nombres, String clave) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.clave = clave;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public void mostrar(){
        System.out.println("[ " + dni + " ] " + apellidos + ", "  + nombres);
        System.out.println("Clave: " + clave);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.dni;
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
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    public ArrayList<MiembroEnGrupo> verGrupos() {
        return grupos;
    }

    public void agregarGrupo(Grupo grupo, Rol rol) {
       MiembroEnGrupo meg = new MiembroEnGrupo(this,grupo,rol); 
        
       if(!grupos.contains(meg))
          grupos.add(meg);
        
    }
    
    public void quitarGrupo(Grupo grupo){
            for(MiembroEnGrupo meg : grupos){
                if(meg.getUnGrupo().equals(grupo))
                    grupos.remove(meg);
            }       
    }
    
    public boolean esSuperAdministrador(){
    
        for(MiembroEnGrupo meg : grupos){
            if(meg.getUnGrupo().esSuperAdministradores()){
                return true;
            }    
        }
        
        return false;
    }
    
}
