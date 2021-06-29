package lesson2.functionalInterface;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class SummarizeClients {
    public static void main(String[] args) {

        List<UdacisearchClient> clients = ClientStore.getClients();
        int numClients = clients.size();
        int totalQuarterlySpend =
                clients
                        .stream()
                        .mapToInt(UdacisearchClient::getQuarterlyBudget)
                        .sum();

        double averageBudget =
                clients
                        .stream()
                        .mapToDouble(UdacisearchClient::getQuarterlyBudget)
                        .average()
                        .orElse(0);

        long nextExpiration =
                clients
                        .stream()
                        .min(Comparator.comparing(UdacisearchClient::getContractEnd))
                        .map(UdacisearchClient::getId)
                        .orElse(-1L);

        List<ZoneId> representedZoneIds =
                clients
                        .stream()
                        .flatMap(c -> c.getTimeZones().stream())
                        .distinct()  // Or use Collectors.toSet()
                        .collect(Collectors.toList());

        Map<Year, Long> contractsPerYear =
                clients
                        .stream()
                        .collect(Collectors.groupingBy(SummarizeClients::getContractYear, Collectors.counting()));

        System.out.println("Num clients: " + numClients);
        System.out.println("Total quarterly spend: " + totalQuarterlySpend);
        System.out.println("Average budget: " + averageBudget);
        System.out.println("ID of next expiring contract: " + nextExpiration);
        System.out.println("Client time zones: " + representedZoneIds);
        System.out.println("Contracts per year: " + contractsPerYear);
    }

    private static Year getContractYear(UdacisearchClient client) {
        LocalDate contractDate =
                LocalDate.ofInstant(client.getContractStart(), client.getTimeZones().get(0));
        return Year.of(contractDate.getYear());
    }
}
