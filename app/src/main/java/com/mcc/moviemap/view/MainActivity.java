package com.mcc.moviemap.view;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import com.mcc.moviemap.R;
import com.mcc.moviemap.view.fragments.FindFragment;
import com.mcc.moviemap.view.fragments.MapFragment;
import com.mcc.moviemap.view.fragments.MovieFragment;
import com.mcc.moviemap.view.fragments.UserFragment;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView navigationView;
    private List<Fragment> fragments = new ArrayList<>();
    private int lastFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //设置状态栏透明
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            //设置状态栏为透明灰色
            getWindow().setStatusBarColor(getResources().getColor(R.color.decorView));
        }
        //初始化界面，BottomNavigationView,Fragment;
        MainViewInit();
    }
    private void MainViewInit() {
        FindFragment findFragment = new FindFragment();
        MapFragment mapFragment = new MapFragment();
        MovieFragment movieFragment = new MovieFragment();
        UserFragment userFragment = new UserFragment();
        fragments.add(findFragment);
        fragments.add(mapFragment);
        fragments.add(movieFragment);
        fragments.add(userFragment);
        lastFragment = 0;
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_view,findFragment).show(findFragment).commit();
        navigationView = findViewById(R.id.navigation);

        navigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_find:
                        if (lastFragment != 0) {
                            switchFragments(lastFragment,0);
                            lastFragment = 0;
                        }
                        return true;
                    case R.id.navigation_map:
                        if (lastFragment != 1) {
                            switchFragments(lastFragment,1);
                            lastFragment = 1;
                        }
                        return true;
                    case R.id.navigation_movie:
                        if (lastFragment != 2) {
                            switchFragments(lastFragment,2);
                            lastFragment = 2;
                        }
                        return true;
                    case R.id.navigation_myself:
                        if (lastFragment != 3) {
                            switchFragments(lastFragment,3);
                            lastFragment = 3;
                        }
                        return true;
                }
                return false;
            }
        });
    }
    private void switchFragments(int lastFragment,int index){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        //隐藏上一个Fragment
        transaction.hide(fragments.get(lastFragment));
        if (fragments.get(index).isAdded() == false) {
            transaction.add(R.id.main_view,fragments.get(index));
        }
        transaction.show(fragments.get(index)).commitAllowingStateLoss();
    }
}
