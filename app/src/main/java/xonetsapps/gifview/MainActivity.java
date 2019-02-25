package xonetsapps.gifview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    GifImageView gifImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gifImageView=(GifImageView) findViewById(R.id.gf);
       // gifImageView.setVisibility(View.GONE);
    }
}
