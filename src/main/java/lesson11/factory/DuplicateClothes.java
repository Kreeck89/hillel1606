package lesson11.factory;

import lesson11.model.Clothes;

public interface DuplicateClothes {
    Clothes[] createClothes(int type, int value);
}
