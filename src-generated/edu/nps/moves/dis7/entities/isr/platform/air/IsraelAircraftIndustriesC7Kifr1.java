package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@23d1e5d0;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18203
 */
public class IsraelAircraftIndustriesC7Kifr1 extends EntityType
{
    /** Default constructor */
    public IsraelAircraftIndustriesC7Kifr1()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 18202, Trainer
        setSubCategory((byte)1); // uid 18203, Israel Aircraft Industries C-7 Kifr
    }
}
