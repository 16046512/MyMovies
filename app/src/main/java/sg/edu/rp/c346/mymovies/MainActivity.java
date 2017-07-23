package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<Movie> MovieList;
    CustomAdapter caMovieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie = (ListView) findViewById(R.id.listViewToDo);
        MovieList = new ArrayList<Movie>();
        caMovieList = new CustomAdapter(this, R.layout.movie_row, MovieList);
        lvMovie.setAdapter(caMovieList);


        Movie item1 = new Movie("The Avengers", "2012", "Action|Sci-Fi", "pg13"); //Create a ToDoItem object named item1
        MovieList.add(item1);  //Add the ToDoItem object to the toDoList ArrayList

        Movie item2 = new Movie("Planes", "2013", "Animation | Comedy", "pg"); //Create a ToDoItem object named item2
        MovieList.add(item2);

        lvMovie.setOnClickListener(new AdapterView.OnClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position,long id) {
                Intent intent = new Intent(getBaseContext(), MovieDetailActivity.class);
                //Insert data into intent
                Movie currentMovie =MovieList.get(position);
                intent.putExtra("title",currentMovie.getTitle());
                intent.putExtra("year",currentMovie.getYear());
                intent.putExtra("genre",currentMovie.getGenre());
                intent.putExtra("desc",currentMovie.getDescription());
                intent.putExtra("rated",currentMovie.getRated());
                intent.putExtra("watchDate",currentMovie.get());
                intent.putExtra("theatre",currentMovie.getTitle());



                startActivity(intent);
            }
        });
    }

}
