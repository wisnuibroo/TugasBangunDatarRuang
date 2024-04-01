package com.example.tugasbangundatarruang;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class BangunRuangFragment extends Fragment {

    private CardView kubusCard;
    private CardView balokCard;
    private CardView limasCard;
    private CardView bolaCard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangunruang, container, false);

        kubusCard = view.findViewById(R.id.cardKubus);
        balokCard = view.findViewById(R.id.cardBalok);
        limasCard = view.findViewById(R.id.cardLimas);
        bolaCard = view.findViewById(R.id.cardBola);


        if (kubusCard != null) {
            kubusCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), kubus.class);
                    startActivity(intent);
                }
            });
        }

        if (balokCard != null) {
            balokCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), balok.class);
                    startActivity(intent);
                }
            });
        }

        if (limasCard != null) {
            limasCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), limas.class);
                    startActivity(intent);
                }
            });
        }

        if (bolaCard != null) {
            bolaCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), bola.class);
                    startActivity(intent);
                }
            });
        }


        return view;
    }
}
