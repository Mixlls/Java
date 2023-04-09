package Homework1;
//nattawat tipma
//6509618150
//15
import java.lang.Math;
public class Can {
    private float Radius;
    private float Volume;
    private double SideArea;
    private double late;

    public void setArea(float radius) {
        Radius = radius;
    }
    
    public void setVolume(float volume) {
        Volume = volume;
    }

    public double calcilateSideArea(float radius, float volume){
        SideArea = Math.round((2*Math.PI*radius*volume)*100)/100.0;
        return SideArea;
    }
    public double calculateVolume(float radius, float volume){
        late = Math.round(volume*Math.PI*Math.pow(radius,2)*100)/100.0;
        return late;
    }
    
}
