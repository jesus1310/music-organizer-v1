import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }
        
    /**
     * M�todo que permite comprobar si el �ndice introducido es v�lido
     */
    public void checkIndex(int index){
        if ((index < 0 || index >= files.size())){
            System.out.println("El �ndice introducido no es v�lido");
            System.out.println("El rango v�lido es desde 0 hasta " + (files.size()-1));
        }
        else if (files.size() == 0){
            System.out.println("No hay ning�n objeto en la colecci�n");
        }
    }
    
    /**
     * M�todo que devuelve un booleano en funci�n de si el �ndice introducido es valido
     */
    public boolean validIndex(int index){
        boolean isValid = false;
        if (files.size() == 0){
            System.out.println("No hay ning�n objeto en la colecci�n");
        }
        else{
            if(index >= 0 && index < files.size()) {
                isValid = true;
            }
        }
        return isValid;
    }
}
