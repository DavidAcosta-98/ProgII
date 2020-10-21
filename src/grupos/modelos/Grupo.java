
package grupos.modelos;

import autores.modelos.Autor;
import java.util.ArrayList;
import java.util.Objects;

public class Grupo {
    private String nombre;
    private String descripcion;
    ArrayList <MiembroEnGrupo> miembros = new ArrayList<>();
    
    
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    public void mostrar(){
        System.out.println("Datos del grupo: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Miembros: ");
        for(MiembroEnGrupo m : miembros)
            m.mostrar();
        System.out.println("****************************************");
    }

    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public ArrayList<MiembroEnGrupo> verMiembros() {
        return miembros;
    }

    public void agregarMiembro(Autor autor , Rol rol) {
       MiembroEnGrupo meg = new MiembroEnGrupo(autor,this,rol);
       
       if(this.nombre.equalsIgnoreCase("Super Administradores")){
           if (rol.getValor().equalsIgnoreCase(Rol.ADMINISTRADOR.getValor())) 
                miembros.add(meg);
       }else{
              if(!miembros.contains(meg))
                 miembros.add(meg);
       }
       
     }
       
    public void quitarMiembro(Autor miembro){
        
        for(MiembroEnGrupo meg : miembros){
            if(meg.getAutor().equals(miembro)){
                miembros.remove(meg);
            }   
        }  
    }
    
    public boolean esSuperAdministradores(){
    
        if(this.nombre.equalsIgnoreCase("Super Administradores")){
            return true;
        }else{ 
            return false; 
        }
    }
    
    public boolean tieneMiembros(){
        if(!miembros.isEmpty()){
            System.out.println("El Grupo tiene al menos un miembro");
            return true;
        }else{
            System.out.println("Este Grupo no tiene miembros");
            return false;
        }         
    } 

    
    }
