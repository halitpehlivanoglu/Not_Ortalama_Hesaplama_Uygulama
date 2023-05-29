package com.example.mobilprogramlamanotortuyg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mobilprogramlamanotortuyg.ui.theme.MobilProgramlamaNotOrtUygTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button=findViewById<Button>(R.id.btnSonuc)

        button.setOnClickListener{



        val v1=findViewById<EditText>(R.id.vize1Not)
        val fnl=findViewById<EditText>(R.id.finalNot)
        val txtGoster=findViewById<TextView>(R.id.tvSonuc)

        val vize1=v1.text.toString().toDouble()
        val final=fnl.text.toString().toDouble()

            txtGoster.text= "Ortalamanız: "+hesapla(vize1,final).toString()

            if(hesapla(vize1,final)>=0 && hesapla (vize1, final) <50)
            {

                Toast.makeText(this,"Dersten Kaldınız :(", Toast.LENGTH_LONG).show()
            }
            else if (hesapla(vize1,final)>=50 && hesapla (vize1, final) <=100)
            {
                Toast.makeText(this,"Tebrikler Geçtiniz ! :D ", Toast.LENGTH_LONG).show()

            }
            else
            {
                Toast.makeText(this,"Yanlış değerler girdiniz Lütfen sisteme yeniden giriş yapınız !", Toast.LENGTH_LONG).show()
            }
        }





    }
}

fun hesapla(vize1:Double,final:Double):Double
{
    val ogrenciOrtalama=(vize1*40+final*60)/100

    return ogrenciOrtalama
}
