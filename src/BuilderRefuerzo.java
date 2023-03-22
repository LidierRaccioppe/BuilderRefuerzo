public class BuilderRefuerzo {

        protected Refuerzo _refuerzo;

        public Refuerzo build() {
                return this._refuerzo;
        }

        // create the refuerzo to config it later
        public BuilderRefuerzo() {
                _refuerzo = new Refuerzo();
        }

        // function to change the refuerzo
        public BuilderRefuerzo setTypeOfBread(int typeOfBread) {
                _refuerzo.setTypeOfBread(typeOfBread);
                return this;
        }

        public BuilderRefuerzo setTotalIndividualServingSize(int totalIndividualServingSize) {
                _refuerzo.setTypeOfBread(totalIndividualServingSize);
                return this;
        }

        public BuilderRefuerzo setAmount(int amount) {
                _refuerzo.setAmount(amount);
                return this;
        }

        public BuilderRefuerzo setTomato(boolean tomato) {
                _refuerzo.setTomato(tomato);
                return this;
        }

        public BuilderRefuerzo setOlives(boolean olives){
                _refuerzo.setOlives(olives);
                return this;
        }

        public BuilderRefuerzo setToasted(boolean toasted) {
                _refuerzo.setToasted(toasted);
                return this;
        }
        public BuilderRefuerzo setCheese(int cheese) {
                _refuerzo.setCheese(cheese);
                return this;
        }
        public BuilderRefuerzo setHowTake(boolean howTake) {
                _refuerzo.setHowTake(howTake);
                return this;
        }



















}
