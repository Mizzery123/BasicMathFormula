package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17000719 on 17/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Mathitem> mathList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Mathitem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        mathList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvProp = rowView.findViewById(R.id.textViewProp);
        TextView tvForm = rowView.findViewById(R.id.textViewForm);
        Mathitem currentItem = mathList.get(position);
        String prop = currentItem.getProperties();
        String form = currentItem.getFormula();
        tvProp.setText(prop);
        tvForm.setText(form);
        return rowView;
    }
}
