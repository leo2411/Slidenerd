package com.example.leo.iconlistview;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView l;
    String[] memeTitles;
    String[] memeDescription;
    int[] images = {R.drawable.auto,R.drawable.ikona,R.drawable.kamera,R.drawable.laptop,R.drawable.mpa,
                        R.drawable.oblak,R.drawable.pare,R.drawable.povezi,R.drawable.strijelice,R.drawable.svijet};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        memeTitles = res.getStringArray(R.array.titles);
        memeDescription = res.getStringArray(R.array.description);

        l= (ListView) findViewById(R.id.ListView);
        LeoAdapter adapter = new LeoAdapter(this,memeTitles,images,memeDescription);
        l.setAdapter(adapter);

    }

    class LeoAdapter extends ArrayAdapter<String>
    {
        Context context;
        int [] images;
        String[] titleArray;
        String [] descArray;

        LeoAdapter(Context c,String[] titles, int imgs[],String[] desc)
        {
            super(c,R.layout.single_row,R.id.textView2,titles);
            this.context=c;
            this.images=imgs;
            this.titleArray=titles;
            this.descArray=desc;

        }

        class MyViewHolder
        {
            ImageView myImage;
            TextView myTitle;
            TextView myDescription;

            MyViewHolder(View v)
            {
                myImage = (ImageView) v.findViewById(R.id.imageView);
                myTitle = (TextView) v.findViewById(R.id.textView2);
                myDescription = (TextView) v.findViewById(R.id.textView3);
            }

        }



        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row = convertView;
            MyViewHolder holder = null;

            if(row==null)
            {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.single_row, parent, false);
                holder = new MyViewHolder(row);
                row.setTag(holder);
            }
            else
            {
                holder = (MyViewHolder) row.getTag();
            }


            holder.myImage.setImageResource(images[position]);
            holder.myTitle.setText(titleArray[position]);
            holder.myDescription.setText(descArray[position]);

            return row;
        }   
    }

}
