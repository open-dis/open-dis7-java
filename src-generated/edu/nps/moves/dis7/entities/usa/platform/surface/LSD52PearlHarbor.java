package edu.nps.moves.dis7.entities.usa.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@420a8042;
 * Country: United States of America (USA);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 11653
 */
public class LSD52PearlHarbor extends EntityType
{
    /** Default constructor */
    public LSD52PearlHarbor()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)9); // uid 11640, Dock Landing Ship
        setSubCategory((byte)1); // uid 11641, Whidbey Island Class
        setSpecific((byte)12); // uid 11653, LSD 52 Pearl Harbor
    }
}
