
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine(); //faili nimi, millelt andmeid loetakse
        System.out.println("Team?");
        String team = scan.nextLine(); //kodu-ja võõrsilmeeskonna nimed
        ArrayList<Sport> games = readFiles(file); //static meetodis olevad andmed - file tähendab üht variable'i

        ArrayList<Sport> gameWins = new ArrayList<>(); //uus Array, millelt võidunumbrid kätte saab.

        for (Sport sport : games) { //loen static meetodilt andmeid....a'la [0,1... jne)
            if (team.equals(sport.getHomeTeam()) || team.equals(sport.getAwayTeam())) {//kui sisestatud/kirj tiim võrdub kodu- või võõrsilmeeskonnaga // ehk homeTeam ja awayTeam [0,1)
                gameWins.add(sport);  //lisan gameWins ArrayListi leitud tiimi arvu     
            }
        }
        System.out.println("Games: " + gameWins.size()); //prindin ArrayList gameWins'i arvu, mis on ühtlasi tiimi meeskonna mängitud arv

        int wins = 0; //võitude arv on hetkel 0
        for (Sport sport : gameWins) { //loon for-each loop'i, et saada teada võidetud ja kaotatud mängude arvu.
            if (sport.isWinner(team)) { //kontrollin class'is koostatud boolean'i tõepärasust. (sulgudes kasutaja poolt sisesatatud tiim). 
                wins++;
            }

        }
        System.out.println("Wins: " + wins); //võitude arv.
        System.out.println("Losses: " + (gameWins.size() - wins)); //ArrayListi suurus - võitude arv = kaotuste arv.

    }

    public static ArrayList<Sport> readFiles(String file) { //koostan meetodi, millelt returnida
        ArrayList<Sport> games = new ArrayList<>(); //koostan ArrayListi, millelt andmeid main meetodisse edasi anda.
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) { //loen ühe rea
                String[] files = scanner.nextLine().split(","); //edastan variable'ile kõik failis olevad read.
                String homeTeam = files[0]; //kodumeeskonna nimekiri
                String awayTeam = files[1]; //võõrsilmeeskonna nimekiri
                int homePoints = Integer.valueOf(files[2]); //kodumeeskonna punktid
                int awayPoints = Integer.valueOf(files[3]); //võõrsilmeeskonna punktid
                games.add(new Sport(homeTeam, awayTeam, homePoints, awayPoints)); //lisan andmed ArrayListi //[0,1,2,3,4)

            }
        } catch (Exception e) {
            System.out.println("Error.");

        }

        return games; //tagastan meetodi andmed main-meetodisse.
    }

}
