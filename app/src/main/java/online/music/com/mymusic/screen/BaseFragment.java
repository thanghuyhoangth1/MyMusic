package online.music.com.mymusic.screen;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class BaseFragment extends Fragment implements BaseConstract.View {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutResource(), container, false);
        initComps(view, savedInstanceState);
        addEvent();
        return view;
    }

    protected abstract void addEvent();

    public abstract void initComps(View view, Bundle savedInstanceState);

    public abstract int getLayoutResource();
}
