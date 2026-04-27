package ComplexTasks;

public class MovVideoAdapter implements VideoAdapter {
    public Video convertToMp4(String filePath) {
        System.out.println("Converting MOV to MP4...");
        return new Video("mov_converted_id");
    }
}
