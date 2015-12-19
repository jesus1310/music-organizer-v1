/**
 * Clase test para probar los diferentes métodos de la clase MusicOrganizer
 */
public class Test
{
    /**
     * Método para probar la funcionalidad de la clase MusicOrganizer
     * añadiendo varios archivos e invocando distintos métodos sobre el ArrayList que los contiene.
     */
    public void testUsingAddFileMethod(){
        // Creamos el organizador de música
        MusicOrganizer archivos = new MusicOrganizer();
        // Añadimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        archivos.addFile("archivo3");
        // Obtenemos el número de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Probamos un índice que esté fuera del rango
        archivos.checkIndex(5);
        // Comprobamos si es válido el indice introducido
        System.out.println("El índice introducido es válido? " + archivos.validIndex(5));
        // Probamos un índice que esté dentro del rango
        archivos.checkIndex(1);
        // Comprobamos si es válido el indice introducido
        System.out.println("El índice introducido es válido? " + archivos.validIndex(1));
    }
    
    /**
     * Método para comprobar si la clase MusicOrganizer sigue funcionando aunque
     * no añadamos ningun archivo al ArrayList o se hayan borrado todos los que había.
     */
    public void testWithoutFiles(){
        // Creamos el organizador de música
        MusicOrganizer archivos = new MusicOrganizer();
        // Obtenemos el número de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos si es válido un indice cualquiera
        System.out.println("El índice introducido es válido? " + archivos.validIndex(0));
        System.out.println("Ahora probaremos a añadir archivos y borrarlos todos para comprobar si funciona también");
        // Añadimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        // Obtenemos el número de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos el otro archivo
        archivos.removeFile(0);
        // Obtenemos el número de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos si es válido un indice cualquiera
        System.out.println("El índice introducido es válido? " + archivos.validIndex(0));
    }
}
