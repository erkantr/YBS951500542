package tr.edu.medipol.ybs95150054;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int photos[];
    String[] places;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] photos, String[] places) {
        this.context = context;
        this.photos = photos;
        this.places = places;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return photos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.custom_spinner_items, null);
        ImageView icon = convertView.findViewById(R.id.imageView);
        TextView names = convertView.findViewById(R.id.textView);
        icon.setImageResource(photos[position]);
        names.setText(places[position]);
        return convertView;
    }
}
