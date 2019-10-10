package meaning.emoji.com.emojimeaning;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paparikh on 7/9/17.
 */

public class MeaningAdapter extends ArrayAdapter<Word> {


    private int mColorResourceId;

    public MeaningAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_meaning, parent, false);

        }

        Word currentWord = getItem(position);

//        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

//        nameTextView.setText(currentWord.getMiwokTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.smiley_people_meaning);

        numberTextView.setText(currentWord.getDefaultMeaning());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.emoji_icon);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResoureId());
            iconView.setVisibility(View.VISIBLE);
        } else
        {
            iconView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container_meaning);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
