package com.example.lab2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.animation.Animation;
        import android.view.animation.LinearInterpolator;
        import android.view.animation.RotateAnimation;
        import android.widget.ImageView;
        import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Switch sw;
    private boolean isRotating = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.flagview);
        sw = findViewById(R.id.Spin_switch);
        sw.setOnCheckedChangeListener((btn, isChecked) -> {


            //Inside the lambda function body { }, add an Animation object if the switch is checked:
            if (isChecked) {
                RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f,
                        Animation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(5000);
                rotate.setRepeatCount(Animation.INFINITE);
                rotate.setInterpolator(new LinearInterpolator());
                imageView.startAnimation(rotate);
            }
            else {
                imageView.clearAnimation();
            }
        });
    }

}
