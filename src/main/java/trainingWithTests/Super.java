package trainingWithTests;

class Super
{
    public Integer getLength()
    {
        return 4;
    }
}

 class Sub extends Super
{
    public Integer getLength()
    {
        return 5;
    }

    public static void main(String[] args)
    {
        Super sooper = new Super();
        Sub sub = new Sub();
        System.out.println(
                sooper.getLength().toString() + "," + sub.getLength().toString() );
    }
}