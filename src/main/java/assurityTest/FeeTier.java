package assurityTest;

import com.google.gson.annotations.SerializedName;

public class FeeTier {

    @SerializedName("MinimumTierPrice")
    private int minimumTierPrice;
    @SerializedName("PercentageFee")
    private double percentageFee;

    public int getMinimumTierPrice() {
        return minimumTierPrice;
    }

    public double getPercentageFee() {
        return percentageFee;
    }

}
