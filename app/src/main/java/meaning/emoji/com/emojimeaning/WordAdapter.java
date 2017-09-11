package meaning.emoji.com.emojimeaning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by paparikh on 7/4/17.
 */

public class WordAdapter extends ArrayAdapter<String> {


    private final Context context;
    private final String[] values;

    public WordAdapter(Context context, String[] values) {
        super(context, R.layout.list_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);

        // Change icon based on name
        String s = values[position];

        System.out.println(s);

        if (s.equals("Smileys & People")) {
            imageView.setImageResource(R.drawable.smileys_people);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_smileys_people));
        } else if (s.equals("Animals & Nature")) {
            imageView.setImageResource(R.drawable.animals_nature);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_animals_nature));
        } else if (s.equals("Food & Drink")) {
            imageView.setImageResource(R.drawable.food_drink);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_food_drink));
        } else if (s.equals("Activity")){
            imageView.setImageResource(R.drawable.activity);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_activities));
        } else if (s.equals("Travel & Places")) {
            imageView.setImageResource(R.drawable.travel_places);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_travel_places));
        } else if (s.equals("Objects")) {
            imageView.setImageResource(R.drawable.objects);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_objects));
        } else if (s.equals("Symbols")){
            imageView.setImageResource(R.drawable.symbols);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_symbols));
        } else if (s.equals("Flags")){
            imageView.setImageResource(R.drawable.flags);
            textView.setBackgroundColor(context.getResources().getColor(R.color.category_flags));
        }

        return rowView;
    }
}