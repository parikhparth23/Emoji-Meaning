package meaning.emoji.com.emojimeaning;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Alien Monster", R.drawable.alien_monster));
        words.add(new Word("Man in Business Suit Levitating", R.drawable.man_in_business_suit_levitating));
        words.add(new Word("Horse Racing",R.drawable.horse_racing));
        words.add(new Word("Skier",R.drawable.skier));
        words.add(new Word("Snowboarder",R.drawable.snowboarder));
        words.add(new Word("Person Golfing",R.drawable.golfer));
        words.add(new Word("Man Golfing",R.drawable.man_golfing));
        words.add(new Word("Woman Golfing",R.drawable.woman_golfing));
        words.add(new Word("Person Surfing",R.drawable.surfer));
        words.add(new Word("Man Surfing",R.drawable.man_surfing));
        words.add(new Word("Woman Surfing",R.drawable.woman_surfing));
        words.add(new Word("Person Rowing Boat",R.drawable.rowboat));
        words.add(new Word("Man Rowing Boat",R.drawable.man_rowing_boat));
        words.add(new Word("Woman Rowing Boat",R.drawable.woman_rowing_boat));
        words.add(new Word("Person Swimming",R.drawable.swimmer));
        words.add(new Word("Man Swimming",R.drawable.man_swimming));
        words.add(new Word("Woman Swimming",R.drawable.woman_swimming));
        words.add(new Word("Person Bouncing Ball",R.drawable.person_with_ball));
        words.add(new Word("Man Bouncing Ball",R.drawable.man_with_ball));
        words.add(new Word("Woman Bouncing Ball",R.drawable.woman_with_ball));
        words.add(new Word("Person Lifting Weights",R.drawable.weight_lifter));
        words.add(new Word("Man Lifting Weights",R.drawable.man_weight_lifting));
        words.add(new Word("Woman Lifting Weights",R.drawable.woman_weight_lifting));
        words.add(new Word("Person Biking",R.drawable.bicyclist));
        words.add(new Word("Man Biking",R.drawable.man_biking));
        words.add(new Word("Woman Biking",R.drawable.woman_biking));
        words.add(new Word("Person Mountain Biking",R.drawable.mountain_bicyclist));
        words.add(new Word("Man Mountain Biking",R.drawable.man_mountain_biking));
        words.add(new Word("Woman Mountain Biking",R.drawable.woman_mountain_biking));
        words.add(new Word("Person Cartwheeling",R.drawable.person_doing_cartwheel));
        words.add(new Word("Man Cartwheeling",R.drawable.man_doing_cartwheel));
        words.add(new Word("Woman Cartwheeling",R.drawable.woman_doing_cartwheel));
        words.add(new Word("People Wrestling",R.drawable.wrestlers));
        words.add(new Word("Men Wrestling",R.drawable.men_wrestling));
        words.add(new Word("Women Wrestling",R.drawable.women_wrestling));
        words.add(new Word("Person Playing Water Polo",R.drawable.water_polo));
        words.add(new Word("Man Playing Water Polo",R.drawable.man_playing_water_polo));
        words.add(new Word("Woman Playing Water Polo",R.drawable.woman_playing_water_polo));
        words.add(new Word("Person Playing Handball",R.drawable.handball));
        words.add(new Word("Man Playing Handball",R.drawable.man_playing_handball));
        words.add(new Word("Woman Playing Handball",R.drawable.woman_playing_handball));
        words.add(new Word("Person Juggling",R.drawable.juggling));
        words.add(new Word("Man Juggling",R.drawable.man_juggling));
        words.add(new Word("Woman Juggling",R.drawable.woman_juggling));
        words.add(new Word("Circus Tent",R.drawable.circus_tent));
        words.add(new Word("Performing Arts",R.drawable.performing_arts));
        words.add(new Word("Artist Palette",R.drawable.artist_palette));
        words.add(new Word("Slot Machine",R.drawable.slot_machine));
        words.add(new Word("Reminder Ribbon",R.drawable.reminder_ribbon));
        words.add(new Word("Admission Tickets",R.drawable.admission_tickets));
        words.add(new Word("Ticket",R.drawable.ticket));
        words.add(new Word("Military Medal",R.drawable.military_medal));
        words.add(new Word("Trophy",R.drawable.trophy));
        words.add(new Word("Sports Medal",R.drawable.sports_medal));
        words.add(new Word("1st Place Medal",R.drawable.first_place_medal));
        words.add(new Word("2nd Place Medal",R.drawable.second_place_medal));
        words.add(new Word("3rd Place Medal",R.drawable.third_place_medal));
        words.add(new Word("Soccer Ball",R.drawable.soccer_ball));
        words.add(new Word("Baseball",R.drawable.baseball));
        words.add(new Word("Basketball",R.drawable.basketball_and_hoop));
        words.add(new Word("Volleyball",R.drawable.volleyball));
        words.add(new Word("American Football",R.drawable.american_football));
        words.add(new Word("Rugby Football",R.drawable.rugby_football));
        words.add(new Word("Tennis",R.drawable.tennis_racquet_and_ball));
        words.add(new Word("Pool 8 Ball",R.drawable.billiards));
        words.add(new Word("Bowling",R.drawable.bowling));
        words.add(new Word("Cricket",R.drawable.cricket_bat_and_ball));
        words.add(new Word("Field Hockey",R.drawable.field_hockey_stick_and_ball));
        words.add(new Word("Ice Hockey",R.drawable.ice_hockey_stick_and_puck));
        words.add(new Word("Ping Pong",R.drawable.table_tennis_paddle_and_ball));
        words.add(new Word("Badminton",R.drawable.badminton_racquet_and_shuttlecock));
        words.add(new Word("Boxing Glove",R.drawable.boxing_glove));
        words.add(new Word("Martial Arts Uniform",R.drawable.martial_arts_uniform));
        words.add(new Word("Direct Hit",R.drawable.direct_hit));
        words.add(new Word("Flag in Hole",R.drawable.flag_in_hole));
        words.add(new Word("Fishing Pole",R.drawable.fishing_pole_and_fish));
        words.add(new Word("Running Shirt",R.drawable.running_shirt_with_sash));
        words.add(new Word("Skis",R.drawable.ski_and_ski_boot));
        words.add(new Word("Video Game",R.drawable.video_game));
        words.add(new Word("Game Die",R.drawable.game_die));
        words.add(new Word("Musical Score",R.drawable.musical_score));
        words.add(new Word("Microphone",R.drawable.microphone));
        words.add(new Word("Headphone",R.drawable.headphone));
        words.add(new Word("Saxophone",R.drawable.saxophone));
        words.add(new Word("Guitar",R.drawable.guitar));
        words.add(new Word("Musical Keyboard",R.drawable.musical_keyboard));
        words.add(new Word("Trumpet",R.drawable.trumpet));
        words.add(new Word("Violin",R.drawable.violin));
        words.add(new Word("Drum",R.drawable.drum_with_drumsticks));
        words.add(new Word("Clapper Board",R.drawable.clapper_board));
        words.add(new Word("Bow and Arrow",R.drawable.bow_and_arrow));

        MeaningAdapter adapter = new MeaningAdapter(this, words, R.color.category_smileys_people);

        ListView listView = (ListView) findViewById(R.id.meaning_list_1);

        listView.setAdapter(adapter);

    }
}
