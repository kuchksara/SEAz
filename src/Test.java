class Test
{
    public static void main(String[] args)
    {
        testDiv();
    }

    private static void testDiv()
    {
        int a = 20;
        int b = 4;
        int expected = 5;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
