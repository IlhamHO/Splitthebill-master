package be.ehb.splitthebill.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.splitthebill.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TweedeFragment extends Fragment {


    public TweedeFragment() {
        // Required empty public constructor
    }
    public static TweedeFragment newInstance(){
        TweedeFragment tf= new TweedeFragment();
        Bundle bundle = new Bundle();
        tf.setArguments(bundle);
        return tf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tweede, container, false);
    }

}
