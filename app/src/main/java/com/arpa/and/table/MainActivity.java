package com.arpa.and.table;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arpa.and.ui.table.CustomRecyclerView;
import com.arpa.and.ui.table.TitleAdapter;
import com.arpa.and.ui.table.VAdapter;

public class MainActivity extends AppCompatActivity {


    private boolean isRecyclerGroupTouch = false;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CustomRecyclerView listView = (CustomRecyclerView) findViewById(R.id.v_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listView.setLayoutManager(linearLayoutManager);
        listView.setAdapter(new VAdapter(listView));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.h_list);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new TitleAdapter(this));
        listView.addRecyclerView(recyclerView);
        recyclerView.setTag(CustomRecyclerView.HEADER_TAG);
        listView.setTouchEventLister(isTouch -> isRecyclerGroupTouch = isTouch);
        recyclerView.setOnTouchListener((view, motionEvent) -> {
            if (!isRecyclerGroupTouch)
                listView.onTouch(motionEvent, true);
            Log.w("motionEvent", motionEvent.getAction() + "");
            if (MotionEvent.ACTION_UP == motionEvent.getAction()) {
                isRecyclerGroupTouch = false;
            }
            return false;
        });
        listView.setSelectItemListener((x, y) -> {
            //选择的那个单元格。
        });
    }
}
