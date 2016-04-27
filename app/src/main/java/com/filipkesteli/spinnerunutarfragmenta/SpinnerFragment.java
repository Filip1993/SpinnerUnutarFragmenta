package com.filipkesteli.spinnerunutarfragmenta;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerFragment extends Fragment {

    private Spinner spCountries;

    public SpinnerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_spinner, container, false);

        initWidgets(v);
        setupListeners(v);

        return v;
    }

    private void initWidgets(View v) {
        spCountries = (Spinner) v.findViewById(R.id.spCountries);
    }

    private void setupListeners(View v) {

    }
}
