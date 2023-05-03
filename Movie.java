package bmt;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Movie {
    private String movieName, movieDescription;
    private int movieId;
    static int movieCount;

    Movie(String movieName, String movieDescription){
        ++movieCount;
        this.movieDescription = movieDescription;
        this.movieName = movieName;
        this.movieId = movieCount;
    }

    public void editMovie(String description){
        movieDescription = description;
    } 


    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
   
    public void setmovieId(int movieId) {
        this.movieId = movieId;
    }
    public String getMovieDescription() {
        return movieDescription;
    }
    public int getmovieId() {
        return movieId;
    }

    public void save(){
        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("Movies.json"), this);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    
    @Override
    public String toString() {
        return "{" +
            " movieName='" + getMovieName() + "'" +
            ", movieDescription='" + getMovieDescription() + "'" +
            ", movieId='" + getmovieId() + "'" +
            "}";
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Movie))
            return false;
        Movie c = (Movie) o;
        if(!(this.movieId == c.getmovieId()))
            return false;
        return true;
    }
}
