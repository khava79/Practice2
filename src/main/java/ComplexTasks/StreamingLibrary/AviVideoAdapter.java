package ComplexTasks.StreamingLibrary;

public class AviVideoAdapter implements VideoAdapter {
    public Video convertToMp4(String filePath) {
        System.out.println("Converting AVI to MP4...");
        return new Video("avi_converted_id");
    }
}
