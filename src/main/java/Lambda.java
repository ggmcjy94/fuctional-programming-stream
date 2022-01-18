import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda {

    public static void main(String[] args) {
        Game football = new Game() {
            @Override
            public void play() {
                System.out.println("i'm playing FootBall");
            }
        };
        football.play();

        Game cricket = new Game() {
            @Override
            public void play() {
                System.out.println("i'm playing cricket");
            }
        };
        cricket.play();

        Game footballLambda = () -> System.out.println("i'm playing footballLambda");
        footballLambda.play();

        Game cricketLambda = () -> System.out.println("i'm playing cricketLambda");
        cricketLambda.play();

        Series odiSeries = (type) -> System.out.println("It's a "+type+" series");
        odiSeries.play("ODI");

        List<String> players = Arrays.asList(
                "Kholi", "Sachin", "Ganguly", "Dhoni", "Dravid", "Sehwag", "Lee"
        );

        boolean sachinFlag = false;
        for (String player : players) {
            if (player.equals("Sachin")) {
                System.out.println("player = " + player);
                sachinFlag = true;
            }

        }
        if (sachinFlag) {
            System.out.println(" yes ");
        }

        players.stream().filter(name -> name.equals("Sachin"))
                .forEach(player -> System.out.println("player = " + player));

        Optional<String> optional = players.stream().filter(player -> player.equals("Sachin")).findFirst();
        if (optional.isPresent()) {
            System.out.println("yes");
        }

    }


    interface Game {
        void play();
    }

    interface Series {
        void play(String type);
    }
}
