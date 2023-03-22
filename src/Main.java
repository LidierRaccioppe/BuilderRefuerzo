public class Main {
        public static void main(String[] args) {

                //testeo
                Refuerzo refuerzoDefault;
                BuilderRefuerzo obj = new BuilderRefuerzo();
                obj.setHowTake(Refuerzo.SHOP);
                obj.setTomato(true);
                refuerzoDefault = obj.build();
        }
}