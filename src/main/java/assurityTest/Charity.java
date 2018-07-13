package assurityTest;

import com.google.gson.annotations.SerializedName;

class Charity {

    @SerializedName("CharityType")
    private int charityType;
    @SerializedName("ImageSource")
    private String imageSource;
    @SerializedName("Description")
    private String description;
    @SerializedName("Tagline")
    private String tagline;

}
