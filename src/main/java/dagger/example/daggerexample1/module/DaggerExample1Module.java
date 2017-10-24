package dagger.example.daggerexample1.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;
import dagger.example.daggerexample1.DaggerPreseneter.DaggerPresenter;
import dagger.example.daggerexample1.DaggerPreseneter.DaggerPresenterImplementation;

/**
 * Created by suri on 24/10/17.
 */

@Module
public class DaggerExample1Module {

    Context applicationContext;

    public DaggerExample1Module(Application application){
        applicationContext = application;
    }


    @Provides
    SharedPreferences providesSharedPreferences(){
        return PreferenceManager.getDefaultSharedPreferences(applicationContext);
    }

    @Provides
    DaggerPresenter providesDaggerPresenter(){
        return new DaggerPresenterImplementation(providesSharedPreferences());
    }

}
