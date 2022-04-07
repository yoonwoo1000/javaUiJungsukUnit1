package ch3;

public class OperatorEx32 {
    public static void main(String[] args){
    int x,y,z;
    int abxX, abxY, abxZ;
    int signX, signY, signZ;

    x = 10;
    y = -5;
    z = 0;

    abxX = x>=0 ? x : -x;
    abxY = y>=0 ? y : -y;
    abxZ = z>=0 ? z : -z;

    signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
    signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
    signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');

    System.out.println(" X = " + abxX + " y = "  + abxY + " Z = " + abxZ);


    }
}
