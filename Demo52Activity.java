package fpl.quangnm.lab1.demo5;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import fpl.quangnm.lab1.R;

public class Demo52Activity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo52);
        drawerLayout = findViewById(R.id.drawer_layour_52);
        NavigationView navigationView = findViewById(R.id.demo52_nav);
        viewPager = findViewById(R.id.demo53_viewPager);
        tabLayout = findViewById(R.id.demo53_Tablayout);
        addTabLayout(viewPager);
        tabLayout.setupWithViewPager(viewPager);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.demo51_menu_item1){
                    viewPager.setCurrentItem(0);
                    closeDrawer();
                    return true;
                } else if (menuItem.getItemId() == R.id.demo51_menu_item2){
                    viewPager.setCurrentItem(1);
                    closeDrawer();
                    return true;
                } else if (menuItem.getItemId() == R.id.demo51_menu_item3){
                    viewPager.setCurrentItem(2);
                    closeDrawer();
                    return true;
                }
                return false;
            }
        });
    }
    private void closeDrawer(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public void addTabLayout(@NonNull ViewPager viewPager){
        // tao moi  Adapter
        Demo53Adapter adapter =  new Demo53Adapter(getSupportFragmentManager());
        adapter.addFrm(new BlankFragment1(),"ONE");
        adapter.addFrm(new BlankFragment2(),"TWO");
        adapter.addFrm(new BlankFragment3(),"THREE");

        viewPager.setAdapter(adapter);
    }
}