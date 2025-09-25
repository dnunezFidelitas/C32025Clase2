/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32025clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C32025Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad =18;
        //JOptionPane.showMessageDialog(null, edad);
      /*  
        if (true){
            JOptionPane.showMessageDialog(null, "Este codigo siempre se va imprimir pq la variable fija true");
        }
        
        if (false){
            JOptionPane.showMessageDialog(null, "Este codigo NUNCA se va imprimir pq la variable fija true");
        }
        
        if (edad >=18){
            JOptionPane.showMessageDialog(null, "TOMAR LICOR Y FUMAR");
        }
        if (edad >17){
            JOptionPane.showMessageDialog(null, "Ir a la carcel");
        }
        
        */
        /*
        if (edad =17){
            JOptionPane.showMessageDialog(null, "TOMAR LICOR Y FUMAR");
        }
        */
        /*
        if (edad !=20){
            JOptionPane.showMessageDialog(null, "No tengo 20");
        }
        
        String variableA ="Hola";
        String varibaelB ="Mundo";
         
        if (variableA.compareTo(varibaelB)!=0){
            JOptionPane.showMessageDialog(null, "Estas dos variables son diferentes");
        }
        
        if (!varibaelB.equals( variableA)){
            JOptionPane.showMessageDialog(null, "Estas dos variables son diferentes");
        }
        String variableC ="";
        String variableD ="";
        
        variableC=JOptionPane.showInputDialog("Digite el valor de la variabel C");
        variableD=JOptionPane.showInputDialog("Digite el valor de la variabel D");
        
        if (variableC.equals(variableD)){
            JOptionPane.showMessageDialog(null, "Las dos variables son iguales");
            JOptionPane.showMessageDialog(null, "Las dos variables son iguales");
            JOptionPane.showMessageDialog(null, "Las dos variables son iguales");
            JOptionPane.showMessageDialog(null, "Las dos variables son iguales");
        }
        
        if (variableC.equals(variableD))
            JOptionPane.showMessageDialog(null, "Las dos variables son iguales");
        JOptionPane.showMessageDialog(null, "Este texto siempre se imprime");
         */
        /*
        int a = 2;
        int b = 3;
        int c = 1;

        if (a < b && b < c) {
            JOptionPane.showMessageDialog(null, "la primera condición se cumple a < b : " + " " + a + " < " + b);
            JOptionPane.showMessageDialog(null, "la segunda condición se cumple b < c : " + " " + b + " < " + c);
        }
        
        if (a < b || b < c) {
            JOptionPane.showMessageDialog(null, "la primera condición se cumple a < b : " + " " + a + " < " + b);
            JOptionPane.showMessageDialog(null, "la segunda condición se cumple b < c : " + " " + b + " < " + c);
        }
        */
        /*
        String lectura;
        int edad2;
        lectura=JOptionPane.showInputDialog("Digite la edad");
        edad2 = Integer.parseInt(lectura);
        JOptionPane.showMessageDialog(null, edad2);
        
        if (edad2>17){
            JOptionPane.showMessageDialog(null, "Puedo votar");
            if (edad2>=32){
                JOptionPane.showMessageDialog(null, "Puedo ser superman");
            }
        }else{
            JOptionPane.showMessageDialog(null, "NO puedo votar");
        }
            */
        
        
        //edad= Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        
        int diaSemana=Integer.parseInt(JOptionPane.showInputDialog("Digite de la semana"));;
        
        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
                break;    
            default:
                JOptionPane.showMessageDialog(null, "Nose");
        }
        
        
        

    }
    
    
    

}
