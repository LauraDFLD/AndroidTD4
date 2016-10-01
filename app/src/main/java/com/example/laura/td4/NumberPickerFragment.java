package com.example.laura.td4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;

/**
 * Created by laura on 01/10/2016.
 */

public class NumberPickerFragment extends Fragment {

    public NumberPickerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment = inflater.inflate(R.layout.fragment_number_picker, container, false);

        NumberPicker nbpicker = (NumberPicker) viewFragment.findViewById(R.id.numberPicker);
        nbpicker.setMaxValue(10);
        nbpicker.setMinValue(0);

        nbpicker.setValue(0);

        return viewFragment;
    }
}
