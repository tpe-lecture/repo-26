package tpe.collections.iterate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.ArrayList;
import java.util.Iterator;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Anzahl der Münzen. */
    private static final int NUM_COINS = 1000;

    /** Münzgenerator. */
    ArrayList<Sprite> coinList = new ArrayList<>();
    private CoinGenerator generator;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(600, 600), Color.BLACK);

        generator = new CoinGenerator(this, NUM_COINS);

        // TODO: Münzen generieren
//        for(Sprite s : generator){
//            coinList.add(s);
//        }

       Iterator<Sprite> it = generator.iterator();
       while (it.hasNext()) {
           coinList.add(it.next());
      }
    }


    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {

        for(Sprite s : coinList){

            s.draw(g);
        }

    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}
