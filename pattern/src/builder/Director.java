package builder;

public class Director {

        public void TypeOfHouse(House type, Builder builder) {
            switch (type) {
                case WITH_NOTHING: break;
                case WITH_GARAGE: builder.buildGarage(); break;
                case WITH_SWIMMING: builder.buildPool(); break;
                case WITH_STATUES: builder.buildStatues(); break;
                case WITH_GARDEN: builder.buildGarden(); break;
            }
        }
}
