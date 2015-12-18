/**
 * Clase test para probar los diferentes m�todos de la clase MusicOrganizer
 */
public class test
{
    public void testUsingAddFileMethod(){
        // Creamos el organizador de m�sica
        MusicOrganizer archivos = new MusicOrganizer();
        // A�adimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        archivos.addFile("archivo3");
        // Obtenemos el n�mero de archivos almacenados en el organizador
        archivos.getNumberOfFiles();
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Probamos un �ndice que est� fuera del rango
        archivos.checkIndex(5);
        // Comprobamos si es v�lido el indice introducido
        archivos.validIndex(5);
        // Probamos un �ndice que est� dentro del rango
        archivos.checkIndex(1);
        // Comprobamos si es v�lido el indice introducido
        archivos.validIndex(1);
    }
}