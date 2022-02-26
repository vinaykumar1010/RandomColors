package com.vinappstudio.randomcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowId;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
public View Window;
public Button button;
public  int[] arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr =  new int[]{Color.MAGENTA,Color.RED,Color.GREEN,Color.YELLOW,Color.WHITE,Color.LTGRAY,Color.CYAN};
        Window = findViewById(R.id.window_view);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arrLength = arr.length;
                Random random = new Random();
                int randomNum = random.nextInt(arrLength);
                Window.setBackgroundColor(arr[randomNum]);
            }
        });
    }
}