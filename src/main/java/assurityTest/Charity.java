package assurityTest;

import com.google.gson.annotations.SerializedName;

public class Charity {

    @SerializedName("CharityType")
    private int charityType;
    @SerializedName("ImageSource")
    private String imageSource;
    @SerializedName("Description")
    private String description;
    @SerializedName("Tagline")
    private String tagline;

    public int getCharityType() {
        return charityType;
    }

    public String getImageSource() {
        return imageSource;
    }

    public String getDescription() {
        return description;
    }

    public String getTagline() {
        return tagline;
    }

}
