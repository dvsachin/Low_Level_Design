package Design_Patterns.Structural_Patterns.CompositePattern.AmazonDeliveryPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompositeBox implements Box{
    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes) {
        children.addAll(Arrays.asList(boxes));
    }
    @Override
    public double calculatePrice() {
        return children.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();
    }

}
