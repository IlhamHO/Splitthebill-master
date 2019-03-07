package be.ehb.splitthebill.fragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import be.ehb.splitthebill.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EersteFragment extends Fragment {

    private EditText etTotal;
    private TextView tvAmount;
    private TextView etSize;
    private Button btnShow;
    private TextView tvShow;

    private View.OnClickListener showClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

           /* StringBuilder stringBuilder =new StringBuilder();
            stringBuilder.append(etTotal.getText());
            stringBuilder.append(etAmount.getText());
            stringBuilder.append(etSize.getText());*/
            if(etTotal.getText().length() != 0) {
                Double total = Double.parseDouble(etTotal.getText().toString());
                Double amount = Double.parseDouble(tvAmount.getText().toString());
                Double size = Double.parseDouble(etSize.getText().toString());
                Double totalprijs = total+amount;
                Double showPrijs = totalprijs / size;
                tvShow.setText(String.valueOf(showPrijs)+" "+"Euro"+"/ "+"man");
            }
           /* etTotal.setText(stringBuilder);
            etAmount.setText(stringBuilder);
            etSize.setText(stringBuilder);*/


        }
    };


    public EersteFragment() {
        // Required empty public constructor
    }
    public static EersteFragment newInstance(){
        return new EersteFragment();
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_eerste, container, false);

        etTotal = view.findViewById(R.id.et_ef_total);
        tvAmount = view.findViewById(R.id.tv_amount);
        etSize = view.findViewById(R.id.et_ef_size);
        btnShow = view.findViewById(R.id.btn_ef_show);
        tvShow = view.findViewById(R.id.tv_ef_show);
        btnShow.setOnClickListener(showClickListener);





        return view;
    }
    @Override
    public void onStart() {
        super.onStart();
        String amount = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("edit_text_preference_1", "0");
        tvAmount.setText(amount);
    }


    }
