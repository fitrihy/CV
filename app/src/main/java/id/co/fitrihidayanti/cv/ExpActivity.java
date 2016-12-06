package id.co.fitrihidayanti.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Fitri Hidayanti on 06/12/2016.
 */
public class ExpActivity extends AppCompatActivity {

    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exp);
        btnBack =(Button)findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
