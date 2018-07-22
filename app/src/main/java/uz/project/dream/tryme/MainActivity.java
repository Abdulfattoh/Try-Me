package uz.project.dream.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMe;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.GREEN, Color.WHITE, Color.YELLOW, Color.DKGRAY, Color.GRAY, Color.BLUE, Color.BLACK, Color.CYAN, Color.RED, Color.MAGENTA};

        windowView = findViewById(R.id.windowView);
        tryMe = findViewById(R.id.press);

        tryMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Array length
                int colorArrayLength = colors.length;

                Random random = new Random();

                int randomNum = random.nextInt(colorArrayLength);
                windowView.setBackgroundColor(colors[randomNum]);
                

            }
        });
    }
}
