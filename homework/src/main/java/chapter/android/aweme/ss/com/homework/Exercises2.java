package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise2);
        final TextView textView = findViewById(R.id.answer);
        final View v = findViewById(R.id.testview0);
        textView.setText("count:" + getViewCount(v));
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int ans = 0;
        if(view instanceof ViewGroup)
        {
            ans++;
            for(int i = 0; i < ((ViewGroup) view).getChildCount(); i++)
            {
                View cur = ((ViewGroup) view).getChildAt(i);
                ans += getViewCount(cur);
            }
        }
        else
            ans = 1;
        return ans;
    }
}
