package online.music.com.mymusic.screen;

import android.view.View;

import java.util.List;

public interface RecyclerViewItemClickListener<T> {
    void onClick(View itemView, List<T> data);
}
