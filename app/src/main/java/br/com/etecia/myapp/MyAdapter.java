package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Jogadoras> lstJogadoras;

    public MyAdapter(Context mContexto, List<Jogadoras> lstJogadoras){
        this.mContexto = mContexto;
        this.lstJogadoras = lstJogadoras;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(mContexto);
        view = inflater.inflate(R.layout.selbrasileira_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        holder.idSelBrasileira.setText(lstJogadoras.get(position).getNome());
        holder.idMarta.setImageResource(lstJogadoras.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstJogadoras.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView idSelBrasileira;

        ImageView idMarta;

        CardView idBrMarta;

        public ViewHolder(View view) {
            super(view);
            idSelBrasileira = view.findViewById(R.id.idSelBrasileira);
            idMarta = view.findViewById(R.id.idMarta);
            idBrMarta = view.findViewById(R.id.idBrMarta);

        }
    }
}
