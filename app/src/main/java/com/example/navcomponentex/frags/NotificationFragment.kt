package com.example.navcomponentex.frags


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.navcomponentex.R
import kotlinx.android.synthetic.main.fragment_notification.*
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class NotificationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notification, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 6-
        bt_moredetails.setOnClickListener {
            val random = Random()
            val action = NotificationFragmentDirections.nextAction()
            action.numNotification = random.nextInt(100)

            Navigation.findNavController(view).navigate(action)
        }
    }


}
