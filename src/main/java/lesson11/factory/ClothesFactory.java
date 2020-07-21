package lesson11.factory;

import lesson11.model.Clothes;
import lesson11.model.Dress;
import lesson11.model.Shirt;

public class ClothesFactory implements DuplicateClothes, ClothesBasicFunctional {
    private final int SHIRT_TYPE = 1;
    private final int DRESS_TYPE = 2;

    @Override
    public Clothes[] createClothes(int type, int value) {
        Clothes[] clothes = new Clothes[value];
        for (int i = 0; i < value; i++) {
            clothes[i] = create(type);
        }
        return clothes;
    }

    @Override
    public Clothes create(int type) {
        if (type == SHIRT_TYPE) {
            return new Shirt();
        } else if (type == DRESS_TYPE) {
            return new Dress();
        }
        return null;
    }

    @Override
    public void utilization(Clothes clothes) {
        clothes = null;
    }
}
