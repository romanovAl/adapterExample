package adaptersexample.romanoff.com.adaptersexample;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;

public class DetailsActivity extends AppCompatActivity {
  private androidx.appcompat.widget.Toolbar toolbar;
  private Food food;
  private ImageView foodImage;
  private TextView foodName;
  private TextView foodQuantity;
  private TextView foodKiloCalories;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    food = (Food) getIntent().getSerializableExtra("foodObject");

    foodImage = findViewById(R.id.detailsFoodImage);
    foodName = findViewById(R.id.detailsFoodName);
    foodQuantity = findViewById(R.id.detailsFoodQuantity);
    foodKiloCalories = findViewById(R.id.detailsFoodKcal);

    foodImage.setImageResource(food.getFoodImageResId());
    foodName.setText(food.getFoodName());
    foodQuantity.setText(food.getFoodQuantity());
    foodKiloCalories.setText(food.getKiloCalories());
  }
}
