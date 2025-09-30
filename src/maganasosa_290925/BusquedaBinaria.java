/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maganasosa_290925;

/**
 *
 * @author UFG
 */
public class BusquedaBinaria {
    
    public int buscarEnteroArray(int [] arreglo, int valorBuscado){
        int inicio = 0;
        int fin = arreglo.length - 1;
        
        while(inicio <= fin){
            int medio = (inicio + fin)/2;
            
            if(arreglo[medio] == valorBuscado){
                return medio;
            }else if (arreglo[medio] < valorBuscado){
                inicio = medio +1;
            }else{
               
                fin = medio -1;
                
            }    
    }
        
    return -1;
    }
    
    
    public void buscarEnteroMatriz(int[][] matriz, int objetivo){
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int inicio = 0;
        int fin = (filas * columnas) - 1;
        
        boolean encontrado = false;
        
        
        while(inicio <= fin){
            
            int medio = (inicio + fin) / 2;
            
            int f = medio/columnas;
            int c = medio % columnas;
            
            if(matriz [f][c] == objetivo){
                System.out.println("En la matriz, el elemento encontrado esta en la posicion [" + f +"][" + c +"]");
                encontrado = true;
                
            }else if (matriz[f][c] < objetivo){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
                
            }
            
            
        }
        
        if (encontrado == false){
            System.out.println("El elemento buscado no ha sido encontrado en la matriz");
        }
    }
    

}
