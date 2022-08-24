/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Fabricas;
import Checks.*;
import Botones.*;
/**
 *
 * @author lenin
 */

public interface GUIFactory {
    IBotones CrearBoton();
    ICheck CrearCheckButton();
}
