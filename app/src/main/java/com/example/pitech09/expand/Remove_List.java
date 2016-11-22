package com.example.pitech09.expand;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pitech09 on 11/21/2016.
 */
public class Remove_List extends Fragment {

    String s;
    sendword sd;
    TextView t1;
    Button re;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.remove, container, false);

        t1 = (TextView) view.findViewById(R.id.text);

        re = (Button) view.findViewById(R.id.remove);

        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
                sd.SendtMain(s);
                t1.setVisibility(View.GONE);
            }
        });

        return view;

    }

    public void updateIn(String name) {

    t1.setVisibility(View.VISIBLE);
    t1.setText(name);
    s = name;
    }

    interface sendword{
        void SendtMain(String name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{

            sd = (sendword) activity;

        }catch (Exception e){

        }
    }

}
