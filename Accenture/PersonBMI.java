import java.util.*;
class PersonBMI
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int weight=obj.nextInt();
        float height=obj.nextFloat();
        CheckIBM(weight,height);
    }
    public static void CheckIBM(int weight,float height)
    {
        float BMI=weight/(height*height);

        if(BMI<18)
        {

            System.out.println(0);
        }
        if(BMI>18&&BMI<25)
        {

            System.out.println(1);
        }
        if(BMI>=25&&BMI<30)
        {

            System.out.println(2);
        }
        if(BMI>=30&&BMI<40)
        {

            System.out.println(3);
        }
        if(BMI>=40)
        {

            System.out.println(4);
        }

    }
}
