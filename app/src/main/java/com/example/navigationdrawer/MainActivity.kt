package com.example.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // setSupportActionBar(binding.toolbar)

        val actionDrawableToggle = ActionBarDrawerToggle(
            this, binding.drawerlayoutMain, binding.toolbar, R.string.open, R.string.close
        )

        binding.drawerlayoutMain.addDrawerListener(actionDrawableToggle)
        actionDrawableToggle.syncState()

        // onClick
        binding.navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.chrome_nav -> {
                    // Event
                    Toast.makeText(this, "Chrome", Toast.LENGTH_SHORT).show()
                    //close Navigation Drawer
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }

                R.id.twitter_nav -> {
                    // Event
                    Toast.makeText(this, "Twitter", Toast.LENGTH_SHORT).show()
                    //close Navigation Drawer
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }

                R.id.facebook_nav -> {
                    // Event
                    Toast.makeText(this, "Facebook", Toast.LENGTH_SHORT).show()
                    //close Navigation Drawer
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }

                R.id.whatsapp_nav -> {
                    // Event
                    Toast.makeText(this, "Whatsapp", Toast.LENGTH_SHORT).show()
                    //close Navigation Drawer
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }
            }
            true
        }

    }
}