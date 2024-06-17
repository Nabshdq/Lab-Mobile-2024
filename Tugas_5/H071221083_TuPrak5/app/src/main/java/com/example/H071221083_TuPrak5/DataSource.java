package com.example.H071221083_TuPrak5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Zero-One", "Hiden Aruto", "Kamen Rider Zero-One"
                ,R.drawable.zero_one, R.drawable.zero_one));

        instagrams1.add(new Instagram("Saber", "Touma Kamiyama", "Kamen Rider Saber"
                ,R.drawable.saber, R.drawable.saber));

        instagrams1.add(new Instagram("Revice", "Ikki Igarashi", "Kamen Rider Revice"
                ,R.drawable.revice, R.drawable.revice));

        instagrams1.add(new Instagram("Geats", "Ace Ukiyo", "Kamen Rider Geats"
                ,R.drawable.geats, R.drawable.geats));

        return instagrams1;

    }

}
