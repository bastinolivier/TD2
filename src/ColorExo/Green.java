package ColorExo;

class Green extends Component{

    public Green(){
        super();
    }
    public Green(short intensity){
        super(intensity);
    }
    public String print(){
        System.out.print("G".concat(String.valueOf(intensity)));
        return null;
    }
}