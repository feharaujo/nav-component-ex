package com.example.navcomponentex.details


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.navcomponentex.R
import kotlinx.android.synthetic.main.fragment_final_details.*

/**
 * A simple [Fragment] subclass.
 */
class FinalDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_final_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bt_finish.setOnClickListener {
            val action = FinalDetailsFragmentDirections.finishAction()
            Navigation.findNavController(view).navigate(action)
        }

    }


}
