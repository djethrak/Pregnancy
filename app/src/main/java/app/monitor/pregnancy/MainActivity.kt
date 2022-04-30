package app.monitor.pregnancy

import android.graphics.Color
import android.os.Bundle
import android.view.ViewTreeObserver.OnGlobalLayoutListener
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import app.monitor.pregnancy.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(binding!!.root)
        createMonthSpinner()
    }

    private fun createMonthSpinner() {
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.months_array, android.R.layout.simple_spinner_item
        )
// Specify the layout to use when the list of choices appears
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
// Apply the adapter to the spinner
// Apply the adapter to the spinner
        binding!!.monthSpinner.adapter = adapter
        binding!!.monthSpinner.viewTreeObserver.addOnGlobalLayoutListener {
            (binding!!.monthSpinner.selectedView as TextView).setTextColor(Color.WHITE)
        }
    }
}