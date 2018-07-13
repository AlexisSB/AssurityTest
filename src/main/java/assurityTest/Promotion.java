package assurityTest;

import com.google.gson.annotations.SerializedName;

public class Promotion {

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getMinimumPhotoCount() {
        return minimumPhotoCount;
    }

}
