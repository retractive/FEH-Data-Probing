public class GameSquare {

    /**
     * GameSquare: Contains all info needed for one square on the GameBoard
     * */

    Character c; // the character occupying this square
    LandType l;

    public GameSquare(Character ch, LandType la) {
        c = ch;
        l = la;
    }


    /**
     * @return FALSE if failed to move character to this square, TRUE if successfully moved character to this square
     * */
    public boolean moveCharacterHere(Character newC){
        if (!this.isEmpty()) return false;

        // TODO
        // Doing the rule analysis here; if I find a better way, will move the rule analysis elsewhere
        // LandType.getValidMoveTypes();
        return false;

    }


    /**
     * */
    public boolean isEmpty(){
        if (c.equals(null)) return true;
        else return false;
    }
}
