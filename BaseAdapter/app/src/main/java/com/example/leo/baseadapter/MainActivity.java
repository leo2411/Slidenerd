package com.example.leo.baseadapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l= (ListView) findViewById(R.id.ListView);
        l.setAdapter(new LeoAdapter(this));

    }



    class SingleRow
    {
        String title;
        String description;
        int image;

        SingleRow(String title,String description,int image)
        {
            this.description=description;
            this.image=image;
            this.title=title;
        }
    }




    class LeoAdapter extends BaseAdapter
    {
        ArrayList<SingleRow> list;
        Context context;

        LeoAdapter(Context c)
        {
            context =c;
            list = new ArrayList<SingleRow>();

            Resources res = getResources();
            String[] memeTitles = res.getStringArray(R.array.titles);
            String[] memeDescription = res.getStringArray(R.array.description);
            int[] images = {R.drawable.auto,R.drawable.ikona,R.drawable.kamera,R.drawable.laptop,R.drawable.mpa,
                    R.drawable.oblak,R.drawable.pare,R.drawable.povezi,R.drawable.strijelice,R.drawable.svijet};

            for(int i=0;i<10;i++)
            {
                list.add(new SingleRow(memeTitles[i],memeDescription[i],images[i]));
            }

        }
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.single_row, viewGroup, false);

            TextView title = (TextView) row.findViewById(R.id.textView2);
            TextView description = (TextView) row.findViewById(R.id.textView3);
            ImageView image = (ImageView) row.findViewById(R.id.imageView);

            SingleRow temp = list.get(i);
            title.setText(temp.title);
            description.setText(temp.description);
            image.setImageResource(temp.image);

            return row;
        }
    }

}
