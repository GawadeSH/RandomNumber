import java.lang.Math;

public class GenerateRandomNumber
{
    public static void main(String[] args)
    {
        System.out.println("Number:-"+Math.random());  //using Math.random() method


    //in specific range
        int a=100;       //minimum range
        int b=200;        //maximum range

        double x = Math.random()*(b-a+1)+a;
        System.out.println("number:-"+x);
    }



}
