package io.royale7.casino;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static com.sun.tools.internal.xjc.reader.Ring.add;

/**
 * Created by carinablair on 10/12/16.
 */
public class CardGamesTest {
    CardGamesMock cardGamesMock;

    private class CardGamesMock extends CardGames{

        protected ArrayList<CardPlayer> cardPlayers;

        public CardGamesMock(ArrayList<Player> players) {
            super(players);
            this.cardPlayers = initializeCardPlayers(players);
        }
        public void init(){

        }
    }
    @Before
    public void initialize(){
        ArrayList<Player> playerList = new ArrayList<>();
        {{
            add(new Player("Bob", "zoo"));
            add(new Player("Bill", "aquarium"));
            add(new Player("Joe", "safari"));
        }}
        cardGamesMock = new CardGamesMock(playerList);
    }

    @Test
    public void dealTest(){
        cardGamesMock.deal(3);
        int expected = 4;
        Assert.assertTrue(cardGamesMock.gameTable.size()==expected);
    }
}
