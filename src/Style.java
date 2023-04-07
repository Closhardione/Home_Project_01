public class Style {
    public final String fillColor,strokeColor;
    public final Double strokeWidth;

    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }
    public String toSvg(){
        String outString = "";
       if(this.fillColor==null){
           outString+="fill: transparent;";
        }
       else{
           outString+="fill: ";
           outString+=this.fillColor+";";
       }
       if(this.strokeColor==null){
           outString+="stroke: black;";
       }
       else{
           outString+="stroke: "+this.strokeColor+";";
       }
       outString+="stroke-width: ";
       if(this.strokeWidth==null){
        outString+="1px;";
       }
       else{
           outString+=this.strokeWidth.toString()+";";
       }
       return outString;
    }
}
