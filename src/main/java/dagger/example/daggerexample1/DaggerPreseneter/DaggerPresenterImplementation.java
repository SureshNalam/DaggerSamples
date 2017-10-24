package dagger.example.daggerexample1.DaggerPreseneter;

import android.content.SharedPreferences;

/**
 * Created by suri on 24/10/17.
 */

public class DaggerPresenterImplementation implements DaggerPresenter {

    SharedPreferences sharedPreferences;
    private final String USER_DATA = "userdata";

    public DaggerPresenterImplementation(SharedPreferences preferences) {
        sharedPreferences = preferences;
    }

    @Override
    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }


    @Override
    public void saveData(String str) {

        sharedPreferences.edit()
                .putString(USER_DATA, str)
                .apply();

    }

    @Override
    public String retrieveData() {
        return sharedPreferences.getString(USER_DATA, "");
    }


}
