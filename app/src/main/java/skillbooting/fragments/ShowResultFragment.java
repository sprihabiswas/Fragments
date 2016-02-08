package skillbooting.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Spriha Biswas on 2/8/2016.
 */
public class ShowResultFragment extends Fragment {
    View v;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.show_result, container, false);
        tv=(TextView)v.findViewById(R.id.tv_result);

        if(getArguments()!= null)
            updateView(getArguments().getInt("ID",0));

        return v;
    }

    public void updateView(int x)
    {
        String y=""+(x-R.id.first_button+1);
        tv.setText(y);
    }

}

