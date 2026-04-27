package ComplexTasks;

public class WmvVideoAdapter implements VideoAdapter {
    public Video convertToMp4(String filePath) {
        System.out.println("Converting WMV to MP4...");
        return new Video("wmv_converted_id");
    }
}
