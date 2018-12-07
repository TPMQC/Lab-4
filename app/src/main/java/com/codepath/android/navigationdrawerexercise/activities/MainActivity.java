package com.codepath.android.navigationdrawerexercise.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.codepath.android.navigationdrawerexercise.R;


public class MainActivity extends AppCompatActivity {
//    // Set a Toolbar to replace the ActionBar.
//    ActionBarDrawerToggle drawerToggle;
//    DrawerLayout dlDrawer;
//    Toolbar toolbar;
//    NavigationView nvDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Find our drawer view
//        nvDrawer = (NavigationView) findViewById(R.id.nvView);
//        // Setup drawer view
//        setupDrawerContent(nvDrawer);
//
////        // Find the toolbar view inside the activity layout
////        toolbar = (Toolbar) findViewById(R.id.toolbar);
////        // Sets the Toolbar to act as the ActionBar for this Activity window.
////        // Make sure the toolbar exists in the activity and is not null
////        setSupportActionBar(toolbar);
////
////        // Find our drawer view
////        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
////        drawerToggle = setupDrawerToggle();
////
////        // Tie DrawerLayout events to the ActionBarToggle
////        mDrawer.addDrawerListener(drawerToggle);
////
////        // Find our drawer view
////        nvDrawer = (NavigationView) findViewById(R.id.nvView);
////        // Setup drawer view
////        setupDrawerContent(nvDrawer);
////
////        // There is usually only 1 header view.
////        // Multiple header views can technically be added at runtime.
////        // We can use navigationView.getHeaderCount() to determine the total number.
////        View headerLayout = nvDrawer.getHeaderView(0);
////
////        nvDrawer.getMenu().getItem(0).setChecked(true);
////        FragmentManager fragmentManager = getSupportFragmentManager();
////        fragmentManager.beginTransaction().replace(R.id.flContent, new FamilyGuyFragment()).commit();
////        setTitle(R.string.family_guy);
////}
//
//        // ...From section above...
//        // Find our drawer view
//        nvDrawer = (NavigationView) findViewById(R.id.nvView);
//        // Setup drawer view
//        setupDrawerContent(nvDrawer);
//    }
//
//    private void setupDrawerContent(NavigationView navigationView) {
//        navigationView.setNavigationItemSelectedListener(
//                new NavigationView.OnNavigationItemSelectedListener() {
//                    @Override
//                    public boolean onNavigationItemSelected(MenuItem menuItem) {
//                        selectDrawerItem(menuItem);
//                        return true;
//                    }
//                });
//    }
//
//    public void selectDrawerItem(MenuItem menuItem) {
//        // Create a new fragment and specify the fragment to show based on nav item clicked
//        Fragment fragment = null;
//        Class fragmentClass;
//        switch(menuItem.getItemId()) {
//            case R.id.nav_first_fragment:
//                fragmentClass = SimpsonsFragment.class;
//                break;
//            case R.id.nav_second_fragment:
//                fragmentClass = FuturamaFragment.class;
//                break;
//            case R.id.nav_third_fragment:
//                fragmentClass = FamilyGuyFragment.class;
//                break;
//            default:
//                fragmentClass = FuturamaFragment.class;
//        }
//
//        try {
//            fragment = (Fragment) fragmentClass.newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Insert the fragment by replacing any existing fragment
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
//
//        // Highlight the selected item has been done by NavigationView
//        menuItem.setChecked(true);
//        // Set action bar title
//        setTitle(menuItem.getTitle());
//        // Close the navigation drawer
//        mDrawer.closeDrawers();
    }


}
