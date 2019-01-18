package adaptersexample.romanoff.com.adaptersexample;

import android.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  private androidx.appcompat.widget.Toolbar toolbar;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    RecyclerView foodRecycler = findViewById(R.id.foodRecycler);

    ArrayList<Food> foodList = new ArrayList<>();

    foodList.add(new Food(R.drawable.barbecue,"Barbecue", "10","297 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.cake,"Cake", "5", "246 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.tomato, "Tomato", "20", "20 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.burger, "Burger", "12", "263 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedonions, "Fried onions", "60", "239 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.wings, "Chicken wings", "50", "261 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedpotato, "Fried potato", "420", "192 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedonions, "Fried onions", "60", "239 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.wings, "Chicken wings", "50", "261 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.tomato, "Tomato", "20", "20 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.burger, "Burger", "12", "263 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.barbecue,"Barbecue", "10","297 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.barbecue,"Barbecue", "10","297 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.cake,"Cake", "5", "246 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.tomato, "Tomato", "20", "20 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.burger, "Burger", "12", "263 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedonions, "Fried onions", "60", "239 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.wings, "Chicken wings", "50", "261 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedpotato, "Fried potato", "420", "192 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.friedonions, "Fried onions", "60", "239 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.wings, "Chicken wings", "50", "261 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.tomato, "Tomato", "20", "20 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.burger, "Burger", "12", "263 kcal per 100 grams"));
    foodList.add(new Food(R.drawable.barbecue,"Barbecue", "10","297 kcal per 100 grams"));

    foodRecycler.setLayoutManager(new GridLayoutManager(this, 1));
    foodRecycler.setAdapter(new FoodRecycleAdapter(foodList));

  }
}
