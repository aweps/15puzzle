package com.webkrux.fifteenpuzzle

import android.os.Bundle
import com.webkrux.flutter.gpg.PlayGamesPlugin
import com.webkrux.flutter.registerWith

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity : FlutterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)

        // Register my very own
        // flutter plugins.
        registerWith(this)
    }

}
