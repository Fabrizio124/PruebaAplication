package com.test.fabrizio.pruebaaplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.test.fabrizio.pruebaaplication.R
import com.test.fabrizio.pruebaaplication.databinding.ActivityMainBinding
import com.test.fabrizio.pruebaaplication.model.ChuckInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    private fun getRetrofit(): Retrofit {

        return Retrofit.Builder()
             .baseUrl("https://api.chucknorris.io/jokes/categories")
             .build()
     }
    private fun ChuckCorrutina(){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(ChuckInterface::class.java)
        }
    }
 }