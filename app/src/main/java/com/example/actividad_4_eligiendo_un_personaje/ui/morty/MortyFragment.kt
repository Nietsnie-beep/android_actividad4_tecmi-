package com.example.actividad_4_eligiendo_un_personaje.ui.morty

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.actividad_4_eligiendo_un_personaje.R

class MortyFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_morty, container, false);

        return view;
    }
}