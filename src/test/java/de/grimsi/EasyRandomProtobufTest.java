package de.grimsi;

import com.igdb.proto.Igdb;
import org.jeasy.random.EasyRandom;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyRandomProtobufTest {

    EasyRandom easyRandom = new EasyRandom();

    @Test
    void thisTestWillFail() {
        easyRandom.nextObject(Igdb.InvolvedCompany.class);
    }
}
