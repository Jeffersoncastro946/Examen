package texteditor;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class capturas{

public static void main(String[] args) throws IOException{
   
    FileWriter fichero=null;
    try {
		fichero = new FileWriter("D:/Workspace/examen/1/prueba.txt");
                //D:\Workspace\examen\1

   

         // Se abre la conexión
         URL url = new URL("https://es.wikipedia.org/wiki/Programaci%C3%B3n_orientada_a_objetos");
         URLConnection conexion = url.openConnection();
         conexion.connect();
 
         // Lectura
         InputStream is = conexion.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
   
         char[] buffer = new char[1000];
         int leido;
         while ((leido = br.read(buffer)) > 0)
         
        	 //creamos un string explícitamente escribimos
         {
         fichero.write(new String(buffer, 0, leido));
         
         
         }
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
    finally {
    	   if (null!=fichero) fichero.close();
    	}
}
}