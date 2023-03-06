package com.aurionpro.test;



import com.aurionpro.model.Blue;
import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Red;
import com.aurionpro.model.Shape;
import com.aurionpro.model.Square;

public class ColorTest {

	public static void main(String[] args) {
Shape sq=new Square(new Blue());
String bluesq=sq.draw();
System.out.println(bluesq);
System.out.println("-------------------------");

Rectangle rec=new Rectangle(new Red());
String redrec=rec.draw();
System.out.println(redrec);

	}

}
