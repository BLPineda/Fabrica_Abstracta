/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Botones.Botones_para_windows;
import Botones.IBotones;
import Checks.BotonChequeo_para_Mac;
import Checks.BotonChequeo_para_Windows;
import Checks.ICheck;

/**
 *
 * @author lenin
 */
public class Fabrica_Windows implements GUIFactory {

    @Override
    public IBotones CrearBoton() {
        return new Botones_para_windows();
    }

    @Override
    public ICheck CrearCheckButton() {
        return new BotonChequeo_para_Windows();
    }
    
}
