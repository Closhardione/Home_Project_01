import java.util.Locale;

public class Polygon {
    private Point[] points;
    private Style style;
    public Polygon(int numberOfPoints,Style style){
        points = new Point[numberOfPoints];
        this.style=style;
    }
    public void changePoint(int index,Point point){
        this.points[index]=point;
    }
    public void changePoint(Point[]points){
        this.points=points;

    }
    public Point getMaxCords(){
        Point maxPoint = new Point(0,0);
        for(var p :this.points){
            if(p.x>maxPoint.x)
                maxPoint.x=p.x;
            if(p.y>maxPoint.y){
                maxPoint.y=p.y;
            }
        }
        return maxPoint;
    }
    public String toSvg(){
        String pointsString="";
        for(var point : points) {
            pointsString += point.x + "," + point.y + " ";
        }
        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" %s style=\"%s\"/>",pointsString,this.style.toSvg());
    }

}
