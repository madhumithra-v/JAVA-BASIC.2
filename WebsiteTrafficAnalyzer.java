import java.util.*;

public class WebsiteTrafficAnalyzer {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("      WEBSITE TRAFFIC & USER ACTIVITY ANALYZER");
        System.out.println("==================================================\n");

        System.out.println("Date : 13-06-2026\n");

        int totalUsers = 250;

        // Page Visit Data
        HashMap<String, Integer> pageVisits = new HashMap<>();

        pageVisits.put("Home", 250);
        pageVisits.put("About", 180);
        pageVisits.put("Products", 210);
        pageVisits.put("Services", 165);
        pageVisits.put("Contact", 95);
        pageVisits.put("Team", 70);
        pageVisits.put("Blog", 140);

        System.out.println("TOTAL USERS VISITED TODAY : " + totalUsers);

        System.out.println("\n--------------------------------------------------");
        System.out.println("PAGE VISIT STATISTICS");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %s\n", "Page Name", "Visits");
        System.out.println("--------------------------------");

        int totalPageViews = 0;

        for (Map.Entry<String, Integer> entry : pageVisits.entrySet()) {
            System.out.printf("%-15s %d\n",
                    entry.getKey(),
                    entry.getValue());

            totalPageViews += entry.getValue();
        }

        // Most & Least Visited Page
        String mostVisitedPage = "";
        String leastVisitedPage = "";

        int maxVisits = Integer.MIN_VALUE;
        int minVisits = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : pageVisits.entrySet()) {

            if (entry.getValue() > maxVisits) {
                maxVisits = entry.getValue();
                mostVisitedPage = entry.getKey();
            }

            if (entry.getValue() < minVisits) {
                minVisits = entry.getValue();
                leastVisitedPage = entry.getKey();
            }
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("MOST VISITED PAGE");
        System.out.println("--------------------------------------------------");
        System.out.println("Page : " + mostVisitedPage);
        System.out.println("Visits : " + maxVisits);

        System.out.println("\n--------------------------------------------------");
        System.out.println("LEAST VISITED PAGE");
        System.out.println("--------------------------------------------------");
        System.out.println("Page : " + leastVisitedPage);
        System.out.println("Visits : " + minVisits);

        System.out.println("\n--------------------------------------------------");
        System.out.println("TOTAL PAGE VIEWS");
        System.out.println("--------------------------------------------------");
        System.out.println(totalPageViews + " Page Views");

        double averageViews =
                (double) totalPageViews / totalUsers;

        System.out.println("\n--------------------------------------------------");
        System.out.println("AVERAGE PAGES VIEWED PER USER");
        System.out.println("--------------------------------------------------");
        System.out.printf("%.2f Pages/User\n", averageViews);

        // Top 3 Pages
        List<Map.Entry<String, Integer>> topPages =
                new ArrayList<>(pageVisits.entrySet());

        topPages.sort((a, b) ->
                b.getValue().compareTo(a.getValue()));

        System.out.println("\n--------------------------------------------------");
        System.out.println("TOP 3 PAGES");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    (i + 1) + ". "
                            + topPages.get(i).getKey()
                            + " - "
                            + topPages.get(i).getValue()
                            + " Visits");
        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("USER NAVIGATION ANALYSIS");
        System.out.println("--------------------------------------------------");

        System.out.println("Home -> Products : 120 Users");
        System.out.println("Home -> About : 80 Users");
        System.out.println("Products -> Services : 95 Users");
        System.out.println("About -> Contact : 60 Users");

        System.out.println("\nMost Common Path:");
        System.out.println("Home -> Products -> Services");

        int bouncedUsers = 40;
        double bounceRate =
                ((double) bouncedUsers / totalUsers) * 100;

        System.out.println("\n--------------------------------------------------");
        System.out.println("BOUNCE RATE ANALYSIS");
        System.out.println("--------------------------------------------------");
        System.out.println("Users Who Left After One Page : "
                + bouncedUsers);
        System.out.printf("Bounce Rate : %.0f%%\n",
                bounceRate);

        int activeUsers = 32;

        System.out.println("\n--------------------------------------------------");
        System.out.println("ACTIVE USERS");
        System.out.println("--------------------------------------------------");
        System.out.println("Current Online Users : "
                + activeUsers);

        System.out.println("\n--------------------------------------------------");
        System.out.println("WEBSITE PERFORMANCE REPORT");
        System.out.println("--------------------------------------------------");

        System.out.println("Total Users           : "
                + totalUsers);

        System.out.println("Total Page Views      : "
                + totalPageViews);

        System.out.println("Most Visited Page     : "
                + mostVisitedPage);

        System.out.println("Least Visited Page    : "
                + leastVisitedPage);

        System.out.printf("Average Views/User    : %.2f\n",
                averageViews);

        System.out.printf("Bounce Rate           : %.0f%%\n",
                bounceRate);

        System.out.println("\nWebsite Status : HEALTHY");

        System.out.println("==================================================");
        System.out.println("ANALYSIS COMPLETED SUCCESSFULLY");
        System.out.println("==================================================");
    }
}