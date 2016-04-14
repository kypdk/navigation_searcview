package kypdk.navisearch;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Arama extends Fragment {

    View rootView;
    SharedPreferences prefs;
    FragmentTransaction trans;

    private TextView tarama;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.arama, container, false);
        if (container == null) {
            return null;
        }



        SearchView searchView2 = MainActivity.searchView;
        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.e("aranan kelime", query);


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        tarama = (TextView) rootView.findViewById(R.id.t_arama);
        return rootView;
    }
}
