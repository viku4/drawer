package com.example.drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import java.nio.channels.AsynchronousFileChannel.open

class MainActivity : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawlayout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_menu -> Toast.makeText(this, "clicked home", Toast.LENGTH_SHORT).show()
                R.id.nav_message -> Toast.makeText(this, "clicked message", Toast.LENGTH_SHORT)
                    .show()
                R.id.nav_sync -> Toast.makeText(this, "clicked sync", Toast.LENGTH_SHORT).show()
                R.id.nav_trash -> Toast.makeText(this, "clicked trush", Toast.LENGTH_SHORT).show()
                R.id.nav_setting -> Toast.makeText(this, "clicked setting", Toast.LENGTH_SHORT)
                    .show()
                R.id.nav_login -> Toast.makeText(this, "clicked login", Toast.LENGTH_SHORT).show()
                R.id.nav_share -> Toast.makeText(this, "clicked share", Toast.LENGTH_SHORT).show()
                R.id.nav_rate_us -> Toast.makeText(this, "clicked home", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}