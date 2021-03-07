package factoring;

public abstract class Dialog
{
    abstract Button createButton();
    void render() {
        Button okButton = createButton();
        okButton.onClick("Knopka");
        okButton.render();
    }
}
