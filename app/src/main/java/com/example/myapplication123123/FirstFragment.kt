package com.example.myapplication123123

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //liczby
        view.findViewById<Button>(R.id.button1).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("1",)
        }
        view.findViewById<Button>(R.id.button2).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("2",)
        }
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("3",)
        }
        view.findViewById<Button>(R.id.button4).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("4",)
        }
        view.findViewById<Button>(R.id.button5).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("5",)
        }
        view.findViewById<Button>(R.id.button6).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("6",)
        }
        view.findViewById<Button>(R.id.button7).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("7",)
        }
        view.findViewById<Button>(R.id.button8).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("8",)
        }
        view.findViewById<Button>(R.id.button9).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("9",)
        }
        view.findViewById<Button>(R.id.button0).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("0",)
        }
        //znaki

        view.findViewById<Button>(R.id.buttonplus).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("+",)
        }

        view.findViewById<Button>(R.id.buttondzielenie).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("/",)
        }

        view.findViewById<Button>(R.id.buttonmnozenie).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("*",)
        }
        view.findViewById<Button>(R.id.buttonprzecinek).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText(".",)
        }
        view.findViewById<Button>(R.id.buttonClear).setOnClickListener {
            view.findViewById<TextView>(R.id.textdzialanie).setText("" ,)
            view.findViewById<TextView>(R.id.textWynik).setText("" ,)
        }
        view.findViewById<Button>(R.id.buttondel).setOnClickListener {
            val text = view.findViewById<TextView>(R.id.textdzialanie).text.toString()
           // view.findViewById<TextView>(R.id.textdzialanie).text = text.drop(1)
        }

        view.findViewById<Button>(R.id.buttonWynik).setOnClickListener {
            view.findViewById<TextView>(R.id.textWynik).text=("cos tam dziala przycisk")
        }

    }


}
