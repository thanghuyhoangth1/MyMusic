package online.music.com.mymusic.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        initComps(savedInstanceState);
        addEvent();
    }

    protected abstract void addEvent();

    public abstract void initComps(Bundle savedInstanceState);

    public abstract int getLayoutResource();
}
