/**
 * @author Dm.Petrov
 * DATE: 02.02.2022
 */
public abstract class Stage {

        protected int length;
        protected String description;
        public String getDescription() {
            return description;
        }
        public abstract void go(Car c);
    }

