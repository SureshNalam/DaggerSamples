package dagger.example.daggerexample1;

import android.app.Application;

import dagger.example.daggerexample1.component.DaggerDaggerExample1Component;
import dagger.example.daggerexample1.component.DaggerExample1Component;
import dagger.example.daggerexample1.module.DaggerExample1Module;

/**
 * Created by suri on 24/10/17.
 */

public class DaggerApplication extends Application {

    public static DaggerExample1Component daggerExample1Component;

    @Override
    public void onCreate() {
        super.onCreate();

        daggerExample1Component = DaggerDaggerExample1Component.builder().daggerExample1Module(new DaggerExample1Module(this)).build();
    }

    public DaggerExample1Component getDaggerExample1Component() {
        return daggerExample1Component;
    }
}
