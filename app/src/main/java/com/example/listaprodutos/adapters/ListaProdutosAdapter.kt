package com.example.listaprodutos.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.models.Produto

class ListaProdutosAdapter(private val produtos: List<Produto>, private val context: Context)
    : RecyclerView.Adapter<ListaProdutosAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        fun vincular(produtos: Produto){
            val produtoNome = itemView.findViewById<TextView>(R.id.nomeProduto)
            produtoNome.text = produtos.nome

            val produtoPreco = itemView.findViewById<TextView>(R.id.precoProduto)
            produtoPreco.text = produtos.preco.toString()

            val produtoDescricao = itemView.findViewById<TextView>(R.id.descricaoProduto)
            produtoDescricao.text = produtos.descricao
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(context)
            .inflate(R.layout.item_list, parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produtos = produtos[position]
        holder.vincular(produtos)
    }

    override fun getItemCount(): Int = produtos.size
}