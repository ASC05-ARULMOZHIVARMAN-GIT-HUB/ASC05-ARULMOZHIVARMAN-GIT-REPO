package lab4;

class MediaFile {
    String name;

    public MediaFile(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Media Name: " + name);
    }
}

class MusicFile extends MediaFile implements Downloadable {
    public MusicFile(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing music: " + name);
    }

    @Override
    public void download() {
        System.out.println("Downloading music: " + name);
    }
}
