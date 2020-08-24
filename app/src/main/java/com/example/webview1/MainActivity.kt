package com.example.webview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("https://turtleful.github.io/OnlineCecker-D2/")
        webview.settings.javaScriptEnabled = true
        webview.settings.setSupportZoom(false)
    }
}