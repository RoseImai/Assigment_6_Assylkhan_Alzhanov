package factoring;

public class HTMLButton implements Button
{
    @Override
    public String render() {
        return "Eto HTML";
    }

    @Override
    public String onClick(String f) {
        return "Click po HTML";
    }
}
