package com.example.krish.button3

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      b1.setOnClickListener {
           val i = Intent()
           i.action=Intent.ACTION_DIAL
           i.data= Uri.parse("tel:"+et1.text.toString())
           startActivity(i)
       }

       /* b1.setOnClickListener {
            val i =Intent()
            i.action=Intent.ACTION_VIEW
            i.data = Uri.parse("https://github.com/Krishnao1/alltext")
            startActivity(i)
        }*/

        b1.setOnClickListener {
            val i =Intent()
            i.action=Intent.ACTION_GET_CONTENT
            i.type="*/*"
            startActivity(i)
        }

        b2.setOnClickListener {
            val i =Intent(this@MainActivity,WelcomeActivity::class.java)
            i.putExtra("a_name",et2.text.toString())
            startActivity(i)
        }
        b3.setOnClickListener {
            val i = packageManager.getLaunchIntentForPackage("com.whatsapp")
            if (i==null){
              val i =Intent()
                i.action=Intent.ACTION_VIEW
                i.data= Uri.parse("https://play.google.com/store/movies/details/Don_Jon?id=Nkux1nDyKm4")
                startActivity(i)
            }else{
                startActivity(i)
            }
        }

    }
}
