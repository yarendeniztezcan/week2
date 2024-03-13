package week2;
public class SetInitial{
    public static void main(String[] args) {
        Point p1=new Point(4,5);
        //System.out.println("p1-> " + p1.x() + " " + p1.y());
        System.out.println("p1-> " + p1.getX() + " " + p1.getY());

        p1.setX(20);
        p1.setY(30);
        System.out.println("p1-> " + p1.getX() + " " + p1.getY());

       // Point p2=new Point();
       //System.out.println("p2-> " + p2.x() + " " + p2.y());

       Point p3=new Point(10);
       //System.out.println("p3-> " + p3.x() + " " + p3.y());

       System.out.println(p3.toString());
       System.out.println(p3.print());
       System.out.println(p3);

       SetInitial denemeObje=new SetInitial ();
       int toplam = denemeObje.topla(4,5);
       System.out.println(toplam);
    }

    public int topla (int sayi1, int sayi2){

        return sayi1+sayi2;}
    }

