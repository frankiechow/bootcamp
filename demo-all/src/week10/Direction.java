package week10;

public enum Direction {

    EAST, //
    SOUTH, //
    WEST, //
    NORTH, //
    ;

    public void opposite(Direction dir) {
        if(this == dir) {
        } else {
            switch(this) {
                case EAST:
                    if(dir == WEST) System.out.println("its opposite way");
                    break;
                case SOUTH:
                    if(dir == NORTH) System.out.println("its opposite way");
                    break;
                case WEST:
                    if(dir == EAST) System.out.println("its opposite way");
                    break;
                case NORTH:
                    if(dir == SOUTH) System.out.println("its opposite way");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Direction.NORTH.opposite(Direction.SOUTH);
    }
}
