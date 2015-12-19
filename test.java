/**
 * Clase test para probar los diferentes m�todos de la clase MusicOrganizer
 */
public class Test
{
    /**
     * M�todo para probar la funcionalidad de la clase MusicOrganizer
     * a�adiendo varios archivos e invocando distintos m�todos sobre el ArrayList que los contiene.
     */
    public void testUsingAddFileMethod(){
        // Creamos el organizador de m�sica
        MusicOrganizer archivos = new MusicOrganizer();
        // A�adimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        archivos.addFile("archivo3");
        // Obtenemos el n�mero de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Probamos un �ndice que est� fuera del rango
        archivos.checkIndex(5);
        // Comprobamos si es v�lido el indice introducido
        System.out.println("El �ndice introducido es v�lido? " + archivos.validIndex(5));
        // Probamos un �ndice que est� dentro del rango
        archivos.checkIndex(1);
        // Comprobamos si es v�lido el indice introducido
        System.out.println("El �ndice introducido es v�lido? " + archivos.validIndex(1));
    }
    
    /**
     * M�todo para comprobar si la clase MusicOrganizer sigue funcionando aunque
     * no a�adamos ningun archivo al ArrayList o se hayan borrado todos los que hab�a.
     */
    public void testWithoutFiles(){
        // Creamos el organizador de m�sica
        MusicOrganizer archivos = new MusicOrganizer();
        // Obtenemos el n�mero de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos si es v�lido un indice cualquiera
        System.out.println("El �ndice introducido es v�lido? " + archivos.validIndex(0));
        System.out.println("Ahora probaremos a a�adir archivos y borrarlos todos para comprobar si funciona tambi�n");
        // A�adimos los archivos
        archivos.addFile("archivo1");
        archivos.addFile("archivo2");
        // Obtenemos el n�mero de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos uno de los archivos
        archivos.removeFile(0);
        // Comprobamos el archivo almacenado en el indice pasado por parametro
        archivos.listFile(0);
        // Eliminamos el otro archivo
        archivos.removeFile(0);
        // Obtenemos el n�mero de archivos almacenados en el organizador
        System.out.println("Hay " + archivos.getNumberOfFiles() + " archivos");
        // Comprobamos si es v�lido un indice cualquiera
        System.out.println("El �ndice introducido es v�lido? " + archivos.validIndex(0));
    }
}
