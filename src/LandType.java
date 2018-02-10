public enum LandType {

    MOUNTAIN,LAND,OCEAN,FOREST,PILLAR,WALLONE,WALLTWO,GRATE;



    public MoveType[] getValidMoveTypes(LandType l){
        MoveType[] validMoveTypes;
        switch (l){
            /*For Ocean and Mountain, return Fliers Only*/
            case OCEAN:
            case MOUNTAIN:
                return MoveType.fliersOnly();
            case LAND:
                return MoveType.all();
            case FOREST: // TODO: take care of change in allowed move distance
                return MoveType.exclCavalry();
            case GRATE:
                return MoveType.exclCavalry();
            case PILLAR:
            case WALLONE:
            case WALLTWO:
            default:
                return null; // no character may move here, so null is returned. Since this is an ENUM, we will never hit the default case
        }
    }
}
