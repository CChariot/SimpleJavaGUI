package geometric_configuration;

/**
 *
 * @author Lihan 
 */
public interface MyShapePositionInterface extends MyPositionInterface{
    MyRectangle getMyBoundingBox();
    boolean doOverlap();
}
