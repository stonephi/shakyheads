package layout;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stein.shakyheadbullshitspeaker.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Import extends android.support.v4.app.Fragment {


    public Import() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_import, container, false);
    }

}