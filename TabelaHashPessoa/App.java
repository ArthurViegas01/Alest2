public class TabelaHashApp {

    public static void main(String[] args) {

        TabelaHash th = new TabelaHash();

        Pessoa p1 = new Pessoa(204123, "Leonardo");
        Pessoa p2 = new Pessoa(123456, "Roberto");

        th.add(p1);
        th.get(204123);

        th.add(p2);

        Pessoa p3 = new Pessoa(654321, "Giovani");
        th.add(p3);

        Pessoa p4 = new Pessoa(555666, "Carla");
        th.add(p4);

        for(int i = 0;i<20;i++){
            System.out.println(th);
        }

    }



}
