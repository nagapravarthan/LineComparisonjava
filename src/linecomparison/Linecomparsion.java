package linecomparison;

public class Linecomparsion {

	public static void main(String[] args) {
		int x1,x2,y1,y2,p1,p2,q1,q2;
	    double dis1, dis2;
	    x1=1;y1=1;x2=4;y2=4;
	    p1=1;q1=1;p2=4;q2=4;
	    dis1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	    dis2=Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
            System.out.println("Length of line of coordinates"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis1);
            System.out.println("Length of line of coordinates"+"("+p1+","+q1+"),"+"("+p2+","+q2+")===>"+dis2);
	if (dis1 == dis2) 
	{
		System.out.println("Both lines are equale");
	}
	else
	{
		System.out.println("Both lines are not equale");	
	}
		

	}

}
