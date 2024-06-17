package com.example.H071221083_Tuprak4;

import com.example.H071221083_Tuprak4.R;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();

        instagrams1.add(new Instagram("kamen_rider_double", "Kamen Rider W (Double)"
                , "Two minds, one body! Solve mysteries with Kamen Rider W (Shotaro Hidari & Philip)! 🕵️‍♂️♻️ #KamenRider #Double #Detective"
                , R.drawable.w, R.drawable.w));

        instagrams1.add(new Instagram("kamen_rider_ooo", "Kamen Rider OOO"
                , "Harness the power of animals and coins with Kamen Rider OOO (Eiji Hino)! 🐯🦅🦖 #KamenRider #OOO #ComboKing"
                , R.drawable.ooo, R.drawable.ooo));

        instagrams1.add(new Instagram("kamen_rider_fourze", "Kamen Rider Fourze"
                , "Blast off into adventure and make friends with Kamen Rider Fourze (Gentaro Kisaragi)! 🚀⭐ #KamenRider #Fourze #SpaceHero"
                , R.drawable.fourze, R.drawable.fourze));

        instagrams1.add(new Instagram("kamen_rider_wizard", "Kamen Rider Wizard"
                , "Unleash magical powers and protect the world with Kamen Rider Wizard (Haruto Soma)! 🧙‍♂️✨ #KamenRider #Wizard #Magic"
                , R.drawable.wizard, R.drawable.wizard));

        instagrams1.add(new Instagram("kamen_rider_gaim", "Kamen Rider Gaim"
                , "From fruit to fight, master the battlefield with Kamen Rider Gaim (Kota Kazuraba)! 🍍⚔️ #KamenRider #Gaim #FruitWarrior"
                , R.drawable.gaim, R.drawable.gaim));

        instagrams1.add(new Instagram("kamen_rider_drive", "Kamen Rider Drive"
                , "Speed into action and protect the city with Kamen Rider Drive (Shinnosuke Tomari)! 🚗💨 #KamenRider #Drive #Speedster"
                , R.drawable.drive, R.drawable.drive));

        instagrams1.add(new Instagram("kamen_rider_ghost", "Kamen Rider Ghost"
                , "Embrace the spirit world and fight for justice with Kamen Rider Ghost (Takeru Tenkuji)! 👻🔥 #KamenRider #Ghost #SpiritualWarrior"
                , R.drawable.ghost, R.drawable.ghost));

        instagrams1.add(new Instagram("kamen_rider_exaid", "Kamen Rider Ex-Aid"
                , "Game on! Fight viruses and save lives with Kamen Rider Ex-Aid (Emu Hojo)! 🎮💉 #KamenRider #ExAid #GameChanger"
                , R.drawable.exaid, R.drawable.exaid));

        instagrams1.add(new Instagram("kamen_rider_build", "Kamen Rider Build"
                , "Science meets heroism! Ready to build a better world with Kamen Rider Build (Sento Kiryu)! 🛠️⚡ #KamenRider #Build #Innovation"
                , R.drawable.build, R.drawable.build));

        instagrams1.add(new Instagram("kamen_rider_zio", "Kamen Rider Zi-O"
                , "Travel through time and rewrite history with the power of Kamen Rider Zi-O (Sougo Tokiwa)! 🕰️✨ #KamenRider #ZiO #TimeTraveler"
                , R.drawable.zio, R.drawable.zio));

        return instagrams1;
    }
}
