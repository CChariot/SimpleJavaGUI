package geometric_configuration;

/**
 *
 * @author Admin
 */
public interface MyShapePositionInterface extends MyPositionInterface{
    MyRectangle getMyBoundingBox();
    boolean doOverlap();
}
