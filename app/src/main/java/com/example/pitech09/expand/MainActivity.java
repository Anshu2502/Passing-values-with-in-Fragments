package com.example.pitech09.expand;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Add_List.getWord, Show_List.sendT, Remove_List.sendword {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fr = new Add_List();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame1, fr);
        fragmentTransaction.commit();

    }

    @Override
    public void setName(String name) {
        Show_List f2 = (Show_List)getFragmentManager().findFragmentById(R.id.frame2);
        f2.updateInfo(name);
    }

    @Override
    public void SetMain(String name) {
        Remove_List f3 = (Remove_List)getFragmentManager().findFragmentById(R.id.frame3);
        f3.updateIn(name);
    }


    @Override
    public void SendtMain(String name) {
        Show_List f4 = (Show_List)getFragmentManager().findFragmentById(R.id.frame2);
        f4.update(name);
    }
}
