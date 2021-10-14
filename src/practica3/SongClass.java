/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author s216e18
 */
public class SongClass {
    int id;
    String NameArtist;
    String NameSong;
    String Album;
    String Letter;
    String Year;
    int visits;
    int NumberLetter;

    public SongClass(int id, String NameArtist, String NameSong, String Album, String Letter, String Year, int visits, int NumberLetter) {
        this.id = id;
        this.NameArtist = NameArtist;
        this.NameSong = NameSong;
        this.Album = Album;
        this.Letter = Letter;
        this.Year = Year;
        this.visits = visits;
        this.NumberLetter = NumberLetter;
    }

    public SongClass( String Year){
        this.Year = Year;  
    }
    public SongClass( ){
         
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameArtist() {
        return NameArtist;
    }

    public void setNameArtist(String NameArtist) {
        this.NameArtist = NameArtist;
    }

    public String getNameSong() {
        return NameSong;
    }

    public void setNameSong(String NameSong) {
        this.NameSong = NameSong;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getLetter() {
        return Letter;
    }

    public void setLetter(String Letter) {
        this.Letter = Letter;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }

    public int getNumberLetter() {
        return NumberLetter;
    }

    public void setNumberLetter(int NumberLetter) {
        this.NumberLetter = NumberLetter;
    }
    
}
