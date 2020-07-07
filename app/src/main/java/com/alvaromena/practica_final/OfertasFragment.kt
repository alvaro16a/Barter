package com.alvaromena.practica_final

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_ofertas.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class OfertasFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ofertas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_tienda.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        ibt11.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_datosProductoFragment)
        }
        ibt12.setOnClickListener{
            findNavController().navigate(R.id.action_FirstFragment_to_datosProductoFragment)
        }
    }
}