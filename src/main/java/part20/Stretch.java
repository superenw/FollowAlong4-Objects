package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)
//
// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {

    public static void main(String[] args) {

        /* MY GUESS:
           Carter -> Davis, 15 yards: CAUGHT
           Carter -> Davis, 10 yards: CAUGHT
           #11 Davis: 2 catches, 25 yards
        */

        // Stretch A
        Quarterback carter = new Quarterback("Carter", 40);

        Receiver davis = new Receiver("Davis", 11);

        Receiver slot = davis;

        carter.throwTo(davis, 15);

        carter.throwTo(slot, 10);

        System.out.println(davis);


        // Stretch B1
        int completions = 2;

        int attempts = 3;

        // 2 / 3 uses integer division first, which becomes 0, then 0 * 100 stays 0
        System.out.println(completions / attempts * 100);

        // Multiplying by 100 first gives 200, then integer division makes 200 / 3 equal 66
        System.out.println(completions * 100 / attempts);

        // 100.0 is a double, so Java keeps the decimal part instead of using integer division
        System.out.println(completions * 100.0 / attempts);


        // Stretch B2
        System.out.println(davis.yardsPerCatch());

        Receiver rookie = new Receiver("Lee", 3);

        System.out.println(rookie.yardsPerCatch());


        // Stretch B3
        Receiver brooks = new Receiver("Brooks", 84);

        brooks.catchBall(25);

        System.out.println(brooks);

        brooks.catchBall(5);

        System.out.println(brooks);
    }
}