
package autores.modelos;

import javax.swing.DefaultComboBoxModel;

public class ModeloComboCargos extends DefaultComboBoxModel{

    public ModeloComboCargos() {
        for(Cargo cargo : Cargo.values())
            this.addElement(cargo);
    }
    
    public Cargo ObtenerCargo(){
        return (Cargo)this.getSelectedItem();
    }
    
    public void SeleccionarCargo(Cargo cargo){
        this.setSelectedItem(cargo);
    }
    
}
