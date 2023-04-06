import java.util.Locale;

public class Polygon {
    private Point[] points;
    public Polygon(int numberOfPoints){
        Point[] temp = new Point[numberOfPoints];
        points = temp;
    }
    public void changePoint(int index,Point point){
        this.points[index]=point;
    }
    public void changePoint(Point[]points){
        this.points=points;

    }
    public String toSvg(){
        String pointsString="";
        for(var point : points){
            pointsString += point.x + "," + point.y + " ";
        }
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s />",pointsString);
    }

}
