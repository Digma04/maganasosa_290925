/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maganasosa_290925;

/**
 *
 * @author UFG
 */
public class Main {
    
public static void main(String[] args) {
    
    BusquedaBinaria buscar = new BusquedaBinaria();
    
    int [] arreglo = {17,19,21,23,25,27,29,31};
    
    int [][] matriz = {
        { 1, 3, 5 },
        { 7, 9, 11 },
        { 13, 15, 17 }
    };
            
    int a_buscar = 17;  
    
    
    int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);
    
    if (posicion != -1){
        System.out.println("El valor: "+a_buscar+" esta en la posicion: "+posicion);       
    }else{
        System.out.println("No se encontro el valor de "+a_buscar);
    }
    
    
    
    buscar.buscarEnteroMatriz(matriz, a_buscar);
   
    
    
    
    }
    
}


