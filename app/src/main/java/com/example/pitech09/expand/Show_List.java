package com.example.pitech09.expand;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Pitech09 on 11/21/2016.
 */
public class Show_List extends Fragment {

    sendT st;
    TextView t1;
    String se;
    ArrayList<String> list;
    ListView lv;
    ArrayAdapter<String> arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.show, container, false);

        lv = (ListView) view.findViewById(R.id.list);


         list = new ArrayList<String>();
        return view;

    }

    public interface sendT{

        void SetMain(String name);

    }


    public void updateInfo(String name) {

        se = name;
        list.add(se);
        arrayAdapter.notifyDataSetChanged();

    }

    public void update(String name) {


        arrayAdapter.remove(name);
        arrayAdapter.notifyDataSetChanged();

    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            st = (sendT) activity;

        }catch (Exception e){

        }
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        arrayAdapter = new ArrayAdapter<String>( getActivity(), android.R.layout.simple_list_item_1, list );

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String naam = list.get(+position).toString();
                st.SetMain(naam);
               // arrayAdapter.remove(naam);
                //arrayAdapter.notifyDataSetChanged();
            }
        });

    }

}
