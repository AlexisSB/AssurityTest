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

    public double getBundle() {
        return bundle;
    }

    public double getEndDate() {
        return endDate;
    }

    public double getFeature() {
        return feature;
    }

    public double getGallery() {
        return gallery;
    }

    public double getReserve() {
        return reserve;
    }

    public double getSubtitle() {
        return subtitle;
    }

    public double getTenDays() {
        return tenDays;
    }

    public double getWithdrawal() {
        return withdrawal;
    }

    public double getHighVolume() {
        return highVolume;
    }

    public double getMaximumSuccessFee() {
        return maximumSuccessFee;
    }

    public FeeTier[] getSuccessFeeTiers() {
        return successFeeTiers;
    }

    public double getSecondCategroy() {
        return secondCategroy;
    }

}
