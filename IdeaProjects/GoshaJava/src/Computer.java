public class Computer {
    public class Procesor {
        private boolean isTrue = false;

        public void start() {
            isTrue = true;
        }
        public void shutdown() {
        }

    }

    public class RAM {
        private boolean isTrue = false;

        public void start() {
            isTrue = true;
            System.out.println(isTrue);
        }
        public void shutdown() {
            isTrue = false;
            System.out.println(isTrue);
        }
    }

    Procesor i7 = new Procesor();
    RAM transfer = new RAM();
}
