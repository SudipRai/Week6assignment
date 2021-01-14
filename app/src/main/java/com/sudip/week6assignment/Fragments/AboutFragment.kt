package com.sudip.week6assignment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.sudip.week6assignment.R

class AboutFragment : Fragment() {
    private lateinit var webview:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_about, container, false)
        webview=view.findViewById(R.id.webview)
        webview.loadUrl("https://softwarica.edu.np/")
        return view
    }


}