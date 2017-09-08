package pl.sda.poznan.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PriceChangedEventArgs {
    private Double oldPrice;
    private Double newPrice;
}
