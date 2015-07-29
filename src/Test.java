class Test
{
    public static void main(String[] args)
    {
        testMul();
    }

    private static void testMul()
    {
        int a = 5;
        int b = 6;
        int expected = 30;
        BasicMath bm = new BasicMath();
        int result = bm.mul(a, b);
        if (result == expected)
        {
            System.out.println("mul: OK");
        }
        else
        {
            System.out.println("mul: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
