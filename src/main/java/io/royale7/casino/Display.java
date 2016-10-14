package io.royale7.casino;

import java.text.NumberFormat;

public class Display {


    public static void welcomeMenu(){
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        outputLn("$                                                    $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$   $                                            $   $");
        outputLn("$   $                                            $   $");
        outputLn("$   $            [1] LOGIN                       $   $");
        outputLn("$   $            [2] CREATE AN ACCOUNT           $   $");
        outputLn("$   $                                            $   $");
        outputLn("$   $                                            $   $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$                                                    $");
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void loginMenu(){
        outputLn("Login Menu.");
    }

    public static void newCustomerMenu(){
        outputLn("Thank you for joining.");
    }

    public static void loungeMenu(){
//        outputLn("Welcome to the lounge."); // todo: greet with user name
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        outputLn("$                                                     $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $           WELCOME TO THE LOUNGE             $   $");
        outputLn("$   $            [1] ADD FUNDS                    $   $");
        outputLn("$   $            [2] PLAY GAMES                   $   $");
        outputLn("$   $            [3] LOG OUT                      $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$                                                     $");
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void addFundsMenu(){
        outputLn("How much would you like to add to your account? ");
    }

    public static void printFormatBalance(double balance) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        outputLn(formatter.format(balance));
    }

    public static void playRoomMenu(){
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        outputLn("$                                                     $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $             GAME ROOM FLOOR                 $   $");
        outputLn("$   $         PLEASE MAKE A SELECTION             $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $            [1] CRAPS                        $   $");
        outputLn("$   $            [2] SLOTS                        $   $");
        outputLn("$   $            [3] HORSE RACING                 $   $");
        outputLn("$   $            [4] BLACK JACK                   $   $");
        outputLn("$   $            [5] BACCARAT                     $   $");
        outputLn("$   $            [6] WAR                          $   $");
        outputLn("$   $            [7] HIGH LOW                     $   $");
        outputLn("$   $            [8] PITTY-PAT                    $   $");
        outputLn("$   $            [9] HORSE RACING                 $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $                                             $   $");
        outputLn("$   $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$   $");
        outputLn("$                                                     $");
        outputLn("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    public static void logOutMenu(){
        outputLn("   ▄██████▄   ▄██████▄   ▄██████▄  ████████▄      ▀█████████▄  ▄██   ▄      ▄████████ \n" +
                "  ███    ███ ███    ███ ███    ███ ███   ▀███       ███    ███ ███   ██▄   ███    ███ \n" +
                "  ███    █▀  ███    ███ ███    ███ ███    ███       ███    ███ ███▄▄▄███   ███    █▀  \n" +
                " ▄███        ███    ███ ███    ███ ███    ███      ▄███▄▄▄██▀  ▀▀▀▀▀▀███  ▄███▄▄▄     \n" +
                "▀▀███ ████▄  ███    ███ ███    ███ ███    ███     ▀▀███▀▀▀██▄  ▄██   ███ ▀▀███▀▀▀     \n" +
                "  ███    ███ ███    ███ ███    ███ ███    ███       ███    ██▄ ███   ███   ███    █▄  \n" +
                "  ███    ███ ███    ███ ███    ███ ███   ▄███       ███    ███ ███   ███   ███    ███ \n" +
                "  ████████▀   ▀██████▀   ▀██████▀  ████████▀      ▄█████████▀   ▀█████▀    ██████████ ");
    }

    public static void invalidSelection(){
        outputLn("########################################################");
        outputLn("#                                                      #");
        outputLn("#      INVALID SELECTION. PLEASE TRY AGAIN             #");
        outputLn("#                                                      #");
        outputLn("########################################################");
    }

    public static void invalidUser(){
        outputLn("########################################################");
        outputLn("#   WE'RE SORRY, YOU COULD NOT BE LOGGED IN WITH THE   #");
        outputLn("#     THE CREDENTIAL PROVIDED. PLEASE VERIFY YOUR      #");
        outputLn("#       USER ID AND PASSWORD AND TRY AGAIN!            #");
        outputLn("########################################################");
    }

    public static void outputLn(String msg){
        System.out.println(msg);
    }

    public static void woptober() {
        outputLn("  ██╗    ██╗ ██████╗ ██████╗ ████████╗ ██████╗ ██████╗ ███████╗██████╗ \n" +
                "   ██║    ██║██╔═══██╗██╔══██╗╚══██╔══╝██╔═══██╗██╔══██╗██╔════╝██╔══██╗\n" +
                "   ██║ █╗ ██║██║   ██║██████╔╝   ██║   ██║   ██║██████╔╝█████╗  ██████╔╝\n" +
                "   ██║███╗██║██║   ██║██╔═══╝    ██║   ██║   ██║██╔══██╗██╔══╝  ██╔══██╗\n" +
                "   ╚███╔███╔╝╚██████╔╝██║        ██║   ╚██████╔╝██████╔╝███████╗██║  ██║\n" +
                "    ╚══╝╚══╝  ╚═════╝ ╚═╝        ╚═╝    ╚═════╝ ╚═════╝ ╚══════╝╚═╝  ╚═╝\n" +
                "                                                                    ");
    }

       public static void dollarBill(){

        outputLn(" =========================================================================  \n" +
                "| |%/^\\\\%&%&%&%&%&%&%&%&{ Federal Reserve Note }%&%&%&%&%&%&%&%&//^\\%| |  \n" +
                "| |/inn\\)===============------------------------===============(/inn\\ | |  \n" +
                "| |\\|UU/              { UNITED STATES OF AMERICA }              \\|UU/ | |  \n" +
                "| |&\\-/     ~~~~~~~~   ~~~~~~~~~~=====~~~~~~~~~~~  P8188928246   \\-/& | |  \n" +
                "| |%//)     ~~~_~~~~~          // ___ \\                         (  \\% | |  \n" +
                "| |&(/  13    /_\\             // /_ _\\           ~~~~~~~~     13 \\)& | |  \n" +
                "| |%\\      //   \\           :| | ~ \\| |:  3.21 /||  /\\   /\\     //%| |  \n" +
                "| |&\\     ((iR$)>)):P ebp  || |\"- -\"| ||        || || || || ||   //& | | \n" +
                "| |%\\  ))   \\_///      sge  || (|e,e|? ||        || || || || ||  ((//%| | \n" +
                "| |&))/       \\_/            :| `._^_,' |:        || || || || ||   \\((| | \n" +
                "| |%//)                       \\ \\=// //          || || || || ||   (\\%| | \n" +
                "| |&//      R265402524K        \\U   //   series   ||  \\/   \\/      \\| | \n" +
                "| |%/>  13                     _\\\\___//_    1932              13  <\\%| | \n" +
                "| |&/^\\      Treasurer  ______{Franklin}________   Secretary     /^\\& | | \n" +
                "| |/inn\\                ))--------------------((                /inn\\ | | \n" +
                "| |)|UU(================/ ONE HUNDRED DOLLARS \\================)|UU(|  | | \n" +
                "| |{===}%&%&%&%&%&%&%&%&%a%a%a%a%a%a%a%a%a%a%a%a%&%&%&%&%&%&%&%&{===}|  | } \n" +
                "| ======================================================================= ");
    }

    public static void wutang(){
        outputLn("                                                                  ??            \n" +
                "                                                               ???????          \n" +
                "                                                            ?++??+????+         \n" +
                "       ??++??~                                           ????????+??????        \n" +
                "       ??+?+??+???++                                  ??+???+??+?+???+?+?       \n" +
                "      ???++?++??+??+?+??+?                         ???+?+????+????+???+??       \n" +
                "     ??+++?+++?????????+???????+.               ???+?????+?+?+?+?+????+?++      \n" +
                "     ???+????+?+?+???????+?+???              ???+???+????+????+?????+?+?++?     \n" +
                "    ++???++???+???++??+???????               .+??+?++??????????????????+???     \n" +
                "    ???+??+++?++????+???????+                  ?????????????+?????+????????.    \n" +
                "   ?+????+????+????????+?+?+?                   ?????+???+??+????+????+?????    \n" +
                "   ???????????????????????+??           ,       ?????????+?????++++?+??+?+??    \n" +
                "  +?????+???+?????+?????++?+?        ++???      ?+???????++??+?????+???????+    \n" +
                "  +?+??+?????+???????+???+?+?     .????????     ????+???+?+??????????????????   \n" +
                "  +???????????????????+?++??+   ??++??+????+    ??????????+???????+?+?+++??+?   \n" +
                "  ????+????????????+?++??????~   ?????+?++?+   ??++??++??++?+?????+?????+??+?   \n" +
                " ????+????????????????????????    +??????+??+  ?????++????+???+???????+?+??++   \n" +
                " ?+?+?????????????++?+??????+++ :??+?+???????~????????+???????+???+???++?????   \n" +
                "                                                                                \n" +
                " +??+  ???    ???  ?    ??+:     +????+?=?+??   +???    ??+????       ??????    \n" +
                "  ??    ??    ++   ?+?   ??           +?    ?  ?   .?    ?     .?   +           \n" +
                "   ?    ??    ??  ?+      +?          ??      ????????   +~     ?? ?? ?+?       \n" +
                "   +?  ?+?+  +?   ?+      ,?  +?++    +?     ++     ,+   +?     ?? ??     ??    \n" +
                "     ??.   ??       ?=   ??           +?=    ??     ??+  ++?   +??   ??    ?    \n" +
                "                                                                           +    \n" +
                "  ????+????+??++??+?????+??????++????+??????????+??+?+??+?+?????+?????+???++    \n" +
                "  =??+???+?++???????+?+??????++?+?+???+?   ,+??++??+?+??+++?+?+???++????????    \n" +
                "   ???????+?????+??+????++?+???+??+???+      ?????+????+????????+??????????     \n" +
                "    +??+?+?????????+?????+?+?????+????+       ????????+??+?????++?+????????     \n" +
                "    ++?+???+????++?++??????????????++??       ~++??+??+?+?++???+?+??????+?      \n" +
                "     ??????????+???++????+????+??????++        ???????????+??????????????       \n" +
                "      +??+??????????+???+?+????????????         +???+???????+???+??+?++?+       \n" +
                "       +????????+??+??+?????+??????????         +?????+??++?+?+????????+        \n" +
                "        ?+?+??+?????+++?????++?++???++??         ????++??+????+???+???+         \n" +
                "         ??????????++???????+???????????         .???+???+????????+???          \n" +
                "           ??+?++?++?+??+?+?+????????+???         ??+?+????????+???+?           \n" +
                "             ??+???????+???++?????????????        ????++?+?+??????+?            \n" +
                "               +????+????????????????+???++        ++??+???+?+????:             \n" +
                "                  +???+?????++??????+???+???       +???+?+???+???               \n" +
                "                     ++?????+???+???+?????++?      +???????+?+?                 \n" +
                "                           ++?+?+?????+??+???+     ???++??+??                   \n" +
                "                                                   ???+?+++                     \n" +
                "                                                   ????+                        \n" +
                "                                                   ??                     ");
    }

    public static void royalSevenLogo(){
        outputLn("   ▄████████  ▄██████▄  ▄██   ▄      ▄████████  ▄█          ▄████████        ▄████████    ▄████████    ▄████████  ▄█  ███▄▄▄▄    ▄██████▄  \n" +
                "  ███    ███ ███    ███ ███   ██▄   ███    ███ ███         ███    ███       ███    ███   ███    ███   ███    ███ ███  ███▀▀▀██▄ ███    ███ \n" +
                "  ███    ███ ███    ███ ███▄▄▄███   ███    ███ ███         ███    █▀        ███    █▀    ███    ███   ███    █▀  ███▌ ███   ███ ███    ███ \n" +
                " ▄███▄▄▄▄██▀ ███    ███ ▀▀▀▀▀▀███   ███    ███ ███        ▄███▄▄▄           ███          ███    ███   ███        ███▌ ███   ███ ███    ███ \n" +
                "▀▀███▀▀▀▀▀   ███    ███ ▄██   ███ ▀███████████ ███       ▀▀███▀▀▀           ███        ▀███████████ ▀███████████ ███▌ ███   ███ ███    ███ \n" +
                "▀███████████ ███    ███ ███   ███   ███    ███ ███         ███    █▄        ███    █▄    ███    ███          ███ ███  ███   ███ ███    ███ \n" +
                "  ███    ███ ███    ███ ███   ███   ███    ███ ███▌    ▄   ███    ███       ███    ███   ███    ███    ▄█    ███ ███  ███   ███ ███    ███ \n" +
                "  ███    ███  ▀██████▀   ▀█████▀    ███    █▀  █████▄▄██   ██████████       ████████▀    ███    █▀   ▄████████▀  █▀    ▀█   █▀   ▀██████▀  \n" +
                "  ███    ███                                   ▀                                                                                         ");
    }
}
