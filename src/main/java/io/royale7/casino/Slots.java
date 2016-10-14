package io.royale7.casino;

import java.util.*;

import static io.royale7.casino.Slots.Slot.getRandomSlotValue;

public class Slots extends LuckGame {

    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());
        Slots s = new Slots(playerList);
        s.init();
    }

    protected enum Slot {
        CHERRIES,   // x1
        BAR,        // x2.5
        SEVEN;      // x5

        private static final List<Slot> VALUES = Collections.unmodifiableList(Arrays.asList(Slot.values()));
        private static final int SIZE = VALUES.size();
        public static final Random RANDOM = new Random();

        public static Slot getRandomSlotValue() {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }

        // http://stackoverflow.com/questions/1972392/java-pick-a-random-value-from-an-enum
    }

    private SlotsDisplay slotsDisplay;
    private Player player;

    private boolean running;
    private boolean prompted;
    private Slot[][] slotsValues;
    private final int NUMREELS = 3;
    private int winAmount;

    public Slots(List<Player> playerList) {
        player = playerList.get(0);
    }

    @Override
    public void settle() {

    }

    @Override
    public void bet() {

    }

    protected boolean isRunning() { return running; }
    public SlotsDisplay getDisplay() { return slotsDisplay; }
    public Player getPlayer() { return player; }
    protected Slot[][] getSlots() { return slotsValues; }
    protected int getWinAmount() { return winAmount; }

    public void init() { // entry and exit point
        running = true;
        prompted = false;
        winAmount = 0;
        slotsDisplay = new SlotsDisplay();
        slotsValues = new Slot[NUMREELS][NUMREELS];
        for (int row = 0; row < NUMREELS; row++) {
            for (int value = 0; value < NUMREELS; value++) {
                slotsValues[row][value] = getRandomSlotValue();
            }
        }
        gameLoop();
    }

    public void gameLoop() {
        while (running) {
            if (prompted) {
                playOrQuit(UserInput.promptString());
                determineWinnings();
            } else {
                slotsDisplay.printUserInfo();
                slotsDisplay.printWelcomeMenu();
                prompted = true;
            }
        }
    }

    public void playOrQuit(String input) {
        switch (input) {
            case "1":
                playSlots();
                break;
            case "2":
                quit();
                break;
            default:
                Display.invalidSelection();
                break;
        }
    }

    public void playSlots() {
        for (Slot[] rows : slotsValues) {
            for (Slot slot : rows) {
                slot = getRandomSlotValue();
            }
        }
    }

    public void determineWinnings() {
        boolean won = true;
        Slot[] payoutLine = slotsValues[1]; // just middle for now
        Slot checkValue = payoutLine[0];

        for (int i = 1; i < payoutLine.length; i++) {
            if (payoutLine[i] != checkValue) {
                won = false;
            }
        }
        if (won) {
            switch (checkValue) {
                case SEVEN:
                    winAmount = 500;
                    break;
                case CHERRIES:
                    winAmount = 100;
                    break;
                case BAR:
                    winAmount = 250;
                    break;
            }
        }
    }

    public void quit() {
        Display.logOutMenu();
        running = false;
    }

    private class SlotsDisplay extends Display {
        private void printWelcomeMenu() {
            outputLn("Welcome my son to Slooooooooooooooooooooots. What do?");
            outputLn("[1] Play - $100");
            outputLn("[2] Quit");
        }

        private void printUserInfo() {
            outputLn(player.getName());
            Display.printFormatBalance(player.getAccountBalance());
        }

        private void printSlots() {
            for (Slot[] rows : slotsValues) {
                for (Slot slot : rows) {
                    System.out.printf("[%s]", slot.name());
                }
                System.out.println();
            }
        }

        private void printWinnings() {
            outputLn("I guess you won...");
            System.out.print("+");
            Display.printFormatBalance(winAmount);
        }

        private void printEndPrompt() {
            outputLn("Now what?");
            outputLn("[1] Play - $100");
            outputLn("[2] Quit");
        }
    }
}
