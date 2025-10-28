public class Album {
    String name;// name of the record
    int releaseYear;//release date
    int releaseMonth;
    int releaseDay;
    String Artist; //artist who made it
    int numberofSongs=0; //how many songs there are
    public Album(String albumName, String artistName, int year, int month, int day){ //Input for release date
        name=albumName; //assigns the name of the album to albumname.
        releaseYear=year; //assigns the release date
        releaseDay=day;
        releaseMonth=month;
        artistName=Artist; //Assigns artist
    };

    public String toString (){ //returns
        return name + " was written by " + Artist + " and released on " + releaseDay + "-" + releaseMonth + "-" + releaseYear;
    };    
}
