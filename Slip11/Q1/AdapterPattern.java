interface BeatModel {
    void beat();
}

class HeartModel {
    void heartBeat() {
        System.out.println("Heart is beating...");
    }
}

class HeartAdapter implements BeatModel {
    private HeartModel heartModel;

    public HeartAdapter(HeartModel heartModel) {
        this.heartModel = heartModel;
    }

    @Override
    public void beat() {
        heartModel.heartBeat();
    }
}

public class AdapterPattern {
    public static void main(String[] args) {
        // Using the HeartModel with the Adapter
        HeartModel heartModel = new HeartModel();
        BeatModel beatModel = new HeartAdapter(heartModel);

        // Now, the client code can use BeatModel interface
        beatModel.beat();
    }
}
