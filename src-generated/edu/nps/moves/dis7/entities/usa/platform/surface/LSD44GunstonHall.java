package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@24c685e7;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11645
 */
public class LSD44GunstonHall extends EntityType
{
    /** Default constructor */
    public LSD44GunstonHall()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 11640, Dock Landing Ship
        setSubCategory((byte)1); // uid 11641, Whidbey Island Class
        setSpecific((byte)4); // uid 11645, LSD 44 Gunston Hall
    }
}
