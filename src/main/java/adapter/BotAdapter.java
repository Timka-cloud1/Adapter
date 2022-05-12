package adapter;

public class BotAdapter extends User {
    private Bot bot;

    public BotAdapter(Bot bot) {
        this.bot = bot;
    }

    @Override
    public String getName() {
        return bot.getName();
    }

    @Override
    public void setName(String name) {
        bot.setName(name);
    }
}
