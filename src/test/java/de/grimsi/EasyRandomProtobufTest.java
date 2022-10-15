package de.grimsi;

import com.igdb.proto.Igdb;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    EasyRandom easyRandom = new EasyRandom();

    @Test
    void main() {
        easyRandom.nextObject(Igdb.InvolvedCompany.class);
    }
}
