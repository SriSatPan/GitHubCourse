package Login;

public class FeatureOne {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Feature One!");

    }

    public class MouseTest {

        public void mouse() {
    <<<<<<< Updated upstream
            String name = "mouse dev2";
    =======
            String name = "mouse dev1";
    >>>>>>> Stashed changes
            System.out.println(name);
        }
    }
}
