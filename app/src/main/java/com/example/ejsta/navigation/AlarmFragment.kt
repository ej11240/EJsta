package com.example.ejsta.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ejsta.R

class AlarmFragment : Fragment(){
    fun onCreate(inflater:LayoutInflater,container:ViewGroup?,savedInstaceState: Bundle?): View?{
        var view =LayoutInflater.from(activity).inflate(R.layout.fragment_alarm,container,false)
        return view
    }
}