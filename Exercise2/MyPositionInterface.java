package geometric_configuration;

/**
 *
 * @author Lihan Zhan
 */
public interface MyShapePositionInterface extends MyPositionInterface{
    MyRectangle getMyBoundingBox();
    boolean doOverlap();
}
