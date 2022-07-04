package tr.edu.medipol.ybs95150054;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        final ListView listView = findViewById(R.id.myCourses);
        this.setTitle("Dönem Dersleri");

        final ArrayList<String> myCourses = new ArrayList<>();
        myCourses.add("Ekonominin Temelleri");
        myCourses.add("Mobil Programlama");
        myCourses.add("Lojistik Yönetimi");
        myCourses.add("Bilişim Sistemleri ve E-İşletme");
        myCourses.add("Veri Madenciliği ve İş Zekası");
        myCourses.add("Müşteri İlişkileri Yönetimi");
        myCourses.add("Girişimcilik");
        myCourses.add("Bilişim Projeleri Yönetimi");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myCourses) {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View view = super.getView(position, convertView, parent);


                TextView tv = view.findViewById(android.R.id.text1);


                tv.setTextColor(Color.WHITE);


                return view;
            }
        };

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(CoursesActivity.this, listView.getAdapter().getItem(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });


        listView.setAdapter(arrayAdapter);
    }
}
