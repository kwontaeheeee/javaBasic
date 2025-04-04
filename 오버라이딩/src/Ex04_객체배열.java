public class Ex04_객체배열 {
    public static void main(String[] args) {
        Zilot [] z = new Zilot[3];
        z[0] = new Zilot("질럿1호", 150, 100, 120);
        z[1] = new Zilot("질럿2호", 160, 90, 140);
        z[2] = new Zilot("질럿3호", 170, 80, 160);

        for(int i = 0; i <z.length; i++){
            z[i].move("테란본진");
            z[i].attack("테란 본진");
            z[i].swardAttack("테란본진");

            if(i + 1 < z.length){
                System.out.println("---------");
            }
        }
    }
}
