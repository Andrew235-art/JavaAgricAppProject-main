import java.util.ArrayList;
import java.util.List;

public class FarmerService {
    private List<Crop> crops = new ArrayList<>();

    public void addCrop(Crop crop) {
        crops.add(crop);
    }

    public List<Crop> getCrops() {
        return crops;
    }
}