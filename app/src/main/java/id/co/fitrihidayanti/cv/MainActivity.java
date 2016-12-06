package id.co.fitrihidayanti.cv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnEdu, btnSkills, btnExperience, btnEdit;
    TextView etName, etAddress, etTel, etEmail,etBirth, etSex, etStat;
    final public static int RC_CHANGE_INPUT=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEdu =(Button)findViewById(R.id.btn_edu);
        btnSkills =(Button)findViewById(R.id.btn_skills);
        btnExperience =(Button)findViewById(R.id.btn_experience);
        btnEdit =(Button)findViewById(R.id.btn_edit);
        etName =(TextView)findViewById(R.id.et_name);
        etAddress =(TextView)findViewById(R.id.et_address);
        etTel =(TextView)findViewById(R.id.et_tel);
        etEmail =(TextView)findViewById(R.id.et_email);
        etBirth =(TextView)findViewById(R.id.et_birth);
        etSex =(TextView)findViewById(R.id.et_sex);
        etStat =(TextView)findViewById(R.id.et_stat);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
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
        btnEdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EduActivity.class);
                startActivity(intent);
            }
        });
        btnSkills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SkillsActivity.class);
                startActivity(intent);
            }
        });
        btnExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ExpActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == RC_CHANGE_INPUT && resultCode==RESULT_OK){
            etName.setText(data.getExtras().getString("etName"));
            etAddress.setText(data.getExtras().getString("etAddress"));
            etTel.setText(data.getExtras().getString("etTel"));
            etEmail.setText(data.getExtras().getString("etEmail"));
            etBirth.setText(data.getExtras().getString("etBirth"));
            etSex.setText(data.getExtras().getString("etSex"));
            etStat.setText(data.getExtras().getString("etStat"));
        }
    }
}
