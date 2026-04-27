package ComplexTasks;

public class Main2 {
    public static void main(String[] args) {
        VideoService service = new VideoService(
                new AviVideoAdapter(),
                new MovVideoAdapter(),
                new WmvVideoAdapter()
        );

        Video video = service.uploadVideo("example.avi");
        Stream stream = service.streamVideo(video.getId());

        System.out.println("Streaming video ID: " + video.getId());
    }
}
