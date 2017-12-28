package com.scts.hand.firstlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.scts.hand.first.CDialogMethod
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val tv=findViewById<TextView>(R.id.textview_helloword)
     tv.setOnClickListener {
            CDialogMethod.showDialog(this)
        }



    }
}
