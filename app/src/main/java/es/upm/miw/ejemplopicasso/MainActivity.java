package es.upm.miw.ejemplopicasso;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);


        // https://www.artseasy.com/painting/20x24/Reproduction1_NZ/Pablo_Picasso013M.JPG
        // Dimensions: 1600 × 1920
        // Type: jpeg
        // Size: 509 kb

        //Picasso.get().load("https://www.artseasy.com/painting/20x24/Reproduction1_NZ/Pablo_Picasso013M.JPG").into(imageView);


        // Benidorm image alternative
        Picasso.get().load("https://i.pinimg.com/originals/00/aa/fd/00aafdc57273d28d3e0818b9fca9fc70.jpg").into(imageView);


    }
}
