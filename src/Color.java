public enum Color {
    Red,Blue,Green,Colorless;

    public Color convert(String c) throws InvalidColorException{
        c = c.toLowerCase();
        switch(c){
            case "red":
                return Red;

            case "blue":
                return Blue;

            case "green":
                return Green;

            case "colorless":
                return Colorless;

            default:
                throw new InvalidColorException();

        }
    }
}
