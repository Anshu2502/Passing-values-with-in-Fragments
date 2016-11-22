package com.example.pitech09.expand;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Pitech09 on 11/21/2016.
 */
public class Add_List extends Fragment {

    getWord getWords;
    EditText e1;
    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.add, container, false);

        e1 = (EditText) view.findViewById(R.id.ename);
        b1 = (Button) view.findViewById(R.id.add);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String st = e1.getText().toString().trim();
                getWords.setName(st);

            }
        });

        return view;

    }

    public interface  getWord{
      void setName(String Name);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            getWords = (getWord) activity;

        }catch (Exception e){

        }
    }

}
