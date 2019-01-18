package adaptersexample.romanoff.com.adaptersexample;

import android.content.Context;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

public class FoodRecycleAdapter extends RecyclerView.Adapter<FoodRecycleAdapter.FoodVH> {
  private List<Food> foodList;

  public FoodRecycleAdapter(List<Food> foodList){
    this.foodList = foodList;
  }

  @NonNull
  @Override
  public FoodRecycleAdapter.FoodVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

    View view = inflater.inflate(R.layout.food_item, viewGroup, false);

    return new FoodVH(view);
  }

  @Override
  public void onBindViewHolder(@NonNull FoodRecycleAdapter.FoodVH foodVH, final int i) {
    final Food food = foodList.get(i);

    foodVH.foodName.setText(food.getFoodName());
    foodVH.foodImage.setImageResource(food.getFoodImageResId());
    foodVH.foodQuantity.setText(food.getFoodQuantity());
    foodVH.foodKiloCalories.setText(food.getKiloCalories());
    foodVH.foodCard.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), DetailsActivity.class);
        intent.putExtra("foodObject", food);
        v.getContext().startActivity(intent);

      }
    });
    foodVH.foodCard.setOnLongClickListener(new OnLongClickListener() {
      @Override
      public boolean onLongClick(View v) {

        foodList.remove(i);
        notifyItemRemoved(i);
        notifyItemChanged(i);

        return true;
      }
    });

  }

  @Override
  public int getItemCount() {
    return foodList.size();
  }

  class FoodVH extends RecyclerView.ViewHolder{

    private ImageView foodImage;
    private TextView foodName;
    private TextView foodQuantity;
    private TextView foodKiloCalories;
    private CardView foodCard;

    public FoodVH(@NonNull final View itemView){
      super(itemView);

      foodImage = itemView.findViewById(R.id.foodImage);
      foodName = itemView.findViewById(R.id.cardFoodName);
      foodQuantity = itemView.findViewById(R.id.cardFoodQuantity);
      foodKiloCalories = itemView.findViewById(R.id.cardFoodKiloCalories);
      foodCard = itemView.findViewById(R.id.foodCard);

//      foodCard.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//      });

    }
  }


}
