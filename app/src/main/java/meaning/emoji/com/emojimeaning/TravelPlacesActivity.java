package meaning.emoji.com.emojimeaning;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TravelPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Person Rowing Boat", R.drawable.rowboat));
        words.add(new Word("Racing Car",R.drawable.racing_car));
        words.add(new Word("Motorcycle",R.drawable.racing_motorcycle));
        words.add(new Word("Map of Japan",R.drawable.silhouette_of_japan));
        words.add(new Word("Snow-Capped Mountain",R.drawable.snow_capped_mountain));
        words.add(new Word("Mountain",R.drawable.mountain));
        words.add(new Word("Volcano",R.drawable.volcano));
        words.add(new Word("Mount Fuji",R.drawable.mount_fuji));
        words.add(new Word("Camping",R.drawable.camping));
        words.add(new Word("Beach With Umbrella",R.drawable.beach_with_umbrella));
        words.add(new Word("Desert",R.drawable.desert));
        words.add(new Word("Desert Island",R.drawable.desert_island));
        words.add(new Word("National Park",R.drawable.national_park));
        words.add(new Word("Stadium",R.drawable.stadium));
        words.add(new Word("Classical Building",R.drawable.classical_building));
        words.add(new Word("Building Construction",R.drawable.building_construction));
        words.add(new Word("House",R.drawable.house_building));
        words.add(new Word("Cityscape",R.drawable.cityscape));
        words.add(new Word("Derelict House",R.drawable.derelict_house_building));
        words.add(new Word("House With Garden",R.drawable.house_with_garden));
        words.add(new Word("Office Building",R.drawable.office_building));
        words.add(new Word("Japanese Post Office",R.drawable.japanese_post_office));
        words.add(new Word("Post Office",R.drawable.european_post_office));
        words.add(new Word("Hospital",R.drawable.hospital));
        words.add(new Word("Bank",R.drawable.bank));
        words.add(new Word("Hotel",R.drawable.hotel));
        words.add(new Word("Love Hotel",R.drawable.love_hotel));
        words.add(new Word("Convenience Store",R.drawable.convenience_store));
        words.add(new Word("School",R.drawable.school));
        words.add(new Word("Department Store",R.drawable.department_store));
        words.add(new Word("Factory",R.drawable.factory));
        words.add(new Word("Japanese Castle",R.drawable.japanese_castle));
        words.add(new Word("Castle",R.drawable.european_castle));
        words.add(new Word("Wedding",R.drawable.wedding));
        words.add(new Word("Tokyo Tower",R.drawable.tokyo_tower));
        words.add(new Word("Statue of Liberty",R.drawable.statue_of_liberty));
        words.add(new Word("Church",R.drawable.church));
        words.add(new Word("Mosque",R.drawable.mosque));
        words.add(new Word("Synagogue",R.drawable.synagogue));
        words.add(new Word("Shinto Shrine",R.drawable.shinto_shrine));
        words.add(new Word("Kaaba",R.drawable.kaaba));
        words.add(new Word("Fountain",R.drawable.fountain));
        words.add(new Word("Tent",R.drawable.tent));
        words.add(new Word("Foggy",R.drawable.foggy));
        words.add(new Word("Night With Stars",R.drawable.night_with_stars));
        words.add(new Word("Sunrise Over Mountains",R.drawable.sunrise_over_mountains));
        words.add(new Word("Sunrise",R.drawable.sunrise));
        words.add(new Word("Cityscape at Dusk",R.drawable.cityscape_at_dusk));
        words.add(new Word("Sunset",R.drawable.sunset_over_buildings));
        words.add(new Word("Bridge at Night",R.drawable.bridge_at_night));
        words.add(new Word("Milky Way",R.drawable.milky_way));
        words.add(new Word("Carousel Horse",R.drawable.carousel_horse));
        words.add(new Word("Ferris Wheel",R.drawable.ferris_wheel));
        words.add(new Word("Roller Coaster",R.drawable.roller_coaster));
        words.add(new Word("Locomotive",R.drawable.steam_locomotive));
        words.add(new Word("Railway Car",R.drawable.railway_car));
        words.add(new Word("High-Speed Train",R.drawable.high_speed_train));
        words.add(new Word("High-Speed Train With Bullet Nose",R.drawable.high_speed_train_with_bullet_nose));
        words.add(new Word("Train",R.drawable.train));
        words.add(new Word("Metro",R.drawable.metro));
        words.add(new Word("Light Rail",R.drawable.light_rail));
        words.add(new Word("Station",R.drawable.station));
        words.add(new Word("Tram",R.drawable.tram));
        words.add(new Word("Monorail",R.drawable.monorail));
        words.add(new Word("Mountain Railway",R.drawable.mountain_railway));
        words.add(new Word("Tram Car",R.drawable.tram_car));
        words.add(new Word("Bus",R.drawable.bus));
        words.add(new Word("Oncoming Bus",R.drawable.oncoming_bus));
        words.add(new Word("Trolleybus",R.drawable.trolleybus));
        words.add(new Word("Minibus",R.drawable.minibus));
        words.add(new Word("Ambulance",R.drawable.ambulance));
        words.add(new Word("Fire Engine",R.drawable.fire_engine));
        words.add(new Word("Police Car",R.drawable.police_car));
        words.add(new Word("Oncoming Police Car",R.drawable.oncoming_police_car));
        words.add(new Word("Taxi",R.drawable.taxi));
        words.add(new Word("Oncoming Taxi",R.drawable.oncoming_taxi));
        words.add(new Word("Automobile",R.drawable.automobile));
        words.add(new Word("Oncoming Automobile",R.drawable.oncoming_automobile));
        words.add(new Word("Delivery Truck",R.drawable.delivery_truck));
        words.add(new Word("Articulated Lorry",R.drawable.articulated_lorry));
        words.add(new Word("Tractor",R.drawable.tractor));
        words.add(new Word("Bicycle",R.drawable.bicycle));
        words.add(new Word("Kick Scooter",R.drawable.scooter));
        words.add(new Word("Motor Scooter",R.drawable.motor_scooter));
        words.add(new Word("Bus Stop",R.drawable.bus_stop));
        words.add(new Word("Railway Track",R.drawable.railway_track));
        words.add(new Word("Fuel Pump",R.drawable.fuel_pump));
        words.add(new Word("Police Car Light",R.drawable.police_cars_revolving_light));
        words.add(new Word("Horizontal Traffic Light",R.drawable.horizontal_traffic_light));
        words.add(new Word("Vertical Traffic Light",R.drawable.vertical_traffic_light));
        words.add(new Word("Construction",R.drawable.construction_sign));
        words.add(new Word("Anchor",R.drawable.anchor));
        words.add(new Word("Sailboat",R.drawable.sailboat));
        words.add(new Word("Speedboat",R.drawable.speedboat));
        words.add(new Word("Passenger Ship",R.drawable.passenger_ship));
        words.add(new Word("Ferry",R.drawable.ferry));
        words.add(new Word("Motor Boat",R.drawable.motor_boat));
        words.add(new Word("Ship",R.drawable.ship));
        words.add(new Word("Airplane",R.drawable.airplane));
        words.add(new Word("Small Airplane",R.drawable.small_airplane));
        words.add(new Word("Airplane Departure",R.drawable.airplane_departure));
        words.add(new Word("Airplane Arrival",R.drawable.airplane_arriving));
        words.add(new Word("Seat",R.drawable.seat));
        words.add(new Word("Helicopter",R.drawable.helicopter));
        words.add(new Word("Suspension Railway",R.drawable.suspension_railway));
        words.add(new Word("Mountain Cableway",R.drawable.mountain_cableway));
        words.add(new Word("Aerial Tramway",R.drawable.aerial_tramway));
        words.add(new Word("Satellite",R.drawable.satellite));
        words.add(new Word("Rocket",R.drawable.rocket));
        words.add(new Word("Shooting Star",R.drawable.shooting_star));
        words.add(new Word("Umbrella on Ground",R.drawable.umbrella_on_ground));
        words.add(new Word("Fireworks",R.drawable.fireworks));
        words.add(new Word("Sparkler",R.drawable.firework_sparkler));
        words.add(new Word("Moon Viewing Ceremony",R.drawable.moon_viewing_ceremony));
        words.add(new Word("Yen Banknote",R.drawable.banknote_with_yen_sign));
        words.add(new Word("Dollar Banknote",R.drawable.banknote_with_dollar_sign));
        words.add(new Word("Euro Banknote",R.drawable.banknote_with_euro_sign));
        words.add(new Word("Pound Banknote",R.drawable.banknote_with_pound_sign));
        words.add(new Word("Moai",R.drawable.moyai));
        words.add(new Word("Passport Control",R.drawable.passport_control));
        words.add(new Word("Customs",R.drawable.customs));
        words.add(new Word("Baggage Claim",R.drawable.baggage_claim));
        words.add(new Word("Left Luggage",R.drawable.left_luggage));


        MeaningAdapter adapter = new MeaningAdapter(this, words, R.color.category_smileys_people);

        ListView listView = (ListView) findViewById(R.id.meaning_list_1);

        listView.setAdapter(adapter);

    }
}
