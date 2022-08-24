/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Aplicación.Aplicacion;
import Fabricas.*;
import java.util.Scanner;
/**
 *
 * @author lenin
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
     static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Aplicacion app = configuracion();
        app.paint();
    }
    
    private static Aplicacion configuracion(){
        Aplicacion app;
        GUIFactory fabrica;
        System.out.println("Escriba el sistema operativo que desea (MacOS o Windows");
        String Sistema = sc.next();
         if (Sistema.equals("Windows")){
             fabrica = new Fabrica_Windows();
         } else {
             fabrica = new Fabrica_Mac();
         } 
         app = new Aplicacion(fabrica);
         return app;
    }
}
