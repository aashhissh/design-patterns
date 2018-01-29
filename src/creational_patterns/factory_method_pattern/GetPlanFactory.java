package creational_patterns.factory_method_pattern;

import com.sun.istack.internal.NotNull;

public class GetPlanFactory {

    public Plan getPlan(@NotNull String type) {

        switch (type.trim().toLowerCase()) {
            case "domestic":
                return new DomesticPlan();
            case "commercial":
                return new CommercialPlan();
            case "institutional":
                return new InstitutionalPlan();
        }

        return null;
    }

}
