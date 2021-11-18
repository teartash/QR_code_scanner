package com.raj.qr_code_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raj.qr_code_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        const val RESULT="RESULT"
    }

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnScan.setOnClickListener {
            val intent=Intent(applicationContext,Activity_Scan::class.java)
            startActivity(intent)
        }
        val result=intent.getStringExtra(RESULT)

        if (result!=null){
            binding.txtResult.text=result.toString()

            }
        }
    }
