/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicación;
import Botones.IBotones;
import Checks.ICheck;
import Fabricas.GUIFactory;
/**
 *
 * @author lenin
 */
public class Aplicacion {
    IBotones botones;
    ICheck check;

    public Aplicacion(GUIFactory fabrica) {
        botones = fabrica.CrearBoton();
        check = fabrica.CrearCheckButton();
    }
    
    public void paint(){
        botones.paint();
        check.paint();
    }
    
    
}
