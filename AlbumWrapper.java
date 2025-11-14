// Created for Semester 1 Java programming class
// Kaiden Swift
// Prints out Album Information
// Used for testing Album Class

import java.util.ArrayList;
import java.util.Collections;

public class AlbumWrapper {
 public static void main(String[] args) {

   //Defining Array
   ArrayList Albums = new ArrayList<Album>();

        // Defining Albums
    Album album1 = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, 3, 1, 10);
    Album album2 = new Album("A Kind of Blue", "Miles Davis", 1959, 8, 17, 5);
    Album album3 = new Album("Rain Dogs", "Tom Waits", 1985, 9, 30, 19);
    Album album4 = new Album("Revolver", "The Beatles", 1966, 8, 5, 14);
    Album album5 = new Album("Close To The Edge", "Yes", 1972, 9, 13, 3);
   SingleAlbum single1 = new SingleAlbum("The Beggar Lover Three", "Swans", 2023, 0, 0, 1);
   ExtendedPlayAlbum ep1 = new ExtendedPlayAlbum("Space Oddity", "David Bowie", 1972, 0, 0, 4);
   Album album6 = new Album("Ummagumma", "Pink Floyd", 1969, 0, 0, 10);
        
   //Adding Album to Library
   Albums.add(ep1);
   Albums.add(single1);
   Albums.add(album1);
   Albums.add(album2);
   Albums.add(album3);
   Albums.add(album4);
   Albums.add(album5);
   Albums.add(album6);

   //Sorting Albums
   Collections.sort(Albums);


   //Printing Album
   System.out.println(Albums);

  // Playing Album
  album1.playAlbum();
  album1.breakAlbum();
  album1.playAlbum();
  single1.playAlbum();
   }
}
