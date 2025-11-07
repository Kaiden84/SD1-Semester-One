// Created for Semester 1 Java programming class
// Kaiden Swift
// Prints out Album Information
// Used for testing Album Class

public class AlbumWrapper {
 public static void main(String[] args) {

        // Defining Albums
    Album album1 = new Album("The Dark Side of the Moon", "Pink Floyd", 1973, 3, 1, 10);
    Album album2 = new Album("A Kind of Blue", "Miles Davis", 1959, 8, 17, 5);
    Album album3 = new Album("Rain Dogs", "Tom Waits", 1985, 9, 30, 19);
    Album album4 = new Album("Revolver", "The Beatles", 1966, 8, 5, 14);
    Album album5 = new Album("Close To The Edge", "Yes", 1972, 9, 13, 3);
   SingleAlbum single1 = new SingleAlbum("The Beggar Lover Three", "Swans", 2023, 0, 0, 1);
   ExtendedPlayAlbum ep1 = new ExtendedPlayAlbum("Space Oddity", "David Bowie", 1972, 0, 0, 4);
        
    //Printing Albums
     System.out.println(album1);
     System.out.println(album2);
     System.out.println(album3);
     System.out.println(album4);
     System.out.println(album5);
     System.out.println(single1);
     System.out.println(ep1);

  // Playing Album
  album1.playAlbum();
  album1.breakAlbum();
  album1.playAlbum();
  single1.playAlbum();
   }
}
