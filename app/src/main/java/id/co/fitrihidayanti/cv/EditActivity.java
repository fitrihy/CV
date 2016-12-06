package id.co.fitrihidayanti.cv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Fitri Hidayanti on 06/12/2016.
 */
public class EditActivity  extends AppCompatActivity {
    Button btnBack,btnSave;
    EditText etName, etAddress, etTel, etEmail,etBirth, etSex, etStat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        btnBack =(Button)findViewById(R.id.btn_back);
        btnSave =(Button)findViewById(R.id.btn_save);
        etName =(EditText)findViewById(R.id.et_name);
        etAddress =(EditText)findViewById(R.id.et_address);
        etTel =(EditText)findViewById(R.id.et_tel);
        etEmail =(EditText)findViewById(R.id.et_email);
        etBirth =(EditText)findViewById(R.id.et_birth);
        etSex =(EditText)findViewById(R.id.et_sex);
        etStat =(EditText)findViewById(R.id.et_stat);
        etName.setText(getIntent().getExtras().getString("etName"));
        etAddress.setText(getIntent().getExtras().getString("etAddress"));
        etTel.setText(getIntent().getExtras().getString("etTel"));
        etEmail.setText(getIntent().getExtras().getString("etEmail"));
        etBirth.setText(getIntent().getExtras().getString("etBirth"));
        etSex.setText(getIntent().getExtras().getString("etSex"));
        etStat.setText(getIntent().getExtras().getString("etStat"));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditActivity.this, MainActivity.class);
                intent.putExtra("etName", etName.getText().toString());
                intent.putExtra("etAddress", etAddress.getText().toString());
                intent.putExtra("etTel", etTel.getText().toString());
                intent.putExtra("etEmail", etEmail.getText().toString());
                intent.putExtra("etBirth", etBirth.getText().toString());
                intent.putExtra("etSex", etSex.getText().toString());
                intent.putExtra("etStat", etStat.getText().toString());
                startActivity(intent);
            }
        });
    }
}
