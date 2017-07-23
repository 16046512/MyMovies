package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046512 on 24/7/2017.
 */

public class MovieDetailActivity extends AppCompatActivity{
    TextView title;
    TextView sub;
    TextView tvdetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        title = (TextView) findViewById(R.id.tvTitle);
        sub = (TextView) findViewById(R.id.tvSub);
        tvdetail = (TextView) findViewById(R.id.tvdetail);
        Intent intentReceived = getIntent();
        final String optionSelected = intentReceived.getStringExtra("option");
        if (optionSelected.equals("o1")) {
            title.setText(getTitle());

        } else {

            title.setText("Shoe Model: Nike Air Jordan");
            sub.setText("Shoe Model Number: A1234");
            tvdetail.setText("Price: 56.5");
        }
    }}