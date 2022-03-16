package com.example.gridview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private TextView textView;
    private ImageView imageView;
    private String[] versityName;

    private int[] icon={R.drawable.du,R.drawable.ru,R.drawable.bau,R.drawable.buet,
            R.drawable.cu,R.drawable.ju,R.drawable.iu,R.drawable.sust,
            R.drawable.ku,R.drawable.bsmmu,R.drawable.bsmrau,R.drawable.hstu
            ,R.drawable.mbstu, R.drawable.pstu,R.drawable.sau,R.drawable.duet,
            R.drawable.ruet,R.drawable.cuet,R.drawable.kuet, R.drawable.jnu,
            R.drawable.jkkniu,R.drawable.cvasu,R.drawable.stau, R.drawable.cou,
            R.drawable.nstu,R.drawable.just,R.drawable.pust, R.drawable.bup,
            R.drawable.bru,R.drawable.butext,R.drawable.bsmrstu,R.drawable.rmstu,
            R.drawable.bsmrmu,R.drawable.rmu,R.drawable.cmu,R.drawable.rub,
            R.drawable.bdu,R.drawable.shu,R.drawable.bsfmstu,R.drawable.smu,
            R.drawable.kau
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.gridViewId);
        textView=findViewById(R.id.sampleTextViewId);
        imageView=findViewById(R.id.sampleImageId);

        versityName=getResources().getStringArray(R.array.versityList);
        CustomAdapter adapter =new CustomAdapter(MainActivity.this,icon,versityName);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(MainActivity.this,OptionActivity.class);

                intent.putExtra("versityName",versityName[position]);
                startActivity(intent);
            }
        });

    }



    @Override
    public void onBackPressed() {

       final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
       builder.setMessage("Do you really want to exit ?");
       builder.setCancelable(true);
       builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {

           }
       });

       builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
               finish();
           }
       });

       AlertDialog alertDialog = builder.create();
       alertDialog.show();

       // super.onBackPressed();

    }


}
