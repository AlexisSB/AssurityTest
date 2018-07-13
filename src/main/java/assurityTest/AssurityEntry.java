package assurityTest;

import com.google.gson.annotations.SerializedName;

public class AssurityEntry {

    @SerializedName("CategoryId")
    private int categoryID;
    @SerializedName("Name")
    private String name;
    @SerializedName("Path")
    private String path;
    @SerializedName("CanListAuctions")
    private boolean canListAuctions;
    @SerializedName("CanListClassifieds")
    private boolean canListClassifieds;
    @SerializedName("CanRelist")
    private boolean canRelist;
    @SerializedName("DefaultDuration")
    private int defaultDuration;
    @SerializedName("AllowedDurations")
    private int[] allowedDurations;
    @SerializedName("Fees")
    private Fees fees; // May have to make 2d array or its own object
    @SerializedName("FreePhotoCount")
    private int freePhotoCount;
    @SerializedName("MaximumPhotoCount")
    private int maximumPhotoCount;
    @SerializedName("Charities")
    private Charity[] charities;
    @SerializedName("Promotions")
    private Promotion[] promotions;
    @SerializedName("EmbeddedContentOptions")
    private int[] embeddedContentOptions; // Not sure of actual type
    @SerializedName("MaximumTitleLength")
    private int maximumTitleLength;
    @SerializedName("AreaOfBusiness")
    private int areaOfBusiness;
    @SerializedName("DefaultRelistDuration")
    private int defaultRelistDuration;
    @SerializedName("CanHaveSecondCategory")
    private boolean canHaveSecondCategory;
    @SerializedName("CanBeSecondCategory")
    private boolean canBeSecondCategory;




}
