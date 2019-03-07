package be.ehb.splitthebill.fragment;

import android.os.Bundle;
import android.support.v7.preference.EditTextPreference;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import be.ehb.splitthebill.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    EditTextPreference tip;

    //om nieuw scherm te creeeren
public static SettingsFragment newInstance(){
    return new SettingsFragment();
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    //opvullen met xml
    @Override
    public void onCreatePreferences(Bundle bundle, String s) {


        addPreferencesFromResource(R.xml.preferences);
    }

}
