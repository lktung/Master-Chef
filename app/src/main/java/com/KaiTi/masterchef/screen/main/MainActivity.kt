package com.KaiTi.masterchef.screen.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.KaiTi.masterchef.R
import com.KaiTi.masterchef.screen.main.home.HomeFragment
import com.KaiTi.masterchef.screen.main.toolbar.ToolbarFragment
import com.KaiTi.masterchef.utils.addFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(ToolbarFragment(), R.id.toolbarLayout)
        addFragment(HomeFragment(), R.id.container)
    }
}