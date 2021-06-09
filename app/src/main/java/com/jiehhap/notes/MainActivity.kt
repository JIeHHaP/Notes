package com.jiehhap.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.jiehhap.notes.databinding.ActivityMainBinding
import com.jiehhap.notes.utilits.APP_ACTIVITY

class MainActivity : AppCompatActivity() {

    lateinit var mToolbar: Toolbar
    lateinit var mNavController: NavController
    private var _binding: ActivityMainBinding? = null
    val mBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        APP_ACTIVITY = this
        setContentView(mBinding.root)
        mToolbar = mBinding.toolbar
        mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setSupportActionBar(mToolbar)
        title = getString(R.string.title)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}