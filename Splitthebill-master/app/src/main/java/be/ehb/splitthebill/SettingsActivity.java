package be.ehb.splitthebill;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import be.ehb.splitthebill.fragment.SettingsFragment;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);



        getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, SettingsFragment.newInstance()).commit();
    }
}
