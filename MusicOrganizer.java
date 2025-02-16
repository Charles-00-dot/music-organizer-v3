import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */


/**
 * 24)
 * 25)public void listMatching(String searchString)
    {
        for(String filename : files) {
            if(filename.contains(searchString)){
                System.out.println(filename);
            }
        }
    }
 * 
 * 26)
 * 27)
 * 28)Track
 * 29) boolean found = false;
 while(found) {
 if(the keys are in the next place) {
             found = true
         }
     }
 * 30) public class MultipleofFive {
 *              public void multipleOfFive() {
 *                     int num = 10;
 *                     
 *                     while (num <= 95) {
 *                         System.out.println(num);
 *                         num += 5;
         }
     }
 }
 * 31) public class sumOfNumbers {
 *          public void sumOfNumbers() {
 *              int sum = 0;
 *              int num = 1;
 *              
 *              
 *              while (num <= 10) {
 *                  sum +=num:
 *                  num++;
         }
     }
 }
 * 32)public class SumBetweenNumbers {
    public static int sum(int a, int b) {
        int total = 0; 
        int num = a;   

        while (num <= b) { 
            total += num;  
            num++;         
        }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
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
    
    public void listMatching(String searchString)
    {
        boolean foundMatch = false;
        for(String filename : files) {
            if(filename.contains(searchString)){
                System.out.println(filename);
                foundMatch = true;
            }
        }
        if(!foundMatch){
            System.out.println("No files matched the search string: " + searchString);
            
        }
        
    }
    
    
    
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(String filename : files) {
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
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}
