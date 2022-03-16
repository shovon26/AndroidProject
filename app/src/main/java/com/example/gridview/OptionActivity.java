package com.example.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OptionActivity extends AppCompatActivity {

    private Button admission;
    private Button info;
    private String versity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        admission=findViewById(R.id.admissionButtonId);
        info=findViewById(R.id.infoButtonId);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){

            versity=bundle.getString("versityName");

            admission.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(OptionActivity.this,WebActivity.class);
                    intent.putExtra("option",versity+"Admission");
                    startActivity(intent);
                }
            });


            info.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(OptionActivity.this,WebActivity.class);
                    intent.putExtra("option",versity+"INFO");
                    startActivity(intent);
                }
            });


        }
    }
}
