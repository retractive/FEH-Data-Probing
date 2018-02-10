public enum MoveType {
    CAVALRY,FLIER,INFANTRY,ARMOR;

    /** @return all move types in array form
     * */
    public static MoveType[] all(){
        return new MoveType[]{ CAVALRY, FLIER, INFANTRY, ARMOR };
    }

    /** @return fliers only
     * */
    public static MoveType[] fliersOnly(){
        return new MoveType[]{ FLIER };
    }

    /** @return all except cavalry
     * */
    public static MoveType[] exclCavalry(){
        return new MoveType[]{ FLIER, INFANTRY, ARMOR };
    }
}
