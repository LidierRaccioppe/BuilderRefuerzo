/**
 * Its the base of a refuerzo
 */
public class Refuerzo {
        private int typeOfBread;
        private int totalIndividualServingSize;
        private int amount;
        private boolean tomato;
        private boolean olives;
        private boolean toasted;
        private int cheese;
        private boolean howTake;


        //type of bread
        public static final int FLUTE = 0;
        public static final int BIMBO = 1;
        public static final int BISCUIT_BREAD = 2;

        //totalIndividualServingSize
        public static final int SMALL = 0;
        public static final int MEDIAN = 1;
        public static final int BIG = 2;
        public static final int EXTRA_BIG = 3;

        //amount
        public static final int SINGLE = 0;
        public static final int DOUBLE = 1;
        public static final int TRIPLE = 2;
        public static final int FAMILIAR = 3;

        //cheese type
        public static final int AMERICAN= 0;
        public static final int BLUE= 1;
        public static final int CHEDDAR = 2;
        public static final int CREAM_CHEESE = 3;
        public static final int GOUDA = 4;
        public static final int MOZZARELLA = 5;


        //how to take the refuerzo
        public static final boolean SHOP = false;
        public static final boolean EATING_OUT = true;

        public Refuerzo() {
        }

        /**
         * Constructor with every param
         * @param typeOfBread what type of bread is it
         * @param totalIndividualServingSize how big is the size of a individual refuerzo
         * @param amount how many refuerzos you want
         * @param tomato if you want a tomato or not
         * @param olives if you want a tomato or not
         * @param toasted if you want the refuerzo to be toasted
         * @param cheese what type of cheese you want
         * @param howTake how the client take it
         */
        public Refuerzo(int typeOfBread, int totalIndividualServingSize, int amount, boolean tomato, boolean olives, boolean toasted, int cheese, boolean howTake) {
                this.typeOfBread = typeOfBread;
                this.totalIndividualServingSize = totalIndividualServingSize;
                this.amount = amount;
                this.tomato = tomato;
                this.olives = olives;
                this.toasted = toasted;
                this.cheese = cheese;
                this.howTake = howTake;
        }

        public int getTypeOfBread() {
                return typeOfBread;
        }

        public void setTypeOfBread(int typeOfBread) {
                this.typeOfBread = typeOfBread;
        }

        public int getTotalIndividualServingSize() {
                return totalIndividualServingSize;
        }

        public void setTotalIndividualServingSize(int totalIndividualServingSize) {
                this.totalIndividualServingSize = totalIndividualServingSize;
        }

        public int getAmount() {
                return amount;
        }

        public void setAmount(int amount) {
                this.amount = amount;
        }

        public boolean isTomato() {
                return tomato;
        }

        public void setTomato(boolean tomato) {
                this.tomato = tomato;
        }

        public boolean isOlives() {
                return olives;
        }

        public void setOlives(boolean olives) {
                this.olives = olives;
        }

        public boolean isToasted() {
                return toasted;
        }

        public void setToasted(boolean toasted) {
                this.toasted = toasted;
        }

        public int getCheese() {
                return cheese;
        }

        public void setCheese(int cheese) {
                this.cheese = cheese;
        }

        public boolean isHowTake() {
                return howTake;
        }

        public void setHowTake(boolean howTake) {
                this.howTake = howTake;
        }

        @Override
        public String toString() {
                return "Refuerzo{" +
                        "typeOfBread=" + typeOfBread +
                        ", totalIndividualServingSize=" + totalIndividualServingSize +
                        ", amount=" + amount +
                        ", tomato=" + tomato +
                        ", olives=" + olives +
                        ", toasted=" + toasted +
                        ", cheese=" + cheese +
                        ", howTake=" + howTake +
                        '}';
        }
}
