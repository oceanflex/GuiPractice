package firstgui;

/**
 *
 * @author zsummers
 */
public class TempConversion {
    public double fToC(double f){
        double temp = f - 32;
        double c = temp * (5/9);
        return c;
    }
    
    public double cToF(double c){
        double temp = c * (9/5);
        double f = temp + 32;
        return f;
    }
    
}
