public class LogicalNot {
    public static void main (String [] args) {
        System.out.println("One of you always lies so which door the other guard would say leads out?");
        String text = "right";
        if(!(text.equals("right")))
        { //true if the condition text.equals("right") is false
            System.out.println("right");
        }
        else
        {
            System.out.println("Your answers was pointing right so I'll go left!");
            System.out.println("SAFE");
        }
    }
}
