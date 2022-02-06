package lesson2;

public class switchMetod {
    public static void main(String[] args) {
       final int SEASON_NUMBER = 4;
        convertSeasonSwich(SEASON_NUMBER);
    }

    private static void convertSeasonSwich(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "Winter";
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };
       /* switch (seasonNumber) { // старая версия свича
            case 1:
                season = "Winter";
                break;
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default:
                season = "Unknown season";
        }*/
        System.out.println(season);
    }
}
