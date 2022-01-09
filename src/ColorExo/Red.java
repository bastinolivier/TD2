package ColorExo;

class Red extends Component{

    public  Red(){
        super();
    }
    public Red(short intensity){
        super(intensity);
    }

    public String print(){
        System.out.print("R".concat(String.valueOf(intensity)));
        return null;
    }
}