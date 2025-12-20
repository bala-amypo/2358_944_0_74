@Entity
public class RouteOptimizationResult {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Shipment shipment;

    private Double optimizedDistanceKm;
    private Double estimatedFuelUsage;

    private LocalDateTime generatedAt;
}
