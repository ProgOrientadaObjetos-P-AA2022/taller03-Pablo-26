/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void calcularCostoTerreno(){
        costo_terreno = area * valorMetroCuadrado;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
          
}
