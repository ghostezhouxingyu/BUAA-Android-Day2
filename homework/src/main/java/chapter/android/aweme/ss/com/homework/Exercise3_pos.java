package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Exercise3_pos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3_pos);
        int position = getIntent().getIntExtra("position", 0);
        TextView tv = findViewById(R.id.pos_tv);
        tv.setText("来自第" + position + "个联系人的消息");
    }
}
