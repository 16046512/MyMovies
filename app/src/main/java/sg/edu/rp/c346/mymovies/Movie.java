package sg.edu.rp.c346.mymovies;


import java.util.Calendar;

public class Movie {
    private String title;
    private String year;
    private String genre;
    private String rated;
    private String watched_on;
    private String in_theatre;
    private String description;



    public Movie(String title, String year, String genre, String rated) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.rated = rated;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(String watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDateString() {
        String str = getYear()+" - "+getGenre();
        return str;
    }
    public String getDetail(){
        String str = getDescription()+'\''+
                "Watch on: "+getWatched_on()+'\''+
                "In Theatre: "+getIn_theatre();
        return str;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + getYear()+" - " +
                ", genre=" + getGenre()+" - " +
                '}';
    }
}
