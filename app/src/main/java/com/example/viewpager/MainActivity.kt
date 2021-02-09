package com.example.viewpager

import ViewPagerAdapter
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {


    private lateinit var viewPager: ViewPager
    private lateinit var mViewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textList = ArrayList<String>()
        textList.add("Slide 1")
        textList.add("Slide 2")
        textList.add("Slide 3")
        viewPager = findViewById(R.id.viewPager)

        mViewPagerAdapter = ViewPagerAdapter(this, textList)

        viewPager.pageMargin = 15
        viewPager.setPadding(50, 0, 50, 0);
        viewPager.setClipToPadding(false)
        viewPager.setPageMargin(25)
        viewPager.adapter = mViewPagerAdapter
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener)
    }

        val viewPagerPageChangeListener: ViewPager.OnPageChangeListener=
                object : ViewPager.OnPageChangeListener {
                    override fun onPageScrollStateChanged(state: Int) {
                        TODO("Not yet implemented")
                    }

                    override fun onPageScrolled(
                            position: Int,
                            positionOffset: Float,
                            positionOffsetPixels: Int
                    ) {
                        TODO("Not yet implemented")
                    }

                    override fun onPageSelected(position: Int) {
                        TODO("Not yet implemented")
                    }
                }

        /*val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        viewPager.adapter = mViewPagerAdapter*/



    }
