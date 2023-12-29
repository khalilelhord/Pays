package com.example.pays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PaysAdapter extends BaseAdapter {

    private Context ct;

    public PaysAdapter(Context c) {
        ct = c;
    }
    @Override
    public int getCount() {
        return Pays.listPays.size();
    }

    @Override
    public Object getItem(int i) {
        return Pays.listPays.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view!=null){

        view = LayoutInflater.from(ct).inflate(R.layout.lv_tem,viewGroup,false);}

        ImageView img = view.findViewById(R.id.IMGLOGO);
        TextView TxtPays = view.findViewById(R.id.PaysNOM);
        TextView TxtIndicatif = view.findViewById(R.id.Indicatif);
        TextView TxtCapital = view.findViewById(R.id.Caiptal);
        TextView TxtContient = view.findViewById(R.id.Continent);
        Pays P = Pays.listPays.get(i);


        img.setImageResource(P.getLogo());
        TxtContient.setText(P.getContinent());
        TxtPays.setText(P.getDrapeau());
        TxtCapital.setText(P.getCapital());
        TxtIndicatif.setText(P.getIndicatif());








        return view;
    }
}
