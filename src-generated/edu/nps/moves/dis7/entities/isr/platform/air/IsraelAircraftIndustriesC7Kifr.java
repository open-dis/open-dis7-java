package edu.nps.moves.dis7.entities.isr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6bb2d00b;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 18182
 */
public class IsraelAircraftIndustriesC7Kifr extends EntityType
{
    /** Default constructor */
    public IsraelAircraftIndustriesC7Kifr()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 18180, Fighter/Air Defense
        setSubCategory((byte)2); // uid 18182, Israel Aircraft Industries C-7 Kifr
    }
}
