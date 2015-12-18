/**
 * Clase test para probar los diferentes métodos de la clase MusicOrganizer
 */
public class test
{
    public void testUsingAddFileMethod(){
        // Creamos el organizador de música
        MusicOrganizer archivos = new MusicOrganizer();
        // Añadimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        archivos.addFile("archivo3");
        // Obtenemos el número de archivos almacenados en el organizador
        archivos.getNumberOfFiles();
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Probamos un índice que esté fuera del rango
        archivos.checkIndex(5);
        // Comprobamos si es válido el indice introducido
        archivos.validIndex(5);
        // Probamos un índice que esté dentro del rango
        archivos.checkIndex(1);
        // Comprobamos si es válido el indice introducido
        archivos.validIndex(1);
    }
}