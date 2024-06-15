package com.example.recyrcleyview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.recyrcleyview.R;
import com.example.recyrcleyview.model.Productos;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListaAdapterProducto extends RecyclerView.Adapter<ListaAdapterProducto.listaProductoViewHolder> {

    ArrayList<Productos> listaProducto;


    public ListaAdapterProducto(ArrayList<Productos> listaProducto) {
        this.listaProducto = listaProducto;
    }

    //conexion con nuestra interfaz
    @NonNull
    @Override
    public ListaAdapterProducto.listaProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_productos,null,false);
        return new listaProductoViewHolder(view);
    }

    //conexion con clase clientes y mis identificadores
    @Override
    public void onBindViewHolder(@NonNull ListaAdapterProducto.listaProductoViewHolder holder, int position) {
        holder.tvN.setText(listaProducto.get(position).getNombre());
        holder.tvP.setText(String.valueOf(listaProducto.get(position).getPrecio()));
        holder.tvD.setText(listaProducto.get(position).getDescripcion());
    }

    //el tamano de mis lista de clientes
    @Override
    public int getItemCount() {
        return listaProducto.size();
    }

    //la conexion o el puente entre el xml y la clase R.
    public class listaProductoViewHolder extends RecyclerView.ViewHolder {
        TextView tvN, tvP, tvD;
        public listaProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            tvN = itemView.findViewById(R.id.txtNombre);
            tvP= itemView.findViewById(R.id.txtPrecio);
            tvD = itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
