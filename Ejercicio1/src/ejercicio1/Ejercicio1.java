/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Pame
 */
public class Ejercicio1 {

 
    public static void main(String[] args) 
    {
        /*
        int nume = 6;
        float resultado = nume / 3; 
        int nume1 = 7;
        float resultado1 = nume1 + 2;
        int nume2 = 11;
        float resultado2 = nume2 - 4;
        int nume3 = 15; 
        float resultado3 = nume3 * 3;
        
        System.out.println("El resultado es: " + resultado + 
                "\n El resultado es: " + resultado1 + 
                "\n El resultado es: " + resultado2 + 
                "\n El resultado es: " + resultado3);
       
        int N = 2;
        double A = 10;
        char C = 3;
        double calcular;
        double calcular2;
        
        
        calcular = N + A; 
        System.out.println("El resultado de N + A es: " + calcular);
        calcular2 = A % N; 
        System.out.println("El resto de N - A es: " + calcular2);
        System.out.println("Valor numerico correspondiente al caracter 
        que contiene la variable C: " + C);
        
        
        //Programa java que realice lo siguiente: declarar dos variables X e Y 
        // de tipo int, dos variables N y M de tipo double y asigna a cada una 
        // un valor. A continuación reliza y muestra muestra por pantalla una 
        //serie de operaciones entre ellas. 
        
        int x = 2;
        int y = 4;
        double N = 10;
        double M = 15;
        double calcular; 
        
        calcular = x * N ; 
        System.out.println("El resultado de X * N es: " +calcular);
        calcular = y * M; 
        System.out.println("El resultado de y * M es: " +calcular);
        calcular = M % N ;
        System.out.println("El resto de M * N es: " +calcular);
        
        
        // Programa Java que declare una variable entera N y asígnale un valor. 
        // A continuación escribe las instrucciones que realicen lo siguiente: 
        // Incrementar N en 77, Decrementarla en 3, Duplicar su valor. 
        
        int N = 4;
        int incrementar = 77; 
        int decrementar = 3;
        int calcular; 
        int resultado;
        int resultado2; 
        
        
        calcular = N + 77; 
        System.out.println("Incremento 77: " +calcular);
        resultado = calcular - 3 ; 
        System.out.println("Decremento - 3 : " + resultado);
        resultado2 = resultado * 2 ; 
        System.out.println("El ultimo valor del resultado duplicado por su valor: " +resultado2);
     
        
        // Programa java que declare cuatro variables enteras A, B, C y D 
        // y asígnale un valor acada una. A continuación realiza las instrucciones 
        //necesarias para que: B tome el valor de C, C tome el valor de A, 
        // A tome el valor de D, D tome el valor de B.
        
        int A = 2;
        int B = 4; 
        int C = 6;
        int D = 8;
        int aux ; 
        
        
        aux = B;
        B = C; 
        System.out.println(B);
        C = A;
        System.out.println(C);
        A = D;
        System.out.println(A);
        D = aux;
        System.out.println(D);
    
        // Programa Java que declare una variable A de tipo entero y asígnale un valor. 
        // A continuación muestra un mensaje indicando si A es par o impar. 
        // Utiliza el operador condicional ( ? : ) dentro del println para resolverlo. 
        
        int A = 15;
        
        if (A%2 == 0 )
        {
            System.out.println("A es par" );
        }
        else{
            System.out.println("A es impar" );
        }
    
    // Programa Java que declare una variable B de tipo entero y asígnale un valor. 
    //A continuación muestra un mensaje indicando si el valor de B es positivo o 
    //negativo. Consideraremos el 0 como positivo. Utiliza el operador condicional 
    //   (? : ) dentro del println para resolverlo.
        
        int B = -4; 
        
        if (B >= 0)
        {
            System.out.println("B es positivo.");
        }
        else {
            System.out.println("B es negativo");
        }

        */
        
        // Ejercicio 7 y último en "Básicos iniciales para principiantes".
        // Programa Java que declare una variable C de tipo entero y asígnale un valor. 
        // A continuación muestra un mensaje indicando si el valor de C es positivo o 
        // negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es 
        // mayor o menor que 100. Consideraremos el 0 como positivo. 
        // Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
        
        int C = 207; 
        
        if (C >= 0)
        {
            System.out.println("C es positivo.");
        }
        else
        {
            System.out.println("C es negativo.");
        }
        if (C%2 == 0)
        {
            System.out.println("C es par.");
        }
        else 
        {
            System.out.println("C es impar.");
        }
        if (C%5 == 0 )
        {
            System.out.println("C es múltiplo de 5.");
        }
        else 
        {
            System.out.println("C no es múltiplo de 5.");
        }
        if (C%10 == 0)
        {
            System.out.println("C es múltilplo de 10.");
        }
        else
        {
            System.out.println("C es múltilplo de 10.");
        }
        if (C > 100)
        {
            System.out.println("C es mayor que 100.");
        }
        else
        {
            System.out.println("C es menor que 100.");
        }
        
        
      }
    }
