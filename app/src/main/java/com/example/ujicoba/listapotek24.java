package com.example.ujicoba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listapotek24 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listapotek24);

        List<ItemList> list = new ArrayList<>();
        list.add(new ItemList("Farmindah", "Jalan Soeprapto"));
        list.add(new ItemList("Kimia Farma", "Jalan Veteran"));
        list.add(new ItemList("Tri Putra", "Jalan MT Haryono"));
        list.add(new ItemList("Tirta", "Jalan Jendral Sudirman "));
        list.add(new ItemList("Singganipura", "Jalan Jendral Sudirman "));
        list.add(new ItemList("Singganipura", "Jalan Jendral Sudirman "));
        list.add(new ItemList("Singganipura", "Jalan Jendral Sudirman "));
        list.add(new ItemList("Singganipura", "Jalan Jendral Sudirman "));
        list.add(new ItemList("Singganipura", "Jalan Jendral Sudirman "));

        listView = findViewById(R.id.listapotek24);
        listView.setAdapter(new ListAdapter(list, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(view. getContext(), DesApotek241.class);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(view. getContext(), DesApotek242.class);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(view. getContext(), DesApotek243.class);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(view. getContext(), DesApotek244.class);
                    startActivity(intent);
                }
            }
        });
    }
    private class ItemList{

        String title, description;

        public ItemList( String title, String description) {

            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }
    }

    private class ListAdapter extends BaseAdapter {
        private List<ItemList> list;
        private Context context;

        public ListAdapter(List<ItemList> list, Context context) {
            this.list = list;
            this.context = context;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View converview, ViewGroup parent) {
            View view1 = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);

            TextView txtTitle = view1.findViewById(R.id.txtTittle);
            TextView txtDescription = view1.findViewById(R.id.txtDescription);
            txtTitle.setText(list.get(position).getTitle());
            txtDescription.setText(list.get(position).getDescription());
            return view1;
        }

    }
}