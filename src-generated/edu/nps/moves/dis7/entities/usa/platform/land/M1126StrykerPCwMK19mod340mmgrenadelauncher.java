package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@542f6803;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 10133
 */
public class M1126StrykerPCwMK19mod340mmgrenadelauncher extends EntityType
{
    /** Default constructor */
    public M1126StrykerPCwMK19mod340mmgrenadelauncher()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 10067, Armored Fighting Vehicle
        setSubCategory((byte)5); // uid 10115, Light Armored Vehicle (LAV) Stryker
        setSpecific((byte)18); // uid 10133, M1126 Stryker PC w/MK 19 mod 3 40-mm grenade launcher
    }
}
