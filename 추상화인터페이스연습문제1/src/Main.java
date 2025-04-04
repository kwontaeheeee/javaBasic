public class Main {
    public static void main(String[] args) {
    
        Mediafile[] mediaFiles = new Mediafile[]{
            new AudioFile("music.mp3"),
            new VideoFile("movie.mp4"),
            new ImageFile("picture.jpg")
        };

        for (Mediafile mediaFile : mediaFiles) {
            mediaFile.getInfo();
            mediaFile.play();

            if (mediaFile instanceof VideoFile) {
                VideoFile videoFile = (VideoFile) mediaFile;
                videoFile.showSubtitles();
            }
        }
    }
}