package sheraz.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val buttun:Button=findViewById(R.id.buttonFindAge)
        buttonFindAge.setOnClickListener{

            val EditText =editTextAge.text.toString().toInt()
            val yearCurrent= Calendar.getInstance().get(Calendar.YEAR)
            val myage =yearCurrent-EditText
            textViewAge.text=" your age is $myage"
        }
    }

    /*fun findage(view: View) {
    }*/
}