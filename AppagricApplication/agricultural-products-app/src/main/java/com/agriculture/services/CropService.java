import java.util.ArrayList;
import java.util.List;

public class CropService {
    private List<Crop> crops = new ArrayList<>();

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }
    
    public Crop findCropByName(String name) {
        for (Crop crop : crops) {
            if (crop.getName().equalsIgnoreCase(name)) {
                return crop;
            }
        }
        return null; // or throw an exception
    }
}