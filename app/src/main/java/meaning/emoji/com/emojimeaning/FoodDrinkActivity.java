package meaning.emoji.com.emojimeaning;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodDrinkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Grapes", R.drawable.grapes));
        words.add(new Word("Melon", R.drawable.melon));
        words.add(new Word("Watermelon",R.drawable.watermelon));
        words.add(new Word("Tangerine",R.drawable.tangerine));
        words.add(new Word("Lemon",R.drawable.lemon));
        words.add(new Word("Banana",R.drawable.banana));
        words.add(new Word("Pineapple",R.drawable.pineapple));
        words.add(new Word("Red Apple",R.drawable.red_apple));
        words.add(new Word("Green Apple",R.drawable.green_apple));
        words.add(new Word("Pear",R.drawable.pear));
        words.add(new Word("Peach",R.drawable.peach));
        words.add(new Word("Cherries",R.drawable.cherries));
        words.add(new Word("Strawberry",R.drawable.strawberry));
        words.add(new Word("Kiwi Fruit",R.drawable.kiwifruit));
        words.add(new Word("Tomato",R.drawable.tomato));
        words.add(new Word("Avocado",R.drawable.avocado));
        words.add(new Word("Eggplant",R.drawable.aubergine));
        words.add(new Word("Potato",R.drawable.potato));
        words.add(new Word("Carrot",R.drawable.carrot));
        words.add(new Word("Ear of Corn",R.drawable.ear_of_maize));
        words.add(new Word("Hot Pepper",R.drawable.hot_pepper));
        words.add(new Word("Cucumber",R.drawable.cucumber));
        words.add(new Word("Mushroom",R.drawable.mushroom));
        words.add(new Word("Peanuts",R.drawable.peanuts));
        words.add(new Word("Chestnut",R.drawable.chestnut));
        words.add(new Word("Bread",R.drawable.bread));
        words.add(new Word("Croissant",R.drawable.croissant));
        words.add(new Word("Baguette Bread",R.drawable.baguette_bread));
        words.add(new Word("Pancakes",R.drawable.pancakes));
        words.add(new Word("Cheese Wedge",R.drawable.cheese_wedge));
        words.add(new Word("Meat on Bone",R.drawable.meat_on_bone));
        words.add(new Word("Poultry Leg",R.drawable.poultry_leg));
        words.add(new Word("Bacon",R.drawable.bacon));
        words.add(new Word("Hamburger",R.drawable.hamburger));
        words.add(new Word("French Fries",R.drawable.french_fries));
        words.add(new Word("Pizza",R.drawable.slice_of_pizza));
        words.add(new Word("Hot Dog",R.drawable.hot_dog));
        words.add(new Word("Taco",R.drawable.taco));
        words.add(new Word("Burrito",R.drawable.burrito));
        words.add(new Word("Cooking",R.drawable.cooking));
        words.add(new Word("Pot of Food",R.drawable.pot_of_food));
        words.add(new Word("Green Salad",R.drawable.green_salad));
        words.add(new Word("Popcorn",R.drawable.popcorn));
        words.add(new Word("Bento Box",R.drawable.bento_box));
        words.add(new Word("Rice Cracker",R.drawable.rice_cracker));
        words.add(new Word("Rice Ball",R.drawable.rice_ball));
        words.add(new Word("Cooked Rice",R.drawable.cooked_rice));
        words.add(new Word("Steaming Bowl",R.drawable.steaming_bowl));
        words.add(new Word("Spaghetti",R.drawable.spaghetti));
        words.add(new Word("Toasted Sweet Potato",R.drawable.roasted_sweet_potato));
        words.add(new Word("Oden",R.drawable.oden));
        words.add(new Word("Sushi",R.drawable.sushi));
        words.add(new Word("Fried Shrimp",R.drawable.fried_shrimp));
        words.add(new Word("Fish Cake with Swirl",R.drawable.fish_cake_with_swirl_design));
        words.add(new Word("Dango",R.drawable.dango));
        words.add(new Word("Soft Ice Cream",R.drawable.soft_ice_cream));
        words.add(new Word("Shaved Ice",R.drawable.shaved_ice));
        words.add(new Word("Ice Cream",R.drawable.ice_cream));
        words.add(new Word("Doughnut",R.drawable.doughnut));
        words.add(new Word("Cookie",R.drawable.cookie));
        words.add(new Word("Birthday Cake",R.drawable.birthday_cake));
        words.add(new Word("Shortcake",R.drawable.shortcake));
        words.add(new Word("Chocolate Bar",R.drawable.chocolate_bar));
        words.add(new Word("Candy",R.drawable.candy));
        words.add(new Word("Lollipop",R.drawable.lollipop));
        words.add(new Word("Custard",R.drawable.custard));
        words.add(new Word("Honey Pot",R.drawable.honey_pot));
        words.add(new Word("Baby Bottle",R.drawable.baby_bottle));
        words.add(new Word("Glass of Milk",R.drawable.glass_of_milk));
        words.add(new Word("Hot Beverage",R.drawable.hot_beverage));
        words.add(new Word("Teacup Without Handle",R.drawable.teacup_without_handle));
        words.add(new Word("Sake",R.drawable.sake_bottle_and_cup));
        words.add(new Word("Bottle With Popping Cork",R.drawable.bottle_with_popping_cork));
        words.add(new Word("Wine Glass",R.drawable.wine_glass));
        words.add(new Word("Cocktail Glass",R.drawable.cocktail_glass));
        words.add(new Word("Tropical Drink",R.drawable.tropical_drink));
        words.add(new Word("Beer Mug",R.drawable.beer_mug));
        words.add(new Word("Clinking Beer Mugs",R.drawable.clinking_beer_mugs));
        words.add(new Word("Clinking Glasses",R.drawable.clinking_glasses));
        words.add(new Word("Tumbler Glasses",R.drawable.tumbler_glass));
        words.add(new Word("Fork and Knife With Plate",R.drawable.fork_and_knife_with_plate));
        words.add(new Word("Fork and Knife",R.drawable.fork_and_knife));
        words.add(new Word("Spoon",R.drawable.spoon));

        MeaningAdapter adapter = new MeaningAdapter(this, words, R.color.category_smileys_people);

        ListView listView = (ListView) findViewById(R.id.meaning_list_1);

        listView.setAdapter(adapter);

    }
}
