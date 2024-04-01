package com.example.tugasbangundatarruang;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class BangunDatarFragment extends Fragment {

    private CardView persegiCard;
    private CardView persegiPanjangCard;
    private CardView segitigaCard;
    private CardView lingkaranCard;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangundatar, container, false);

        persegiCard = view.findViewById(R.id.cardPersegi);
        persegiPanjangCard = view.findViewById(R.id.cardPersegiPanjang);
        segitigaCard = view.findViewById(R.id.cardSegitiga);
        lingkaranCard = view.findViewById(R.id.cardLingkaran);


        if (persegiCard != null) {
            persegiCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), persegi.class);
                    startActivity(intent);
                }
            });
        }

        if (persegiPanjangCard != null) {
            persegiPanjangCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), persegipanjang.class);
                    startActivity(intent);
                }
            });
        }

        if (segitigaCard != null) {
            segitigaCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), segitiga.class);
                    startActivity(intent);
                }
            });
        }

        if (lingkaranCard != null) {
            lingkaranCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(getActivity(), lingkaran.class);
                    startActivity(intent);
                }
            });
        }

        return view;
    }
}
