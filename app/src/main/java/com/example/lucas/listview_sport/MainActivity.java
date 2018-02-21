package com.example.lucas.listview_sport;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[] {
                "Basket",
                "Foot",
                "Golf",
                "Rugby" };

        MonAdaptateurDeListe adaptateur = new MonAdaptateurDeListe(this, values);
        setListAdapter(adaptateur);
    }
}