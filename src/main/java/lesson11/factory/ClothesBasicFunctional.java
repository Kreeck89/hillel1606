package lesson11.factory;

import lesson11.model.Clothes;

public interface ClothesBasicFunctional {
    Clothes create(int type);

    void utilization(Clothes clothes);
}
