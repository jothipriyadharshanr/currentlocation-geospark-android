package ai.roam.currentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geospark.lib.GeoSpark;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GeoSpark.initialize(this, "YOU-SDK-KEY");
    }
}