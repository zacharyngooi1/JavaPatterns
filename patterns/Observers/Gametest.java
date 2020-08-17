public class Gametest {

    public static void main(String[] args) {
        Game mario = new MarioKart("mariokart1", 30);
        GameStore JeffsStore = new GameStore("JeffStore", mario);
        GameStore BobsStore = new GameStore("BobsStore", mario);
        mario.attach(BobsStore);
        mario.attach(JeffsStore);
        mario.setPrice(99);
        mario.detach(BobsStore);
        mario.setPrice(2020);
        System.out.println(JeffsStore.getGameprice());
        // Are observers supposed to still retain the observable's updated values?
        System.out.println(BobsStore.getGameprice());
        }
}