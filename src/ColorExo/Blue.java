package ColorExo;

class Blue extends Component {

    public Blue(){
        super();
    }
    public Blue(short intensity){
        super(intensity);
    }
    public String print(){
        System.out.print("B".concat(String.valueOf(intensity)));
        return null;
    }
}
