package edu.nps.moves.dis7.entities.usa.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@2a8a3ada;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 11230
 */
public class RaytheonPilatusPC9MkIIBeechMkII1 extends EntityType
{
    /** Default constructor */
    public RaytheonPilatusPC9MkIIBeechMkII1()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)40); // uid 11205, Trainer
        setSubCategory((byte)13); // uid 11230, Raytheon / Pilatus PC-9 Mk II (Beech Mk II)
    }
}
