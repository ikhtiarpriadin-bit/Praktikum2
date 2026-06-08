package com.example.praktikum1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Tugas1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas1) // Pastikan nama file XML Anda di sini sesuai

        // 1. Deklarasikan semua komponen inputan & tombol
        val etNim = findViewById<EditText>(R.id.et_nim)
        val etNamaLengkap = findViewById<EditText>(R.id.et_nama_lengkap)
        val etProdi = findViewById<EditText>(R.id.et_prodi)
        val btnProses = findViewById<Button>(R.id.btn_proses)

        // 2. Pasang aksi ketika tombol ditekan
        btnProses.setOnClickListener {
            val nim = etNim.text.toString()
            val nama = etNamaLengkap.text.toString()
            val prodi = etProdi.text.toString()

            // Buat gabungan pesan sapaan
            val hasilInput = "NIM: $nim \nNama: $nama \nProdi: $prodi"

            // Munculkan pesan Toast
            Toast.makeText(this, hasilInput, Toast.LENGTH_LONG).show()
        }
    }
}