package io.royale7.casino;

import java.util.ArrayList;
import java.util.List;

public class CardPlayer {
    private Player player;
    private boolean isDealer;
    private List<Card> hand;

    public CardPlayer() {
        player = new Player();
        isDealer = true;
        hand = new ArrayList<>();
    }

    public CardPlayer(Player player) {
        this.player = player;
        isDealer = false;
        hand = new ArrayList<>();
    }

    protected boolean isDealer() { return isDealer; }

    protected List<Card> getHand() {
        return hand;
    }

    protected int getCardPlayerID() {
        return player.getId();
    }
}
