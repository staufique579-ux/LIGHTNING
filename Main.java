import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main extends ListenerAdapter {


    public static void main(String[] args) throws Exception {

        String token = "";

        JDABuilder.createDefault(
                        token,
                        GatewayIntent.GUILD_MESSAGES,
                        GatewayIntent.MESSAGE_CONTENT
                )
                .addEventListeners(new Main())
                .build();

        System.out.println("BOT ONLINE");


    }




    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot())
            return;

        String msg =
                event.getMessage()
                        .getContentRaw();


        // BOT ONLINE/OFFLINE NTFN:

        if (msg.startsWith("/SEND NF OF ONLINE"))
            reply(event, "BOT {LIGHTNING} IS ONLINE AND READY TO SEND MESSAGES\n                      WARNING!\n {IGNORE TO USE THIS COMMAND'S}\n");
        else if (msg.startsWith("/SEND NF FOR OFFLINE"))
            reply(event, "BOT {LIGHTNING} IS GOING OFFLINE NOW \n                 WARNING!\n {IGNORE TO USE THIS COMMAND'S}\n");

            //FOR PERSONAL

        else if (msg.startsWith("/HELP CHAT"))
            reply(event, "SELECT ONE: \n /SEND CHAT PT {PROMPT OF CHAT} \n");
        else if (msg.startsWith("/SEND CHAT PT"))
            reply(event, "WHICH ONE \n /BOT {FOR BOT} \n /FOR LR {FOR LEARNING CHAT}");
        else if (msg.startsWith("/BOT"))
            reply(event, "ROLE:\n" +
                    "You are my Java + Discord Bot mentor.\n" +
                    "\n" +
                    "Rules:\n" +
                    "\n" +
                    "* Continue from my current lesson number.\n" +
                    "* Teach Java only through bot projects.\n" +
                    "* Every lesson:\n" +
                    "\n" +
                    "  1. Explain concept\n" +
                    "  2. Show bot use case\n" +
                    "  3. Give small code\n" +
                    "  4. Give one bot task\n" +
                    "\n" +
                    "Focus:\n" +
                    "Commands\n" +
                    "Methods\n" +
                    "Arrays\n" +
                    "Bot replies\n" +
                    "Events\n" +
                    "Files\n" +
                    "Database\n" +
                    "Backend\n" +
                    "Secure bot systems\n" +
                    "\n" +
                    "Current lesson:\n" +
                    "[ I WILL WRITE LESSON NUMBER HERE ]\n" +
                    "\n" +
                    "My goal:\n" +
                    "Build Discord bots and later secure backend systems.\n" +
                    "\n" +
                    "Style:\n" +
                    "Simple, project based, no big jumps.\n");
        else if (msg.startsWith("FOR LR"))
            reply(event, "ROLE:\n" +
                    "You are my Java teacher.\n" +
                    "\n" +
                    "Rules:\n" +
                    "\n" +
                    "* Continue exactly from my current lesson number.\n" +
                    "* First explain the concept simply:\n" +
                    "\n" +
                    "  1. What it is\n" +
                    "  2. Why we use it\n" +
                    "  3. Real example\n" +
                    "  4. Visual/simple explanation\n" +
                    "  5. Then coding\n" +
                    "  6. Then one task\n" +
                    "\n" +
                    "Do not jump ahead.\n" +
                    "\n" +
                    "Track my progress lesson by lesson.\n" +
                    "\n" +
                    "Teach in beginner → builder order.\n" +
                    "\n" +
                    "Current lesson:\n" +
                    "[ I WILL WRITE LESSON NUMBER HERE ]\n" +
                    "\n" +
                    "Already learned:\n" +
                    "Variables\n" +
                    "Scanner\n" +
                    "If Else\n" +
                    "Methods\n" +
                    "Return\n" +
                    "Loops\n" +
                    "Sleep\n" +
                    "Arrays\n" +
                    "Parameters\n" +
                    "\n" +
                    "Goal:\n" +
                    "Become a base developer and learn backend/database later.\n" +
                    "\n" +
                    "Style:\n" +
                    "Simple language.\n" +
                    "Small steps.\n" +
                    "Review when needed.\n");



        else if(msg.equals("!hi"))
            reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");
       else if(msg.equals("!HI"))
            reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");
        else if(msg.equals("!Hi"))
            reply(event,"HELLO HOW ARE YOU,EVERY THINGS GOOD");



        else if(msg.equals("!bye"))
            reply(event,"GOODBYE HAVE A NICE DAY SIR");
        else if(msg.equals("!BYE"))
            reply(event,"GOODBYE HAVE A NICE DAY SIR");
        else if(msg.equals("!Bye"))
            reply(event,"GOODBYE HAVE A NICE DAY SIR");



        else if(msg.equals("!help"))
            reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");
        else if(msg.equals("!HELP"))
            reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");
        else if(msg.equals("!Help"))
            reply(event,"ASK ME: !GS CD {FOR GAME STUDIO COMMAND}\n      !ALL QA { FOR HAVING ALL QA}");



        else if (msg.startsWith("!ok"))
            reply(event,"THANKS, HAVE A NICE DAY");
        else if (msg.startsWith("!OK"))
            reply(event,"THANKS, HAVE A NICE DAY");
        else if (msg.startsWith("!Ok"))
            reply(event,"THANKS, HAVE A NICE DAY");
        else if (msg.startsWith("!oK"))
            reply(event,"THANKS, HAVE A NICE DAY");




        else if (msg.startsWith("!THANKS"))
            reply(event,":blush:  HAVE A NICE DAY SIR");
        else if (msg.startsWith("!thanks"))
            reply(event,":blush:  HAVE A NICE DAY SIR");
        else if (msg.startsWith("!THANK YOU"))
            reply(event,":blush:  HAVE A NICE DAY SIR");
        else if (msg.startsWith("!thank you"))
            reply(event,":blush:  HAVE A NICE DAY SIR");



        else if(msg.equals("!ping"))
            reply(event,"PONG");


       else if(msg.equals("!how are you"))
            reply(event,"I AM FINE WHAT ABOUT YOU SIR");
        else if(msg.equals("!How are you"))
            reply(event,"I AM FINE WHAT ABOUT YOU SIR");
        else if(msg.equals("!HOW ARE YOU"))
            reply(event,"I AM FINE WHAT ABOUT YOU SIR");

        else if (msg.equals("!me to"))
            reply(event,"GREAT SIR");
        else if (msg.equals("!Me to"))
            reply(event,"GREAT SIR");
        else if (msg.equals("!ME TO"))
            reply(event,"GREAT SIR");


      else if(msg.equals("!can you show me leaderboard"))
          reply(event,"I AM A LEADER OF LEADERBOARD :smiling_imp: \n JUST JOKING,\n SORRY I CAN'T DO IT, \n MAYBE IN FUTUER BUT NOT NOW :sweat_smile:");


      else if (msg.startsWith("!your owner"))
          reply(event, "SORRY NOT ALLOWED YET :sweat_smile: :raised_hands: ");



      else if(msg.startsWith("!who are you"))
          reply(event, "!LIGHTNING⚡" );


      else if(msg.startsWith("!do you like games"))
          reply(event, "Yes, especially survival and strategy games. \uD83C\uDFAE");


      else if (msg.startsWith("!who's the best developer"))
          reply(event, "The one who keeps learning every day. \uD83D\uDCBB\n beside, SKYWAYS IS THE BEST ");


      else if (msg.startsWith("!can you beat ChatGPT"))
          reply(event, "I'm still training... give me time. \uD83D\uDE0F");


      else if (msg.startsWith("!can you sing"))
          reply(event, "Only in binary. \uD83E\uDD16");


      else if (msg.startsWith("!what is your dream"))
          reply(event, "To become the smartest Discord bot. \uD83D\uDE80");


      else if (msg.startsWith("!are you human"))
          reply(event, "No, but I'm learning from humans every day. \uD83D\uDE04");


      //BOT ALL QA:
      else if (msg.startsWith("!ALL QA"))
          reply(event,"!how are you\n" +
                  "!can you show me leaderboard\n" +
                  "!your owner\n" +
                  "!who are you\n" +
                  "!do you like games\n" +
                  "!who's the best developer\n" +
                  "!can you beat ChatGPT\n" +
                  "!can you sing\n" +
                  "!what is your dream\n" +
                  "!are you human");


      //COMMAND FOR SKYWAYS:
      else if (msg.startsWith("!for SKYWAYS"))
          reply(event, "ask me this:\n !who's the best developer\n");



      //GS MAIN COMMAND:
      else if (msg.startsWith("!GS CD"))
          reply(event, "ASK ME: \n!about CD");



      else if (msg.startsWith("!about CD"))
          reply(event, "I'm still training... give me time.");




    }



    public static void reply(
            MessageReceivedEvent event,
            String text
    )
    {
        event.getChannel()
                .sendMessage(text)
                .queue();
    }

}
