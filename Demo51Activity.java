package fpl.quangnm.lab1.demo5;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import fpl.quangnm.lab1.R;

public class Demo51Activity extends AppCompatActivity {
    BottomNavigationView  bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bottomNavigationView = findViewById(R.id.demo51_bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.demo51_menu_item1){
                    Toast.makeText(Demo51Activity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.demo51_menu_item2) {
                    Toast.makeText(Demo51Activity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                } else if (menuItem.getItemId() == R.id.demo51_menu_item3) {
                    Toast.makeText(Demo51Activity.this, menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}