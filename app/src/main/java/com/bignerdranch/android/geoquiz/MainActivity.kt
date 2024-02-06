package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var trueButton: Button
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener { view: View ->
            val snackbar = Snackbar.make(
                view,
                R.string.correct_toast,
                Snackbar.LENGTH_SHORT
            )

            // Accessing the Snackbar's TextView to modify its properties
            val textView: TextView = snackbar.view.findViewById(R.id.snackbar_text)
            // For center alignment
            textView.textAlignment = View.TEXT_ALIGNMENT_CENTER

            snackbar.show()
        }

        falseButton.setOnClickListener { view: View ->
            val snackbar = Snackbar.make(
                view,
                R.string.incorrect_toast,
                Snackbar.LENGTH_SHORT
            )

            val textView: TextView = snackbar.view.findViewById(R.id.snackbar_text)
            textView.textAlignment = View.TEXT_ALIGNMENT_CENTER

            snackbar.show()
        }
    }
}
