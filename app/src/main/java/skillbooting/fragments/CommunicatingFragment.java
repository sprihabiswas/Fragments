package skillbooting.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Spriha Biswas on 2/8/2016.
 */
public class CommunicatingFragment extends Fragment {

    OnButtonClickedListener mCallback;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.communicating_view, container, false);
    }


    // Container Activity must implement this interface
    public interface OnButtonClickedListener {
        public void onButtonClicked(View v);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (OnButtonClickedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnButtonClickedListener");
        }
    }

    public void button_clicked(View v) {
        // Send the event to the host activity
        mCallback.onButtonClicked(v);
    }

}
