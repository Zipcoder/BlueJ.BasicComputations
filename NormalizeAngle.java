 
import java.lang.Integer;

public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        return angle % 360;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        return java.lang.Math.floorMod(integer,360);
    }

}
