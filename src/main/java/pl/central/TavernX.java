package pl.central;

public class TavernX implements PlayerActionState {
    @Override
    public void action(ActionStateContext ctx)
    {
        System.out.println("\"You have just entered tavern 'Wicked Bull' in Xarthas, " +
                "you sat next to  nearest free table.\\n\" +\n" +
                "  \" Barmaid just walked to you and asked what do you want. You can ask for " +
                "\\n[a] Beer for for 0.5 gulden\" +\n" +
                "  \"\\n[b] hot meal for 1 gulden\\n" +
                "[c]food for your horses which will cost you whole 2 guldens\\n" +
                "[d]\" +\n" +
                " \"room for one night for 1.5 gulden \";");



    }
}
