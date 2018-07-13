package assurityTest;

import com.google.gson.annotations.SerializedName;

public class Fees {

    @SerializedName("Bundle")
    private double bundle;
    @SerializedName("EndDate")
    private double endDate;
    @SerializedName("Feature")
    private double feature;
    @SerializedName("Gallery")
    private double gallery;
    @SerializedName("Reserve")
    private double reserve;
    @SerializedName("Subtitle")
    private double subtitle;
    @SerializedName("TenDays")
    private double tenDays;
    @SerializedName("Withdrawal")
    private double withdrawal;
    @SerializedName("HighVolume")
    private double highVolume;
    @SerializedName("MaximumSuccessFee")
    private double maximumSuccessFee;
    @SerializedName("SuccessFeeTiers")
    private FeeTier[] successFeeTiers;
    @SerializedName("SecondCategory")
    private double secondCategroy;

}
