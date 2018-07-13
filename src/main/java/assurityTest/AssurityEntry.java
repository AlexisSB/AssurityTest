package assurityTest;

public class AssurityEntry {

    private int categoryID;
    private String name;
    private String path;
    private boolean canListAuctions;
    private boolean canListClassifieds;
    private boolean canRelist;
    private int defaultDuration;
    private int[] allowedDurations;
    private Fee[] fees; // May have to make 2d array or its own object
    private int freePhotoCount;
    private int maximumPhotoCount;
    private Charity[] charities;
    private Promotion[] promotions;
    private int[] embeddedContentOptions; // Not sure of actual type
    private int maximumTitleLength;
    private int areaOfBusiness;
    private int defaultRelistDuration;
    private boolean canHaveSecondCategory;
    private boolean canBeSecondCategory;


}
