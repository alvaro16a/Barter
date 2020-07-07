package com.alvaromena.practica_final

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_tieda.*

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class TiendaFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tieda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bt_ofertas.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
        ibt_eliminar.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_eliminarProductoFragment)
        }

        ibt_agregar.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_agregarProductoFragment)
        }

        ibt_editar.setOnClickListener{
            findNavController().navigate(R.id.action_SecondFragment_to_editarProductoFragment)
        }
    }
}