package com.company;

public class line {
    private Point end1;
    private Point end2;

    public line(double x1, double y1, double x2, double y2)
    {
        end1 = new Point(x1,y1);
        end2 = new Point(x2,y2);

    }
    public line()		// default constructor
    {
        end1 = new Point();
        end2 = new Point();
    }

    public double distance()
    {
        double xd = (this.end2.getX()+this.end1.getX());
        double yd = (this.end2.getY()+this.end1.getY());
        double pxd = Math.pow(xd, 2);
        double pyd = Math.pow(yd, 2);
        double LineDistance = Math.sqrt(pxd + pyd);
        return LineDistance;
    }
    public Point midpoint()
    {
        double xmid = (end1.getX()+ end2.getX())/2;
        double ymid = (end1.getY()+ end2.getY())/2;
        Point mid =  new Point(xmid, ymid);
        return mid;
    }

    public boolean sameLength(line otherLine) {


        return false;
    }
    public double slope()
    {
        double m;
        m = (end2.getY()-end1.getY())/(end2.getX()-end1.getX());
        return m;

    }
    public String toString()
    {
        String s = "Line with endpoints " + end1 + " and " + end2;
        return s;
    }

    public boolean parallel(line otherLine)
    {
        double m1 = this.slope();
        double m2 = otherLine.slope();

        //return m1==m2;
        //because of roundoff error, it is not recommended that you compare
        //two floats for equality, but that their difference is small
        return Math.abs(m1-m2)<=.0001;
    }
    public boolean sameLength(line otherLine)
    {
        double m1 = this.distance();
        double m2 = otherLine.distance();

        //return m1==m2;
        //because of roundoff error, it is not recommended that you compare
        //two floats for equality, but that their difference is small
        return Math.abs(m1-m2)<=.0001;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        line l1 = new line(3,6, 4,8);

        double m = l1.slope();
        System.out.println(l1);
        System.out.println("Slope = " + m);

        line l2 = new line(1,2,2,4);
        System.out.println(l2);
        System.out.println("Slope = " + l2.slope());
        System.out.println("Parallel? " + l1.parallel(l2));


        double dist = l1.distance();
        Point p1 = l1.midpoint();

        //System.out.println("distance = " + dist);
        //System.out.println("Midpoint = " + p1);

        //System.out.println("distance = " + l2.distance());
        //System.out.println("Same length? " + l1.sameLength(l2));

    }

}
