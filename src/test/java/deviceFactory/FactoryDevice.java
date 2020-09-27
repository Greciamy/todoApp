package deviceFactory;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class FactoryDevice {

    public static IDevice make(String type){
        IDevice device;

        switch (type){
            case "android":
                device= new Android();
                break;
            case "ios":
                device= new IOS();
                break;
            case "windowsphone":
                device= new WindowsPhone();
                break;
            case "browserstack":
                device= new BrowserStack();
                break;
            default:
                device= new Android();
                break;

        }
        return device;
    }
}
