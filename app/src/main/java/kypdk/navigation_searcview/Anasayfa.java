package kypdk.navigation_searcview;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Anasayfa extends Fragment {

     View rootView;
     SharedPreferences prefs;
     FragmentTransaction trans;
     public ImageButton meal;

     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.anasayfa, container, false);
         if (container == null) {
             return null;
         }

         return rootView;
     }
 }