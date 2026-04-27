package ComplexTasks.StreamingLibrary;

import java.util.HashMap;
import java.util.Map;

public class VideoService {
    private Map<String, VideoAdapter> adapters = new HashMap<>();

    public VideoService(VideoAdapter... adaptersList) {
        adapters.put("avi", adaptersList[0]);
        adapters.put("mov", adaptersList[1]);
        adapters.put("wmv", adaptersList[2]);

    }

    public Video uploadVideo(String filePath) {
        String ext = getExtension(filePath);
        VideoAdapter adapter = adapters.get(ext);

        if (adapter == null) {
            throw new RuntimeException("Unsupported format");
        }

        Video video = adapter.convertToMp4(filePath);
        save(video);
        return video;
    }

    public Stream streamVideo(String videoId) {
        System.out.println("Streaming video in MP4...");
        return new Stream(videoId);
    }

    private void save(Video video) {
        System.out.println("Saved video: " + video.getId());
    }
    private String getExtension(String path) {
        return path.substring(path.lastIndexOf(".") + 1 ).toLowerCase();
    }
}
