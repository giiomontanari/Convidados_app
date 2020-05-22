package com.example.convidados.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.convidados.R
import com.example.convidados.viewmodel.AbstentViewModel

class AbstentFragment : Fragment() {

    private lateinit var abstentViewModel: AbstentViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        abstentViewModel =
                ViewModelProviders.of(this).get(AbstentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_absent, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        abstentViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
