
package grupos.modelos;

public enum Rol {
    ADMINISTRADOR ("Administrador"),
    COLABORADOR("Colaborador");

    private String valor;

    private Rol(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
