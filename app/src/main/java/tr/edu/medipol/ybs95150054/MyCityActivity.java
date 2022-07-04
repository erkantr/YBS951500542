package tr.edu.medipol.ybs95150054;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class MyCityActivity extends AppCompatActivity {

    private String[] places = {"Yılanlı Kale", "Seyhan Nehri", "Anavarza Antik Kenti", "Adana Ulu Cami", "Adana Taş Köprü", "Ceyhan Nehri", "Adana Kalesi"};
    private int[] photos = {R.drawable.yilanli_kale1, R.drawable.seyhan_nehri1, R.drawable.anavarza1, R.drawable.ulu_cami1, R.drawable.tas_kopru1,
            R.drawable.ceyhan_nehri1, R.drawable.adana_kalesi1};

    private Spinner spinnerPlaces;

    CustomAdapter adapter;

    private ImageView placeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_city);

        placeImage = findViewById(R.id.placeImage);

        adapter = new CustomAdapter(this, photos, places);
        spinnerPlaces = findViewById(R.id.spinner);
        spinnerPlaces.setAdapter(adapter);
        this.setTitle("Adana");


        spinnerPlaces.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        placeImage.setImageResource(R.drawable.yilanli_kale);
                        break;
                    case 1:
                        placeImage.setImageResource(R.drawable.seyhan_nehri);
                        break;
                    case 2:
                        placeImage.setImageResource(R.drawable.anavarza);
                        break;
                    case 3:
                        placeImage.setImageResource(R.drawable.ulu_cami);
                        break;
                    case 4:
                        placeImage.setImageResource(R.drawable.tas_kopru);
                        break;
                    case 5:
                        placeImage.setImageResource(R.drawable.ceyhan_nehri);
                        break;
                    case 6:
                        placeImage.setImageResource(R.drawable.adana_kalesi);
                        break;
                    default:
                        placeImage.setImageResource(R.drawable.yilanli_kale);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
