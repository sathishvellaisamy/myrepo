package alpha;

public class box {
	int length;
	int height;
	int width;

box(int length,int height,int width) {
	this.length=length;
    this.height=height;
	this.width=width;
}

box two() {
	box temp=new box(2*length,2*height,2*width);
	return temp;
	

}

	
	
   public static void main(String[] args) {
	   
	   box b1=new box(7,6,8);
	   box b2=b1.two();
	   System.out.print(b2.length);
	    

   }
}
