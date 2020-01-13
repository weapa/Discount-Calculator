package th.ac.su.ict.discountcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val originalpc = findViewById<EditText>(R.id.originalpc)
        val percent = findViewById<EditText>(R.id.percent)
        val btcal = findViewById<Button>(R.id.btcal)
        val shprice = findViewById<TextView>(R.id.shprice)
        val checkbox = findViewById<CheckBox>(R.id.checkbox)

        btcal.setOnClickListener() {
            var originalprice:Float = originalpc.text.toString().toFloat()
            var percentoff:Float = percent.text.toString().toFloat()
            var resultcal = (originalprice * percentoff) / 100
            var resultprice: Float = 0F
                resultprice = originalprice - percentoff

            if (checkbox.isChecked) {
                resultprice += (resultprice / 100)*7
            }
            shprice.setText(resultprice.toString())
        }
    }
}
