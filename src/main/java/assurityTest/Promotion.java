package assurityTest;

import com.google.gson.annotations.SerializedName;

class Promotion {

    @SerializedName("Id")
    private int id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description")
    private String description;
    @SerializedName("Price")
    private double price;
    @SerializedName("MinimumPhotoCount")
    private int minimumPhotoCount;

}
