package com.awadkhaled.loginfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class BlankFragment : Fragment() {
    private var email : String? = ""
    private var password: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView_email).text = email
        view.findViewById<TextView>(R.id.textView_password).text = password
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String?, param2: String?) =
            BlankFragment().apply {
                email = param1
                password = param2
            }
    }
}