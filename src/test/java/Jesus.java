import org.junit.Test;
import Jesus.CropRow;
import Jesus.Crop;
import Jesus.CornEars;

public class Jesus {
    @Test
    public void testCropRow(){
        CornEars corn1 = new CornEars();
        CornEars corn2 = new CornEars();
        CornEars corn3 = new CornEars();
        CropRow cropRow = new CropRow();
        cropRow.addCrop(corn1);
        cropRow.addCrop(corn2);
        cropRow.addCrop(corn3);
        String expected = "corn1, corn2, corn3";
        String actual = cropRow.toString();

    }

}
