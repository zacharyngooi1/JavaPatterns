package unsw.characters.inheritance;

public abstract class CharacterDecorator implements Character {
    private Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
    }


    public int getHealthPoints() {
        return character.getHealthPoints();
    }

    public int getX() {
        return character.getX();
    }

    public int getY() {
        return character.getY();
    }

    /**
     * Cause this character the given amount of damage.
     *
     * @param points
     */
    public void damage(int points) {
        character.damage(points);
    }

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     *
     * @param victim
     */
    public void attack(Character victim) {
        character.attack(victim);
    }

    /**
     * Can this character move by the given amount along the x and y axes.
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public  boolean canMove(int dx, int dy) {
        return character.canMove(dx, dy);
    }

    
    
}