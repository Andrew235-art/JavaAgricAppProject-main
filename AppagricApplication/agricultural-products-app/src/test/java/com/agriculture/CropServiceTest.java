import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CropServiceTest {

    private CropService cropService;

    @BeforeEach
    public void setUp() {
        cropService = new CropService();
        cropService.addCrop(new Crop("Wheat", "Cereal", 3.5));
        cropService.addCrop(new Crop("Corn", "Vegetable", 4.0));
    }

    @Test
    public void testGetCrops() {
        assertEquals(2, cropService.getCrops().size());
    }

    @Test
    public void testFindCropByName() {
        assertNotNull(cropService.findCropByName("Wheat"));
        assertNull(cropService.findCropByName("Rice"));
    }
}