package ColorExo;


abstract class Component {
        protected short intensity;

        public short getIntensity()
        {
            return intensity;
        }

        public void setIntensity(short intensity) {
            this.intensity = intensity;
        }

        public Component(){
            this.intensity = 0;
        }

        public Component(short intensity){
            this.intensity = intensity;
        }

        public abstract String print();

        public static short add(Component a, Component b)throws ArithmeticException{
            if (a.getClass() != b.getClass()){
                throw new IllegalArgumentException("ComponentNotCompatibleException");
            }
            short intensityLimit = (short) (a.getIntensity() + b.getIntensity());
            if (intensityLimit > 255 || intensityLimit < 0){
                throw new ArithmeticException("ComponentOutOfRangeException");
            }
            else {
                return intensityLimit;
            }
        }

        public static short substract(Component a, Component b)throws ArithmeticException{
            if (a.getClass() != b.getClass()){
                throw new IllegalArgumentException("ComponentNotCompatibleException");
            }
            short intensityLimit = (short) (a.getIntensity() - b.getIntensity());
            if (intensityLimit > 255 || intensityLimit < 0){
                throw new ArithmeticException("ComponentOutOfRangeException");
            }
            else {
                return intensityLimit;
            }
        }

    }