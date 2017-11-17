public enum Color {
    Red,Blue,Green,Colorless;

    public Color convert(String c) throws InvalidColorException{
        c = c.toLowerCase();
        switch(c){
            case "red":
                return Red;
                break;
            case "blue":
                return Blue;
                break;
            case "green":
                return Green;
                break;
            case "colorless":
                return Colorless;
                break;
            default:
                throw new InvalidColorException();
                break;
        }
    }
}
