package com.alvaromena.practica_final

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_datos_producto.*

class DatosProductoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_datos_producto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ibt_cancelar.setOnClickListener{
            findNavController().navigate(R.id.action_datosProductoFragment_to_FirstFragment)
        }
        bt_opiniones.setOnClickListener{
            findNavController().navigate(R.id.action_datosProductoFragment_to_opinionesFragment)
        }

        bt_contactar.setOnClickListener{
            findNavController().navigate(R.id.action_datosProductoFragment_to_contactarFragment)
        }
    }
}