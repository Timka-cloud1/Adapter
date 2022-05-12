package adapter;

public class Main {
    public static void main(String[] args) {
        GroupService gs = new GroupService();
        User user = new User();
        user.setName("ALEX");
        Bot bot = new Bot();
        bot.setName("AF-3");
        BotAdapter botAdapter = new BotAdapter(bot);
        gs.joinToGroup(user);
        gs.joinToGroup(botAdapter);


    }
}
