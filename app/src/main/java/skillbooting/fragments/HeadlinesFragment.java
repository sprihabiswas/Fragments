package skillbooting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import skillbooting.fragments.R;

/**
 * Created by Spriha Biswas on 2/8/2016.
 */
public class HeadlinesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.headlines_view, container, false);
    }
}

