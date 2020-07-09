package com.example.ejsta.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ejsta.R

class UserFragment : Fragment(){
    fun onCreate(inflater:LayoutInflater,container:ViewGroup?,savedInstaceState: Bundle?): View?{
        var view =LayoutInflater.from(activity).inflate(R.layout.fragment_user,container,false)
        return view
    }
}