package dagger.example.daggerexample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.example.daggerexample1.DaggerPreseneter.DaggerPresenter;

public class MainActivity extends AppCompatActivity {


    @Inject
    DaggerPresenter daggerPresenter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.helloText);

        ((DaggerApplication)getApplication()).getDaggerExample1Component().inject(this);

        daggerPresenter.saveData("Hello Dagger");
        textView.setText(daggerPresenter.retrieveData());


    }
}
