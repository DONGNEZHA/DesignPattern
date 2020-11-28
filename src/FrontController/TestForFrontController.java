package FrontController;

public class TestForFrontController {
    public static void main(String[] args) {
        Controller frontController = new Controller();
        frontController.dispatchRequest("JUDGE");
        System.out.println();
        frontController.dispatchRequest("ATHLETE");
    }
}
