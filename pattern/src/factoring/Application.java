package factoring;


public class Application {
    Dialog dialog;

    void Initialize(String config) throws Exception
    {
        if(config.equals("Win")) dialog = new WindowsDialog();
        else if (config.equals("Web")) dialog = new WebDialog();
        else throw new Exception("Unknown OS, try again");
    }

    void main()
    {
        try
        {
            this.Initialize("Win");
            dialog.render();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
