package com.example.navcomponentex.details


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navcomponentex.R
import kotlinx.android.synthetic.main.fragment_details.*

/**
 * A simple [Fragment] subclass.
 */
class DetailsFragment : Fragment() {

    // 8- Receiving the args
    private val safeArgs: DetailsFragmentArgs by navArgs()

    /**

        arguments?.let {
            val safeArgs = PhotosFragmentArgs.fromBundle(it)
            tv_notifications.text = "You have ${safeArgs.numNotification} today!"
        }

     */

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv_notifications.text = "You have ${safeArgs.numNotification} today!"

        bt_next.setOnClickListener {
            val action = DetailsFragmentDirections.nextAction()
            Navigation.findNavController(view).navigate(action)
        }
    }


}
