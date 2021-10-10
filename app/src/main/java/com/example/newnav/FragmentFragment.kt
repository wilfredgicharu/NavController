package com.example.newnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_fragment.view.*


class FragmentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_fragment, container, false)
        view.first_fragment.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_fragmentFragment_to_secondFragment)
        }



        return view
    }


}