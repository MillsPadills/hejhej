public class TesterPrint {
    void run () {

        System.out.println(3);


        int x = 5;
        int y = 5;
        int xY = x + y;
        System.out.println(xY);

        int k = 10;
        k += 5;
        System.out.println(k);

        String text = "Hej med dig";
        System.out.println("The String text is: " + text.length());
        System.out.println(text.indexOf("dig"));

        String mitFornavn = "Emilia ";
        String mitEfternavn = "Padilla";
        System.out.println(mitFornavn.concat(mitEfternavn));

        int u = 5;
        int a = 10;
        System.out.println(Math.max(u, a));

        System.out.println(Math.abs(-14.7));

        System.out.print(Math.random());


        int aa = 10;
        int bb = 9;
        System.out.println(aa > bb);

        boolean jegErSulten = true;
        boolean jegErIkkeSulten = false;
        System.out.println(jegErIkkeSulten);
        System.out.println(jegErSulten);





    }

    public static void main(String[] args) {
        new TesterPrint().run();

    }
}
