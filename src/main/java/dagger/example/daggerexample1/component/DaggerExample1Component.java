package dagger.example.daggerexample1.component;

import android.content.SharedPreferences;

import dagger.Component;
import dagger.Module;
import dagger.example.daggerexample1.MainActivity;
import dagger.example.daggerexample1.module.DaggerExample1Module;

/**
 * Created by suri on 24/10/17.
 */

@Component(modules = DaggerExample1Module.class)

public interface DaggerExample1Component {

    void inject(MainActivity activity);
}
