package practice1;

public class Ball {
	private String color;
	private double dia;

    public Ball(String c, double d){
    	color = c;
    	dia = d;     
    }
    public Ball(String c){
    	color = c;
    	dia = 0;     
    }    
    public Ball(){
    	color = "blue";
    	dia = 0;     
    }
    public void setColor(String color){
    	this.color = color;     
    } 
    public void setDia(double dia){
    	this.dia = dia;     
    } 
    public String getColor() {
    	return color;
    }
    public double getDia() {
    	return dia;
    }
    public String toString() {
    	return ("color of your ball: " + getColor() + "; Diameter of your ball: " + getDia());
    }
}
