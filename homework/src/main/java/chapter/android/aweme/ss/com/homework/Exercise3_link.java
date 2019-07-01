package chapter.android.aweme.ss.com.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Exercise3_link extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3_link);
        Button btn = findViewById(R.id.link_btn);
        final int id = getIntent().getIntExtra("name", 0);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id == R.id.fans)
                    Toast.makeText(getApplicationContext(), "由粉丝点击而来", Toast.LENGTH_LONG).show();
                else if(id == R.id.like)
                    Toast.makeText(getApplicationContext(), "由赞点击而来", Toast.LENGTH_LONG).show();
                else if(id == R.id.people)
                    Toast.makeText(getApplicationContext(), "由@我的点击而来", Toast.LENGTH_LONG).show();
                else if(id == R.id.comment)
                    Toast.makeText(getApplicationContext(), "由评论点击而来", Toast.LENGTH_LONG).show();
                else
                    Log.e("LinkError", "Unknown resource" );
            }
        });
    }
}
