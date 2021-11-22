package com.example.listaprodutos.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.adapters.ListaProdutosAdapter
import com.example.listaprodutos.models.Produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listaProdutosView = findViewById<RecyclerView>(R.id.lista_produtos)
        val produtos = listOf(
            Produto("Mouse Gamer","USB 4800 Dpi Pro M7 Rgb preto 64386 Fortrek CX 1 UN", 106.07),
            Produto("Mouse Gamer Warrior","Profissional Multilaser, 3200 dpi MO207 -CX 1 UN", 4499.10),
            Produto("Acer Aspire 5","Notebook Acer Core i5-10210U 8GB 512GB SSD Tela 15.6", 3799.00),
            Produto("Mouse Gamer","USB 4800 Dpi Pro M5 Rgb preto 64385 Fortrek CX 1 UN", 133.00),
            Produto("Mouse Gamer","usb 2400 Dpi XGamer Fire Button verde MO208 CX 1 UN", 68.05),
            Produto("Monitor LED 27","curvo Full HD C27F390F Samsung CX 1 UN", 1425.80),
            Produto("Monitor LED 24","Smart LS24AM506 Samsung CX 1 UN", 1793.53),
            Produto("Monitor LED 24","widescreen Curvo C24F390F Samsung CX 1 UN", 1338.50)

        )
        listaProdutosView.adapter = ListaProdutosAdapter(produtos, this)
        listaProdutosView.layoutManager = LinearLayoutManager(this)
    }
}