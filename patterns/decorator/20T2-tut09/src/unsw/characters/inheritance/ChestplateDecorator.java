package unsw.characters.inheritance;

public class ChestplateDecorator extends CharacterDecorator {

    public ChestplateDecorator(Character character) {
        super(character);
    }

    @Override
    public void damage(int points) {
        super.damage(Math.min(points, 7));
    }

    @Override
    public boolean canMove(int dx, int dy) {
        if (dx + dy <= 3) {
            return super.canMove(dx, dy);
        }
        else {
            return false;
        }
    }
    
}