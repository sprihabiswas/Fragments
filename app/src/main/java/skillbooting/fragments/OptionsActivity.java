package skillbooting.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Spriha Biswas on 2/8/2016.
 */
public class OptionsActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }

    //calls the activity which has fragments mentioned in the xml and is customized for landscape mode
    public void static_fragment(View v)
    {
        intent =new Intent(this, MainActivityStatic.class);
        startActivity(intent);
    }

    //calls the activity which has fragments being put dynamically
    public void dynamic_fragment(View v)
    {
        intent =new Intent(this, MainActivityDynamic.class);
        startActivity(intent);
    }

    //calls the activity which has fragment communicating with parent activity
    public void communicating_fragment(View v)
    {
        intent =new Intent(this, MainActivityCommunicating.class);
        startActivity(intent);
    }

}