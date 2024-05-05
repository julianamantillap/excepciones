/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabajoexcepciones;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
/**
 *
 * @author julianamantilla
 */
public class TrabajoExcepciones {

    //Las excepciones son una parte fundamental de la programacion en Java. Permite manejar situaciones inesperadas que pueden ocurrir durante la ejecucion de un programa, evitando que se bloquee y mejorando su robustez.
    //Las excepciones so eventos anomalos que pueden ocurrir durante la ejecucion de un programa, alterando el flujo normal del mismo. Estas situaciones inesperadas pueden ser causadas por diversos factores, como errores de entrada/salida, errores de logica en el codigo, o problemas del sistema operativo
    
    // Las excepciones en java se clasifican en tres categorias principales:
    
    //1. Excepciones comprobadas (Checked Exceptions): son aquellas que el programador esta obligado a gestionar. Deben ser declaradas en la firma del metodo o constructor que las pueda lanzar. Se heredan de la clase Exception
    //Ejemplos:
    
    //IOException: Esta excepcion se lanza cuando se produce un error de entrada/salida, como leer o escribir en un archivo inexistente o que no tiene los permisos adecuados
    
    public class IOExceptionExample {

  public static void main(String[] args) {
    try {
      FileReader reader = new FileReader("no_existe.txt");
      reader.read(); 
    } catch (IOException e) {
      System.out.println("Error: No se pudo leer el archivo.");
    }
  }
}
}

    //FileNotFoundException: Es una subclase de IOException que se lanza especificamente cuando se intenta acceder a un archivo que no existe
    
     public class FileNotFoundExceptionExample {

    public static void main(String[] args) throws IOException {
    try {
      File file = new File("no_existe.txt");
      file.createNewFile(); 
    } catch (FileNotFoundException e) {
      System.out.println("Error: El archivo no existe.");
    }
  }
}

    // SQLException: Esta excepcion se lanza cuando se produce un error al acceder o manipular datos en una base de datos

    public class SQLExceptionExample {

    public static void main(String[] args) {
    try {
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_inexistente", "usuario", "contraseña");
      Statement statement = connection.createStatement();
      statement.executeQuery("SELECT * FROM tabla_inexistente"); // Consulta inválida
    } catch (SQLException e) {
      System.out.println("Error de SQL: " + e.getMessage());
    }
  }
}
   
     // 2. Excepciones No Comprobadas (Unchecked Exceptions): Son excepciones que el programador no esta obligado a gestionar. No requieren ser declaradas en la firma del metodo o constructor. Se heredan de la clase RuntimeException. Son generalmente errores de programacion o problemas logicos
     // Ejemplos:

     // NullPointerException: Esta excepcion se lanza cuando se intenta acceder a un miembro de un objeto que es null

     public class NullPointerExceptionExample {

     public static void main(String[] args) {
    String nombre = null;
    System.out.println(nombre.length()); 
  }
}

    
     // ArrayIndexOutOfBoundsException: Se lanza cuando se intenta acceder a un elemento de un array fuera de los limites del mismo
     
    public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
    int[] numeros = new int[3];
    System.out.println(numeros[4]); 
  }
}

     // ArithmeticException: Se lanza cuando se produce un error aritmetico, como una division entre cero

     public class ArithmeticExceptionExample {

     public static void main(String[] args) {
    int resultado = 10 / 0; 
    System.out.println(resultado);
  }
}

     // 3. Errores (Errors): Son excepciones irrecuperables que indican un problema grave en el sistema, como un error de memoria o falla de un sistema operativo. Se heredan de la clase Error
     // Ejemplos:

     //OutOfMemoryError: se lanza cuando el programa intenta asignar mas memoria de la que esta disponible

     public class OutOfMemoryErrorExample {

      public static void main(String[] args) {
      for (int i = 0; i < Integer.MAX_VALUE; i++) {
      new ObjetoGrande(); // Consume mucha memoria
    }
  }
}
     



