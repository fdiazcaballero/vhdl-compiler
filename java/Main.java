import Parser.*;
import Lexer.*;
import java_cup.runtime.*;
import java.io.*;

public class Main {

  public static void main(String args[]) throws Exception {
    boolean error= false;

    //El primer parametro es el nombre del fichero con el programa
    if (args.length < 1) {
      System.out.println(
        "Uso: java Main <nombre_fichero>");
      error= true;
    }

    //Realizando el parsing
    if (!error)
      try {
	parser par;
	BufferedReader br= new BufferedReader(new FileReader(args[0]));
	par= new parser(new Yylex(br));
	par.parse();
        br.close();
	System.out.println("Analisis sintactico correcto");
      }
      catch(IOException e) {
	System.out.println("Error abriendo fichero: " + args[0]);
	error= true;
      }
  }   
}

	


