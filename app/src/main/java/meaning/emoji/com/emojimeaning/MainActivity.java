package meaning.emoji.com.emojimeaning;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


public class MainActivity extends ListActivity {

    static final String[] categories =
            new String[]{"Smileys & People", "Animals & Nature", "Food & Drink", "Activity", "Travel & Places", "Objects",
                    "Symbols", "Flags"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new WordAdapter(this, categories));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //get selected items
//        String selectedValue = (String) getListAdapter().getItem(position);
//        Toast.makeText(this, selectedValue, Toast.LENGTH_SHORT).show();
        Intent i;

        if (categories[position] == "Smileys & People") {
            i = new Intent(MainActivity.this, SmileyPeopleActivity.class);
            startActivity(i);
        } else if (categories[position] == "Animals & Nature") {
            i = new Intent(MainActivity.this, AnimalsNatureActivity.class);
            startActivity(i);
        } else if (categories[position] == "Food & Drink") {
            i = new Intent(MainActivity.this, FoodDrinkActivity.class);
            startActivity(i);
        } else if (categories[position] == "Activity") {
            i = new Intent(MainActivity.this, ActivitiesActivity.class);
            startActivity(i);
        } else if (categories[position] == "Travel & Places") {
            i = new Intent(MainActivity.this, TravelPlacesActivity.class);
            startActivity(i);
        } else if (categories[position] == "Objects") {
            i = new Intent(MainActivity.this, ObjectsActivity.class);
            startActivity(i);
        } else if (categories[position] == "Symbols") {
            i = new Intent(MainActivity.this, SymbolsActivity.class);
            startActivity(i);
        } else if (categories[position] == "Flags") {
            i = new Intent(MainActivity.this, FlagsActivity.class);
            startActivity(i);
        }
        super.onListItemClick(l, v, position, id);
    }
}

