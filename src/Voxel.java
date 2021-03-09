/**
 * A 3D point on the plane
 * A voxel can also be a pixel if z=0
 */
public class Voxel {
    private int x;
    private int y;
    private int z;

    public Voxel() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Voxel(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void moveTo(int x_pos, int y_pos, int z_pos) {
        x = x_pos;
        y = y_pos;
        z = z_pos;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }




}
