
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        int opcion = 0, oportunidades = 3;
        int cantFilas1, cantidadFilas, cantidadColumnas1,cantFilas2 = 0, cantidadColumnas2 = 0;
        int i, j = 0;
        int cantidadColumnas,  escalar;
        int p = 0, numeroMulti = -1, tamano;
        double calcuDeterminante = 0,matrizInversa;

        System.out.println("***Bienvenido al sistema de calculos*** ");
        System.out.println("");
        System.out.println("ELIGE UNA OPCION: ");
        System.out.println("1- Verificar si dos matrices son iguales o no.");
        System.out.println("2- Sumar dos matrices.");
        System.out.println("3- Generar una matriz de 0 de n x m.");
        System.out.println("4- Restar dos matrices.");
        System.out.println("5- multiplicar un escalar por una matriz de m x n");
        System.out.println("6- multiplicar dos matrices compatibles.");
        System.out.println("7- Obtener una matriz identidad de tamaño n.");
        System.out.println("8- obtener el inverso aditivo de una matriz de n x m.");
        System.out.println("9- Obtener la inversa de una matriz de tamano n.");
        System.out.println("10- Obtener el determinante de una matriz de tamano n.");
        System.out.println("11- Salir");

         do{
            System.out.println("Ingrese la opcion que desee: ");
            opcion = entrada.nextInt();
            
            if(opcion <= 0 || opcion > 16){
                oportunidades++;
                System.out.println("El numero que ingreso no se encuentra entre las opciones, intentelo de nuevo");
                System.out.println("Ingrese la opcion que desee:");
                opcion = entrada.nextInt();
             if(opcion <= 0 || opcion > 16){
                oportunidades++;
                System.out.println("El numero que ingreso no se encuentra entre las opciones, intentelo de nuevo");
                System.out.println("Ingrese la opcion que desee:");
                opcion = entrada.nextInt();
             }
                
            break;    
            }
          
        }while(opcion <= 0 || opcion > 16);

        switch(opcion){
             
             case 1: 
                 do{
            System.out.println("Ingrese la cantidad de filas para la primera matriz:");
            cantFilas1 = entrada.nextInt();
            
            if(cantFilas1 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
           
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la cantidad de columnas para la primera matriz:");
            cantidadColumnas1 = entrada.nextInt();
            
            if(cantidadColumnas1 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
            
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
         int[][]matriz1 = new int[cantFilas1][cantidadColumnas1];
        
        System.out.println("Ingrese los elementos para la primera matriz: ");
        for( i = 0; i<matriz1.length; i++){
            for( j= 0; j<matriz1[i].length; j++){
                System.out.print("ArregloA [" + i + "," + j + "] = ");
                matriz1 [i][j] = entrada.nextInt();
            }
        }
        System.out.println("");
       
        System.out.println("La primera matriz es: ");
        System.out.println("***********************");
        for( i = 0; i<matriz1.length; i++){
            for( j = 0; j<matriz1[i].length; j++){
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("************************");
        System.out.println("");
        
        do{
            System.out.println("Ingrese la cantidad de filas para la segunda matriz:");
            cantFilas2 = entrada.nextInt();
            
            if(cantFilas2 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
           
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
         do{
            System.out.println("Ingrese la cantidad de columnas para la segunda matriz:");
            cantidadColumnas2 = entrada.nextInt();
            
            if(cantidadColumnas2 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
          
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
        int[][]matriz2 = new int[cantFilas2][cantidadColumnas2];
         System.out.println("Ingrese los elementos para la segunda matriz: ");
        for( i = 0; i<matriz2.length; i++){
            for( j= 0; j<matriz2[i].length; j++){
                System.out.print("ArregloA [" + i + "," + j + "] = ");
                matriz2 [i][j] = entrada.nextInt();
            } 
        }
        System.out.println("");
        
        System.out.println("La segunda matriz es: ");
         System.out.println("************************");
        for( i = 0; i<matriz2.length; i++){
            for( j = 0; j<matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
            
        }
        System.out.println("*************************");
        
       if(Arrays.deepEquals(matriz1, matriz2)){
           System.out.println("LAS MATRICES SON IGUALES");
       }else{
           System.out.println("LAS MATRICES SON DIFERENTES");
       }
       break;

       case 2:

       do{
        System.out.println("Ingrese la cantidad de filas para la primera matriz: ");
        cantidadFilas = entrada.nextInt();
         
        if(cantidadFilas <= 0){
            System.out.println("No se pueden ingresar valores menores o iguales a cero");
           
            oportunidades--;
            
        }else{
            break;
        }
            
        }while(oportunidades > 0);
        
        if(oportunidades == 0){
            System.out.println("La cantidad de intentos se ha agotado, **El programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la cantidad de columnas para la primera matriz: ");
            cantidadColumnas = entrada.nextInt();
            
             if(cantidadColumnas <= 0){
            System.out.println("No se pueden ingresar valores menores o iguales a cero");
           
            oportunidades--;
            
        }else{
            break;
        }
       
        }while(oportunidades > 0);
        
        if(oportunidades == 0){
            System.out.println("La cantidad de intentos se ha agotado, **El programa ha finalizado**");
            return;
        }
        
        int [][] matrizA = new int [cantidadFilas][cantidadColumnas];
        int [][] matrizB = new int [cantidadFilas] [cantidadColumnas];
        int[][] suma = new int[cantidadFilas] [cantidadColumnas];
        
        System.out.println("Ingrese los elementos para la primera matriz: ");
        
        for( i = 0; i <matrizA.length; i++){
            for(j = 0; j< matrizA[i].length; j++){
                System.out.print("arregloA: [" + i + "," + j + "] = ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("La primera matriz es: ");
        for(i = 0; i < matrizA.length; i++){
            for(j = 0; j <matrizA[i].length; j++){
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        
         do{
            System.out.println("Ingrese la misma cantidad de filas que ingreso en la primera matriz, para la segunda matriz: ");
            cantidadFilas = entrada.nextInt();
          
            if(cantidadFilas <= 0){
                System.out.println("Debe ingresar la misma cantidad de filas,que en la primera matriz para que se pueda efectuar la suma");
                oportunidades--;
            }else{
           
             break;
            }
            
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("las oportunidades de han agotado, **el programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la misma cantidad de columnas que ingreso en la primera matriz, para la segunda matriz: ");
            cantidadColumnas = entrada.nextInt();
          
            
            if(cantidadColumnas <= 0){
                 System.out.println("Debe ingresar la misma cantidad de columnas,que en la primera matriz para que se pueda efectuar la suma");
                oportunidades--;
            }else{
                break;
            }
            
         
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("las oportunidades de han agotado, **el programa ha finalizado**");
            return;
        }
        
        System.out.println("Ingrese los elementos para la segunda matriz: ");
         for( i = 0; i <matrizB.length; i++){
            for(j = 0; j< matrizB[i].length; j++){
                System.out.print("arregloB: [" + i + "," + j + "] = ");
                matrizB[i][j] = entrada.nextInt();
              
            } 
        }
         
          System.out.println("La segunda matriz es: ");
        for(i = 0; i < matrizB.length; i++){
            for(j = 0; j <matrizB[i].length; j++){
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        
        for(i = 0; i<matrizA.length; i++){
            for(j = 0; j < matrizA.length; j++){
                suma[i][j]= matrizA[i][j] + matrizB[i][j];
            }
            
        }
        
         System.out.println("la suma de las matrices es: ");
        for(i = 0; i<matrizA.length; i++){
            for(j = 0; j<matrizA.length; j++){
                System.out.print(matrizA[i][j] + matrizB[i][j] + "\t");
                System.out.print("");
            }
            System.out.println("");
        }
        break;
        
        case 3:
        do{
            System.out.println("Ingrese la cantidad de filas para la matriz");
            cantidadFilas = entrada.nextInt();
            
            if(cantidadFilas <= 0){
                System.out.println("No se puede ingresar valores menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
            
            
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
            return;
        }
        
         do{
            System.out.println("Ingrese la cantidad de columnas para la matriz: ");
            cantidadColumnas = entrada.nextInt();
            
            if(cantidadFilas <= 0){
                System.out.println("No se puede ingresar valores menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
             
        }while(oportunidades > 0);
         if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
            return;
         } 
         int[][] nula = new int [cantidadFilas][cantidadColumnas];
         
         System.out.println("**La matriz nula es**");
         System.out.println("");
           for(i = 0; i < nula.length; i++){
            for(j = 0; j <nula[i].length; j++){
                System.out.print(nula[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        break;

        case 4: 

        do{
        System.out.println("Ingrese la cantidad de filas para la primera matriz: ");
        cantidadFilas = entrada.nextInt();
         
        if(cantidadFilas <= 0){
            System.out.println("No se pueden ingresar valores menores o iguales a cero");
           
            oportunidades--;
            
        }else{
            break;
        }
            
        }while(oportunidades > 0);
        
        if(oportunidades == 0){
            System.out.println("La cantidad de intentos se ha agotado, **El programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la cantidad de columnas para la primera matriz: ");
            cantidadColumnas = entrada.nextInt();
            
             if(cantidadColumnas <= 0){
            System.out.println("No se pueden ingresar valores menores o iguales a cero");
           
            oportunidades--;
            
        }else{
            break;
        }
       
        }while(oportunidades > 0);
        
        if(oportunidades == 0){
            System.out.println("La cantidad de intentos se ha agotado, **El programa ha finalizado**");
            return;
        }
        
        int [][] matrizAa = new int [cantidadFilas][cantidadColumnas];
        int [][] matrizBb = new int [cantidadFilas] [cantidadColumnas];
        int[][] resta = new int[cantidadFilas] [cantidadColumnas];
        
        System.out.println("Ingrese los elementos para la primera matriz: ");
        
        for( i = 0; i <matrizAa.length; i++){
            for(j = 0; j< matrizAa[i].length; j++){
                System.out.print("arregloA: [" + i + "," + j + "] = ");
                matrizAa[i][j] = entrada.nextInt();
              
            }
            
        }
        
        System.out.println("La primera matriz es: ");
        for(i = 0; i < matrizAa.length; i++){
            for(j = 0; j <matrizAa[i].length; j++){
                System.out.print(matrizAa[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        
         do{
            System.out.println("Ingrese la misma cantidad de filas que ingreso en la primera matriz, para la segunda matriz: ");
            cantidadFilas = entrada.nextInt();
            
            if(cantidadFilas <= 0){
                System.out.println("Debe ingresar la misma cantidad de filas,que en la primera matriz para que se pueda efectuar la suma");
                oportunidades--;
            }else{
                break;
            }
            
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("las oportunidades de han agotado, **el programa ha finalizado**");
            return;
        }
        
         do{
            System.out.println("Ingrese la misma cantidad de columnas que ingreso en la primera matriz, para la segunda matriz: ");
            cantidadColumnas = entrada.nextInt();
            
            if(cantidadColumnas <= 0){
                 System.out.println("Debe ingresar la misma cantidad de columnas,que en la primera matriz para que se pueda efectuar la suma");
                oportunidades--;
            }else{
                break;
            }
            
         
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("las oportunidades de han agotado, **el programa ha finalizado**");
            return;
        }
        
        System.out.println("Ingrese los elementos para la segunda matriz: ");
         for( i = 0; i <matrizBb.length; i++){
            for(j = 0; j< matrizBb[i].length; j++){
                System.out.print("arregloB: [" + i + "," + j + "] = ");
                matrizBb[i][j] = entrada.nextInt();
              
            }
            
        }
        System.out.println("La segunda matriz es: ");
        for(i = 0; i < matrizBb.length; i++){
            for(j = 0; j <matrizBb[i].length; j++){
                System.out.print(matrizBb[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        
         System.out.println("la suma de las matrices es: ");
        for(i = 0; i<matrizAa.length; i++){
            for(j = 0; j<matrizAa.length; j++){
                System.out.print(matrizAa[i][j] - matrizBb[i][j] + "\t");
                System.out.print("");
            }
            System.out.println("");
        }
        
        break;

        case 5:

        do{
            System.out.println("Ingrese la cantidad de filas para la matriz");
            cantidadFilas = entrada.nextInt();
            
            if(cantidadFilas <= 0){
                System.out.println("No se puede ingresar valores menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
            
        }while(oportunidades > 0);
        
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la cantidad de columnas para la matriz: ");
            cantidadColumnas = entrada.nextInt();
            
            if(cantidadFilas <= 0){
                System.out.println("No se puede ingresar valores menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
             
        }while(oportunidades > 0);
        
         if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
            return;
        }
         
         int[][]multiEscalar = new int[cantidadFilas][cantidadColumnas];
         int[][]multiplicacion = new int [cantidadFilas][cantidadColumnas];
         
          System.out.println("Ingrese los elementos de la matriz: ");
         
         for(i = 0; i<multiEscalar.length; i++){
             for( j = 0; j<multiEscalar[i].length; j++){
                 System.out.print("Arreglo: [" + i + "," + j + "] = ");
                 multiEscalar[i][j] = entrada.nextInt();
               
             }
             
         }
         
        System.out.println("");
        System.out.println("La  matriz es: ");
        System.out.println("****************");
        for(i = 0; i < multiEscalar.length; i++){
            for(j = 0; j < multiEscalar[i].length; j++){
                System.out.print(multiEscalar[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        
        System.out.println("Ingrese el numero o escalar para efectuar la multiplicacion: ");
        escalar = entrada.nextInt();
        
         for(i = 0; i<multiEscalar.length; i++){
            for(j = 0; j < multiEscalar.length; j++){
                multiplicacion[i][j] = (escalar * multiEscalar[i][j]);
             
            }
           
        }
         System.out.println("");
         
         System.out.println("la multiplicacion por el escalar es: ");
        System.out.println("*****************************");
        for(i = 0; i<multiEscalar.length; i++){
            for(j = 0; j<multiEscalar.length; j++){
                System.out.print(escalar * multiEscalar[i][j] + "\t");
              
            }
            System.out.println("");
           
        }
        System.out.println("***********************************");
         break;

         case 6:

         do{
            System.out.println("Ingrese la cantidad de filas para la primera matriz:");
            cantFilas1 = entrada.nextInt();
            
            if(cantFilas1 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
           
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
         do{
            System.out.println("Ingrese la cantidad de columnas para la primera matriz:");
            cantidadColumnas1 = entrada.nextInt();
            
            if(cantidadColumnas1 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
          
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
         int[][]matrizAc = new int[cantFilas1][cantidadColumnas1];
         
         System.out.println("Ingrese los elementos para la primera matriz: ");
        for( i = 0; i<matrizAc.length; i++){
            for( j= 0; j<matrizAc[i].length; j++){
                System.out.print("ArregloA [" + i + "," + j + "] = ");
                matrizAc [i][j] = entrada.nextInt();
            }
           
            
        }
        System.out.println("");
        
        System.out.println("La primera matriz es: ");
        System.out.println("***********************");
        for( i = 0; i<matrizAc.length; i++){
            for( j = 0; j<matrizAc[i].length; j++){
                System.out.print(matrizAc[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("************************");
        System.out.println("");
        
         do{
            System.out.println("Ingrese la cantidad de filas para la segunda matriz:");
            cantFilas2 = entrada.nextInt();
            
            if(cantFilas2 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
           
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
        do{
            System.out.println("Ingrese la cantidad de columnas para la segunda matriz:");
            cantidadColumnas2 = entrada.nextInt();
            
            if(cantidadColumnas2 <= 0){
                System.out.println("No se aceptan numeros menores o iguales a cero");
                oportunidades--;
            }else{
                break;
            }
          
        }while(oportunidades > 0);
        if(oportunidades == 0){
            System.out.println("Las oportunidades se han agotado,** El programa ha finalizado**");
            return;
        }
        
        int[][]matrizBc = new int[cantFilas2][cantidadColumnas2];
        
         System.out.println("Ingrese los elementos para la segunda matriz: ");
        for( i = 0; i<matrizBc.length; i++){
            for( j= 0; j<matrizBc[i].length; j++){
                System.out.print("ArregloA [" + i + "," + j + "] = ");
                matrizBc [i][j] = entrada.nextInt();
            }
           
            
        }
        System.out.println("");
        
        System.out.println("La segunda matriz es: ");
         System.out.println("************************");
        for( i = 0; i<matrizBc.length; i++){
            for( j = 0; j<matrizBc[i].length; j++){
                System.out.print(matrizBc[i][j] + "\t");
            }
            System.out.println();
            
            
        }
        System.out.println("*************************");
        
        int[][]resultado =new int[cantFilas1][cantidadColumnas2];
        if(cantidadColumnas1 != cantFilas2){
            System.out.println("las matrices no se pueden multiplicar: ");
        }else{
            System.out.println("**Las matrices son compatibles**");
            for(i = 0; i<cantFilas1;i++){
                for(j = 0; j<cantidadColumnas2; j++){
                    for(p = 0; p<cantidadColumnas1; p++){
                        resultado[i][j] += matrizAc[i][p] * matrizBc[p][j];
                    }
                    System.out.print( resultado[i][j]  + "\t");
                }
                System.out.println();
            }
        }
        break;
        

        case 7:

        for(int k = 0; k<3; k++){
            
         
            do{
                System.out.println("Ingrese el tamaño de la matriz:");
                tamano = entrada.nextInt();
                
                if(tamano <= 0){
                    System.out.println("No se puede ingresar valores menores o iguales a cero");
                    oportunidades--;
                }else{
                    break;
                }
                
                
            }while(oportunidades > 0);
            if(oportunidades == 0){
                System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
                return;
            }
            
             
           
               
                 int[][] identidad = new int [tamano][tamano];
             
             
             System.out.println("**La matriz Identidad es:**");
             System.out.println("");
             for(i = 0; i<identidad.length; i++){
                 for(j = 0; j <identidad.length; j++){
                     if(i==j){
                        identidad[i][i]= 1;
                        
                     }else{
                        identidad[i][i] = 0;
                        
                     }
                     System.out.print(identidad[i][i] + "\t");
                 }
                 System.out.println();
             }
             oportunidades--;
             
           
             
            }    

        case 8:

         do{
       System.out.println("Ingrese la cantidad de filas para la matriz: ");
       cantidadFilas = entrada.nextInt();
       
       if (cantidadFilas <= 0){
           System.out.println("No puede ingresar valores menores o iguales a cero");
           oportunidades--;
           
       }else{
           break;
       }
       
       }while(oportunidades > 0);
       if(oportunidades == 0){
           System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
           return;
       }
       
       do{
        System.out.println("Ingrese la cantidad de columnas para la matriz: ");
        cantidadColumnas = entrada.nextInt();
       
       if (cantidadColumnas <= 0){
           System.out.println("No puede ingresar valores menores o iguales a cero");
           oportunidades--;
           
       }else{
           break;
       }  
           
       }while(oportunidades > 0);
       if(oportunidades == 0){
           System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
           return;
       }
       
       int[][] aditivo= new int[cantidadFilas] [cantidadColumnas];
       int[][]resultadoInverso = new int [cantidadFilas][cantidadColumnas];
       
       System.out.println("Ingrese los elementos para la matriz: ");
        for( i = 0; i<aditivo.length; i++){
            for( j= 0; j<aditivo[i].length; j++){
                System.out.print("ArregloA [" + i + "," + j + "] = ");
                aditivo[i][j] = entrada.nextInt();
            }
        }
       System.out.println("");
       System.out.println("**La matriz que ha formado es**");
       System.out.println("");
           for(i = 0; i < aditivo.length; i++){
            for(j = 0; j <aditivo[i].length; j++){
                System.out.print(aditivo[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        
        for(i = 0; i<aditivo.length; i++){
            for(j = 0; j < aditivo.length; j++){
                resultadoInverso[i][j] = (numeroMulti * aditivo[i][j]);
            }
        }
       
         System.out.println("");
         
        System.out.println("El inverso aditivo de la matriz es: ");
        System.out.println("*****************************");
        for(i = 0; i<aditivo.length; i++){
            for(j = 0; j<aditivo.length; j++){
                System.out.print(numeroMulti * aditivo[i][j] + "\t");
               
                
            }
            System.out.println("");
           
        }
        System.out.println("***********************************");
         break;

         case 9:
         do{
            System.out.println("Ingrese el tamaño de la matriz:");
            tamano = entrada.nextInt(); 
            
            if (tamano <= 0 || tamano > 3){
                System.out.println("El tamaño de la matriz debe de ser mayor o distinto de cero: ");
                System.out.println("Ingrese un numero que sea menor a que 3");
                System.out.println("");
                oportunidades--;
            }else{
                break;
            }
           }while(oportunidades > 0);
           if (oportunidades == 0){
               System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
               return;
           }
           
           if(tamano == 1){
               int[][]matrizA1 = new int[tamano][tamano];
                System.out.println("Ingrese los elementos de la matriz: ");
               for( i = 0; i<matrizA1.length; i++){
               for( j= 0; j<matrizA1[i].length; j++){
                   System.out.print("ArregloA [" + i + "," + j + "] = ");
                   matrizA1[i][j] = entrada.nextInt();
               }
           }
          System.out.println("");
          
            System.out.println("**La matriz que ha formado es**");
            System.out.println("");
              for(i = 0; i < matrizA1.length; i++){
               for(j = 0; j <matrizA1[i].length; j++){
                   System.out.print(matrizA1[i][j] + "\t");
               }
               System.out.println();
           }
           System.out.println("");
           
            for(i = 0; i<matrizA1.length; i++){
               for(j = 0; j < matrizA1.length; j++){
                    calcuDeterminante = (matrizA1 [0][0]);
               }
            }
            
           if(calcuDeterminante != 0){
           System.out.println("El determinante de la matriz es: " + calcuDeterminante);
           double factor= 1.0 / calcuDeterminante; 
             
            
            double [][] matrizInvers = {
            {matrizA1[0][0]}
           };
            
            System.out.println("La matriz Inversa es: ");
             System.out.println("****************************");
             for( i = 0; i<matrizA1.length; i++){
                 for(j = 0; j <matrizA1.length; j++){ 
                     System.out.print(matrizInvers[i][j] + "\t");
               
                 }
                
                 System.out.println();
             }
             System.out.println("");
             System.out.println("********************************");
             
           }else{
               System.out.println("No podemos calcular la matriz inversa, ya que el determinante debe ser distinto de cero");
           }
         
           }else if(tamano == 2){
               
               int[][]matrizA2 = new int[tamano][tamano];
               
               System.out.println("Ingrese los elementos de la matriz: ");
               
               for( i = 0; i<matrizA2.length; i++){
               for( j= 0; j<matrizA2[i].length; j++){
                   System.out.print("ArregloA [" + i + "," + j + "] = ");
                   matrizA2[i][j] = entrada.nextInt();
               }
           }
          System.out.println("");
          
          System.out.println("**La matriz que ha formado es**");
            System.out.println("");
              for(i = 0; i < matrizA2.length; i++){
               for(j = 0; j <matrizA2[i].length; j++){
                   System.out.print(matrizA2[i][j] + "\t");
               }
               System.out.println();
           }
           System.out.println("");
           
            for(i = 0; i<matrizA2.length; i++){
               for(j = 0; j < matrizA2.length; j++){
                    calcuDeterminante = (matrizA2 [0][0] * matrizA2[1][1]) - (matrizA2[1][0] * matrizA2 [0][1]);
               }
            }
            
            if(calcuDeterminante != 0){
                System.out.println("El determinante de la matriz es: " + calcuDeterminante);
                
                double factor= 1.0 / calcuDeterminante; 
             
             double [][] matrizInvers = {
               {matrizA2[1][1] * factor, -matrizA2[0][1] * factor}, {-matrizA2 [1][0]* factor, matrizA2[0][0] * factor}
           };
             System.out.println("La matriz Inversa es: ");
             System.out.println("****************************");
             for( i = 0; i<matrizA2.length; i++){
                 for(j = 0; j <matrizA2.length; j++){ 
                     System.out.print(matrizInvers[i][j] + "\t");
                  
                 }
                
                 System.out.println();
             }
             System.out.println("");
             System.out.println("********************************");
            }else{
                System.out.println("No podemos calcular la matriz Inversa, ya que el determinante debe ser distinto de cero");
                
            }
            
           }else if(tamano == 3){
               int[][]matrizA3 = new int[tamano][tamano];
               
               System.out.println("Ingrese los elementos de la matriz: ");
               for( i = 0; i<matrizA3.length; i++){
               for( j= 0; j<matrizA3[i].length; j++){
                   System.out.print("ArregloA [" + i + "," + j + "] = ");
                   matrizA3[i][j] = entrada.nextInt();
               }
           }
               
          System.out.println("");
          System.out.println("**La matriz que ha formado es**");
            System.out.println("");
              for(i = 0; i < matrizA3.length; i++){
               for(j = 0; j <matrizA3[i].length; j++){
                   System.out.print(matrizA3[i][j] + "\t");
               }
               System.out.println();
           }
           System.out.println("");
           
           for(i = 0; i<matrizA3.length; i++){
               for(j = 0; j < matrizA3.length; j++){
                    calcuDeterminante = matrizA3 [0][0] * matrizA3 [1][1] * matrizA3[2][2] + matrizA3[0][1] * matrizA3[2][0] * matrizA3[1][2] + matrizA3[0][2] *matrizA3[1][0] * matrizA3[2][1] - matrizA3[2][0]*matrizA3[1][1]*matrizA3[0][2] - matrizA3[0][0]*matrizA3[1][2]*matrizA3[2][1] - matrizA3[0][1]*matrizA3[1][0]*matrizA3[2][2];
                    
               }
               
            }
           
           if(calcuDeterminante != 0){
                System.out.println("El determinante de la matriz es: " + calcuDeterminante);
                
                
              int [][] matrizCofactor = {
               {matrizA3[1][1]*matrizA3[2][2] - matrizA3[2][1] * matrizA3[1][2], matrizA3[1][0]*matrizA3[2][2] - matrizA3[2][0]*matrizA3[1][2],matrizA3[1][0]*matrizA3[2][1] - matrizA3[2][0]*matrizA3[1][1]}, {matrizA3[0][1]*matrizA3[2][2]-matrizA3[2][1]*matrizA3[0][2],matrizA3[0][0]*matrizA3[2][2]-matrizA3[2][0]*matrizA3[0][2],matrizA3[0][0]*matrizA3[2][1]-matrizA3[2][0]*matrizA3[0][1]}, {matrizA3[0][1]*matrizA3[1][2] - matrizA3[1][1]*matrizA3[0][2], matrizA3[0][0]*matrizA3[1][2]-matrizA3[1][0]*matrizA3[0][2], matrizA3[0][0]*matrizA3[1][1]-matrizA3[1][0]*matrizA3[0][1]}
           };
              
              System.out.println("La nueva matriz por las operaciones de los cofactores es: ");
              System.out.println("****************************");
              for( i = 0; i<matrizA3.length; i++){
                 for(j = 0; j <matrizA3.length; j++){ 
                     System.out.print(matrizCofactor[i][j] + "\t");
                 }
                 System.out.println();
              }
              System.out.println("");
             
              double factor = 1/calcuDeterminante;
              double[][]matrizInversa2 = {
                  {matrizCofactor[0][0] * factor, matrizCofactor[0][1]*factor, matrizCofactor[0][2]*factor},{matrizCofactor[1][0]*factor, matrizCofactor[1][1]*factor, matrizCofactor[1][2]*factor}, {matrizCofactor[2][0] * factor, matrizCofactor[2][1]*factor, matrizCofactor[2][2]*factor}
              };
              
              System.out.println("La matriz Inversa es: ");
              System.out.println("**************************");
              for(i= 0; i<matrizA3.length; i++){
                  for(j = 0; j<matrizA3.length; j++){
                      System.out.print(matrizInversa2[i][j] + "\t");
                      
                  }
                  System.out.println();
              }
              System.out.println("");
              System.out.println("****************************");
                  
              }else{
               System.out.println("No podemos calcular la matriz Inversa, ya que el determinante debe ser distinto de cero");
               
           }
           
           }else{
               
           }
           break;

           case 10:

           do{
            System.out.println("Ingrese el tamaño de la matriz:");
            tamano = entrada.nextInt(); 
          
              if (tamano <= 0 || tamano > 3){
                 System.out.println("El tamaño de la matriz debe de ser mayor o distinto de cero: ");
                 System.out.println("Ingrese un numero que sea menor a que 3");
                 System.out.println("");
                 oportunidades--;
                }else{
                 break;
              }
             }while(oportunidades > 0);
            if (oportunidades == 0){
             System.out.println("Las oportunidades se han agotado, **El programa ha finalizado**");
             return;
         }
            
            if(tamano == 1){
            int[][]determinante = new int[tamano][tamano]; 
            System.out.println("Ingrese los elementos para la primera matriz: ");
         
             for( i = 0; i <determinante.length; i++){
               for(j = 0; j< determinante[i].length; j++){
                 System.out.print("arregloA: [" + i + "," + j + "] = ");
                 determinante[i][j] = entrada.nextInt();
               
             }
             
         }
             System.out.println("");
             
             System.out.println("La matriz que ha formado es: ");
             for(i = 0; i < determinante.length; i++){
               for(j = 0; j <determinante[i].length; j++){
                 System.out.print(determinante[i][j] + "\t");
             }
             System.out.println();
         }
         System.out.println(""); 
         
         for(i = 0; i<determinante.length; i++){
             for(j = 0; j < determinante.length; j++){
                  calcuDeterminante = (determinante [0][0]);
             }
          }
         System.out.println("El determinante de la matriz es: " + calcuDeterminante);
         
           }else if(tamano == 2){
             
          int[][]determinante = new int[tamano][tamano]; 
            System.out.println("Ingrese los elementos para la primera matriz: ");
         
             for( i = 0; i <determinante.length; i++){
               for(j = 0; j< determinante[i].length; j++){
                 System.out.print("arregloA: [" + i + "," + j + "] = ");
                 determinante[i][j] = entrada.nextInt();
               
             }
             
         }
              System.out.println("La matriz que ha formado es: ");
             for(i = 0; i < determinante.length; i++){
               for(j = 0; j <determinante[i].length; j++){
                 System.out.print(determinante[i][j] + "\t");
             }
             System.out.println();
         }
         System.out.println(""); 
 
         for(i = 0; i<determinante.length; i++){
             for(j = 0; j < determinante.length; j++){
                  calcuDeterminante = (determinante [0][0] * determinante[1][1]) - (determinante[1][0] * determinante[0][1]);
                  
             }
          }
         System.out.println("El determinante de la matriz es: " + calcuDeterminante);
         
         }else if(tamano == 3){
             int[][]determinante = new int[tamano][tamano]; 
            System.out.println("Ingrese los elementos para la primera matriz: ");
         
             for( i = 0; i <determinante.length; i++){
               for(j = 0; j< determinante[i].length; j++){
                 System.out.print("arregloA: [" + i + "," + j + "] = ");
                 determinante[i][j] = entrada.nextInt();
              
             }
          
         }
             
             System.out.println("La matriz que ha formado es: ");
             for(i = 0; i < determinante.length; i++){
               for(j = 0; j <determinante[i].length; j++){
                 System.out.print(determinante[i][j] + "\t");
             }
             System.out.println();
         }
         System.out.println(""); 
         
          for(i = 0; i<determinante.length; i++){
             for(j = 0; j < determinante.length; j++){
                  calcuDeterminante = determinante [0][0] * determinante[1][1] * determinante[2][2] + determinante[0][1] * determinante[2][0] * determinante[1][2] + determinante[0][2] *determinante[1][0] *determinante[2][1] - determinante[2][0]*determinante[1][1]*determinante[0][2] - determinante[0][0]*determinante[1][2]*determinante[2][1] - determinante[0][1]*determinante[1][0]*determinante[2][2];
                  
             }
          }
         System.out.println("El determinante de la matriz es: " + calcuDeterminante);
         
         }else{
             System.out.println("Disculpe, No podemos calcular el dterminante");
         }

        entrada.close();
     
          
         

    }
       
    
    }
}
