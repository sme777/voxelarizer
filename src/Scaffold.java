import java.util.ArrayList;

public class Scaffold {

    int length;
    ArrayList<Voxel> voxelArrayList;

    public Scaffold(Type type, int length) throws IllegalArgumentException {
        if (type == Type.DNA) {
            generateDNAScaffold();
        } else if (type == Type.RNA) {
            generateRNAScaffold();
        } else if (type == Type.ENZYME) {
            generateENZYMEScaffold();
        } else {
            throw new IllegalArgumentException("Unknown Type Parameter");
        }
        this.length = length;
    }

    private void generateDNAScaffold() {
        for (int i = 0; i < length; i++) {

        }
    }

    private void generateRNAScaffold() {
        for (int i = 0; i < length; i++) {

        }
    }

    private void generateENZYMEScaffold() {
        for (int i = 0; i < length; i++) {

        }
    }

}
