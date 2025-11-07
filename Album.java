// Created for Semester 1 Java programming class
// Kaiden Swift
// Sets up Album Syntax

public class Album {
    String name;// name of the record
    int releaseYear;//release date
    int releaseMonth;
    int releaseDay;
    String Artist; //artist who made it
    int numberofSongs=0; //how many songs there are
    int Age;
    boolean isPlayable = true;
    

    // Making a Behavior
    public boolean playAlbum(){
        if (isPlayable)
        {
            System.out.println("Now Playing: " + name);
            return true;
        }  
        System.out.println("Sorry, the album is not playable");
        return false;
  }

    public void breakAlbum(){
        isPlayable = false;
    }

    public Album(String albumName, String artistName, int year, int month, int day, int songs){ //Input for release date
        name=albumName; //assigns the name of the album to albumname.
        releaseYear=year; //assigns the release date
        releaseDay=day;
        releaseMonth=month;
        Artist=artistName; //Assigns artist
        numberofSongs=songs;
        Age = 2025 - releaseYear;
    };

    // I attempted to add a feature wherein "songs" changes to song when it is just one song, however it did not work
    //if (numberofSongs=1) {
   // String songPrint = " Song!";
    //} else {
   // String songPrint = " Songs!";
   // }

    public String toString (){ //returns
        return name + " was written by " + Artist + " and released on " + releaseDay 
        + "-" + releaseMonth + "-" + releaseYear + " Making it " + Age + " Years Old!" 
        + " It has " + numberofSongs + " Songs!";
    };    
}
