package unsw.characters.inheritance;

public class test {
    public static void main(String[] args) {
        King king = new King(5, 5);
        System.out.println(king.getHealthPoints());
        king.damage(10);
        System.out.println(king.getHealthPoints());
        ChainMailDecorator kingMail = new ChainMailDecorator(king);
        kingMail.damage(10);
        System.out.println(kingMail.getHealthPoints());
        HelmetDecorator KingHelm = new HelmetDecorator(kingMail);
        KingHelm.damage(10);
        System.out.println(KingHelm.getHealthPoints());
    }
    
}