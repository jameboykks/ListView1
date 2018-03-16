package com.example.grs.listview1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.grs.listview1.adapter.CustomAdapter;
import com.example.grs.listview1.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    private String number[] = {"65 items","17 items","5 items","33 items","18 items","43 items"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.lv_contact);
        final ArrayList<Contact> arrayList = new ArrayList<>();

        final Contact contact1 = new Contact("Vegetables","65 items");
        Contact contact2= new Contact("Fruits","17 items");
        Contact contact3 = new Contact("Flower Buds","5 items");
        Contact contact4 = new Contact("Legumes","33 items");
        Contact contact5 = new Contact("Bulbs","18 items");
        Contact contact6 = new Contact("Turbers","43 items");
        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Có "+ number[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
