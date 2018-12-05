package myshop.whatsmode.com.fuck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FuckView countdownView = findViewById(R.id.cv_countdownView);
        countdownView.start(1000 * 30 * 60);
    }
}
