package adaptersexample.romanoff.com.adaptersexample;

import java.io.Serializable;

public class Food implements Serializable {

  private int foodImageResId;
  private String foodName;
  private String foodQuantity;
  private String kiloCalories;

  public Food(int foodImageResId, String foodName, String foodQuantity, String kiloCalories) {
    this.foodImageResId = foodImageResId;
    this.foodName = foodName;
    this.foodQuantity = foodQuantity;
    this.kiloCalories = kiloCalories;
  }

  public int getFoodImageResId() {
    return foodImageResId;
  }

  public void setFoodImageResId(int foodImageResId) {
    this.foodImageResId = foodImageResId;
  }

  public String getFoodName() {
    return foodName;
  }

  public void setFoodName(String foodName) {
    this.foodName = foodName;
  }

  public String getFoodQuantity() {
    return foodQuantity;
  }

  public void setFoodQuantity(String foodQuantity) {
    this.foodQuantity = foodQuantity;
  }

  public String getKiloCalories() {
    return kiloCalories;
  }

  public void setKiloCalories(String kiloCalories) {
    this.kiloCalories = kiloCalories;
  }
}
