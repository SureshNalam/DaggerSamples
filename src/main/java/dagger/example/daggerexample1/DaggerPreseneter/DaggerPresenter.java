package dagger.example.daggerexample1.DaggerPreseneter;

import android.content.SharedPreferences;

/**
 * Created by suri on 24/10/17.
 */

public interface DaggerPresenter {

    SharedPreferences getSharedPreferences();

    void saveData(String str);

    String retrieveData();
}
