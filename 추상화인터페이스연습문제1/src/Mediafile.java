
 public abstract class Mediafile {
   private String filename;

   
    public Mediafile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }


    public void getInfo() {
        System.out.println("파일명: " + filename);
    }

    public abstract void play();
}


class AudioFile extends Mediafile {
    public AudioFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("오디오 파일을 재생합니다.");
    }
}

class VideoFile extends Mediafile {
    public VideoFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("비디오 파일을 재생합니다.");
    }

   
    public void showSubtitles() {
        System.out.println("자막: 영화 자막을 표시합니다.");
    }
}


class ImageFile extends Mediafile {
    public  ImageFile(String filename) {
        super(filename);
    }

    @Override
    public void play() {
        System.out.println("이미지 파일을 표시합니다.");
    }
}








