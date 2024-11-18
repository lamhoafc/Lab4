package fpoly.account.lab4.b1;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import fpoly.account.lab4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnFragment1 = findViewById(R.id.btnFragment1);
        Button btnFragment2 = findViewById(R.id.btnFragment2);

        btnFragment1.setOnClickListener(v -> {
            Fragment1 fragment1 = new Fragment1();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment1)
                    .commit();

        });

        btnFragment2.setOnClickListener(v -> {
            Fragment2 fragment2 = new Fragment2();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment2)
                    .commit();

        });
    }
}