package com.example.primerp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var pactual = 0

    val man =80

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtActual.text = getString(R.string.manzanas, pactual.toString())

        btn5.setOnClickListener {

            incrementScore5()

        }
        btn15.setOnClickListener {

            incrementScore15()

        }
        btn30.setOnClickListener {

            incrementScore30()

        }
        btn50.setOnClickListener {

            incrementScore50()

        }
        ibtnTotal.setOnClickListener {

           var mtotal = (etxtTotal.text.toString().toDouble()* man)

            Toast.makeText(this, "El Total de manzanas: ${mtotal.toString()}", Toast.LENGTH_LONG).show()
        }
        ibtnActual.setOnClickListener {

            var mactual = man * pactual

            Toast.makeText(this, "El Actual de manzanas: ${mactual.toString()}", Toast.LENGTH_LONG).show()
        }
        btnCalcular.setOnClickListener {
            var Porcentaje: Double = (pactual * 100)/(etxtTotal.text.toString().toDouble()* man)
            Toast.makeText(this, "El Porcentaje de manzanas: ${Porcentaje.toString()}", Toast.LENGTH_LONG).show()


        }

    }
    private fun incrementScore5(){

        pactual = pactual+5
        val newScore = getString(R.string.manzanas, pactual.toString())
        txtActual.text=newScore

    }
    private fun incrementScore15(){

        pactual = pactual+15
        val newScore = getString(R.string.manzanas, pactual.toString())
        txtActual.text=newScore

    }
    private fun incrementScore30(){

        pactual = pactual+30
        val newScore = getString(R.string.manzanas, pactual.toString())
        txtActual.text=newScore

    }
    private fun incrementScore50(){

        pactual = pactual+50
        val newScore = getString(R.string.manzanas, pactual.toString())
        txtActual.text=newScore

    }
}

