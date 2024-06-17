package com.example.p3_h071221035;

import java.util.ArrayList;

public class Data_source {
    public static ArrayList<Account> accounts=generateDummyAccounts();

    private static ArrayList<Account> generateDummyAccounts() {
        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(new Account("Kuuga",
                R.drawable.kuuga,
                R.drawable.kuuga_post,
                "Transforming into the first Heisei hero, Kamen Rider Kuuga! With the power of four unique forms, Kuuga protects the world from the Grongi threat. #KamenRiderKuuga #HeiseiRider #GrongiHunter\n",
                500,
                69,
                R.drawable.kuuga_logo));
        accounts.add(new Account("Agito",
                R.drawable.agito,
                R.drawable.agito_post,
                "When the power of evolution calls, Kamen Rider Agito rises! Uncovering mysteries and battling the Unknowns for peace. #KamenRiderAgito #HeiseiRider #Unknowns\n",
                500,
                69,
                R.drawable.agito_logo));
        accounts.add(new Account("Ryuuki",
                R.drawable.ryuuki,
                R.drawable.ryuuki_post,
                "Fighting in the Mirror World! Kamen Rider Ryuki battles in a deadly rider war for hidden desires. #KamenRiderRyuki #MirrorWorld #RiderWar\n",
                500,
                69,
                R.drawable.ryuuki_logo));
        accounts.add(new Account("555",
                R.drawable._55,
                R.drawable._55_post,
                "Welcome to the world of Orphnoch! Kamen Rider 555 (Faiz) faces the darkness to protect humanity's future. #KamenRider555 #Faiz #Orphnoch\n",
                500,
                69,
                R.drawable._55_logo));
        accounts.add(new Account("Blade",
                R.drawable.blade,
                R.drawable.blade_post,
                "With the mysterious Rouze Cards, Kamen Rider Blade fights to seal the unleashed Undead! #KamenRiderBlade #RouzeCards #UndeadHunter\n",
                500,
                69,
                R.drawable.blade_logo));
        accounts.add(new Account("Hibiki",
                R.drawable.hibiki,
                R.drawable.hibiki_post,
                "With thundering music and powerful beats, Kamen Rider Hibiki faces Oni with the power of sound! #KamenRiderHibiki #OniHunter #SoundOfBattle\n",
                500,
                69,
                R.drawable.hibiki_logo));
        accounts.add(new Account("Kabuto",
                R.drawable.kabuto,
                R.drawable.kabuto_post,
                "Clock Up! Kamen Rider Kabuto battles Worms with lightning speed and unmatched power. #KamenRiderKabuto #ClockUp #WormHunter\n",
                500,
                69,
                R.drawable.kabuto_logo));
        accounts.add(new Account("Den-O",
                R.drawable.deno,
                R.drawable.deno_post,
                "Time traveling with the DenLiner! Kamen Rider Den-O journeys through time to fight evil. #KamenRiderDenO #TimeTravel #DenLiner\n",
                500,
                69,
                R.drawable.deno_logo));
        accounts.add(new Account("Kiva",
                R.drawable.kiva,
                R.drawable.kiva_post,
                "The enchanting melody of the night, Kamen Rider Kiva battles Fangire to protect the world. #KamenRiderKiva #FangireHunter #NocturnalHero\n",
                500,
                69,
                R.drawable.kiva_logo));
        accounts.add(new Account("Decade",
                R.drawable.decade,
                R.drawable.decade_post,
                "Journeying through the worlds of riders, Kamen Rider Decade unites worlds to face the greatest threat. #KamenRiderDecade #WorldTraveler #DestroyerOfWorlds\n",
                500,
                69,
                R.drawable.decade_logo));
        return accounts;
    }
}
