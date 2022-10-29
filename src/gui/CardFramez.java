package gui;

import javax.swing.*;
import java.util.ArrayList;

public class CardFramez extends Gui {


    public static ArrayList<JLabel> cardsDealerArray = new ArrayList<>();
    public static ArrayList<JLabel> cardsPlayerArray = new ArrayList<>();
    public static JLabel cardExtraDealer = null;
    public static JLabel cardPlayer = null;
    public static int cExlocation;
    public static int cExlocationPl;
    public static int cardCounterPLayer = 0;




    public static void cardFramePlayer(ImageIcon xIcnz) {


        cExlocationPl = cardCounterPLayer * 100;

        cardPlayer = new JLabel();
        cardPlayer.setBounds(0, 0, 89, 185);
        cardPlayer.setLocation(860-cExlocationPl, 10);
        cardPlayer.setIcon(xIcnz);
        Gui.framzz.add(cardPlayer,1);
        cardPlayer.setVisible(false);
        cardPlayer.setVisible(true);


        cardsPlayerArray.add(cardCounterPLayer, cardPlayer);

        cardCounterPLayer++;

    }

    public static void cardFrameDealer(ImageIcon xIcn) {


        cExlocation = Gui.cardsCounterDealer * 100;

        cardExtraDealer = new JLabel();
        cardExtraDealer.setBounds(860-cExlocation, 330, 89, 185);

        cardExtraDealer.setIcon(xIcn);
        Gui.framzz.add(cardExtraDealer,1);
        cardExtraDealer.setVisible(false);
        cardExtraDealer.setVisible(true);


        cardsDealerArray.add(Gui.cardsCounterDealer, cardExtraDealer);

        Gui.cardsCounterDealer++;

    }

    public static void clearCardFrames() {


        if (cardsPlayerArray.size() > 0) {
            for (int i = 0; i < cardsPlayerArray.size(); i++) {
                cardsPlayerArray.get(i).setVisible(false);
            }
            cardsPlayerArray.clear();
        }


        if (cardsDealerArray.size() > 0) {
            for (int i = 0; i < cardsDealerArray.size(); i++) {
                cardsDealerArray.get(i).setVisible(false);
            }
            cardsDealerArray.clear();
        }
    }
}
