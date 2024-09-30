import java.util.List;

public class CropController {
    private CropService cropService = new CropService();

    public void addCrop(String name, String type, double yield) {
        Crop crop = new Crop(name, type, yield);
        cropService.addCrop(crop);
    }

    public List<Crop> listCrops() {
        return cropService.getCrops();
    }

    public Crop getCropDetails(String name) {
        return cropService.findCropByName(name);
    }
}